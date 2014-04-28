includeTargets << grailsScript("_GrailsInit")


target(initKarman: "Load Karman Config to Configuration Holder") {
    depends(compile, parseArguments)
    def karmanConfigHolder = classLoader.loadClass('com.bertramlabs.plugins.karman.KarmanConfigHolder')
    def storageProvider = classLoader.loadClass('com.bertramlabs.plugins.karman.StorageProvider')
    def localStorageProvider = classLoader.loadClass('com.bertramlabs.plugins.karman.local.LocalStorageProvider')
    storageProvider.registerProvider(localStorageProvider)
    karmanConfigHolder.config = grailsApp.config.grails.plugins.karman

	event("KarmanConfig", [karmanConfigHolder])

}
