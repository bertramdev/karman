includeTargets << grailsScript("_GrailsInit")


target(initKarman: "Load Karman Config to Configuration Holder") {
    depends(compile, parseArguments)
    def karmanConfigHolder = classLoader.loadClass('com.bertramlabs.plugins.karman.KarmanConfigHolder')

    karmanConfigHolder.grailsApplication = grailsApp
    karmanConfigHolder.config = grailsApp.config.grails.plugins.karman

	event("KarmanConfig", [karmanConfigHolder])

}
