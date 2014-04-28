import com.bertramlabs.plugins.karman.KarmanConfigHolder
import com.bertramlabs.plugins.karman.StorageProvider
import com.bertramlabs.plugins.karman.local.LocalStorageProvider

class KarmanGrailsPlugin {
    def version         = "0.5.2"
    def grailsVersion   = "2.0 > *"
    def title           = "Karman Plugin"
    def author          = "David Estes"
    def authorEmail     = "destes@bcap.com"
    def description     = 'Karman is a standardized / extensible interface plugin for dealing with various cloud services including Local and S3.'
    def documentation   = "http://bertramdev.github.io/karman"
    def license         = "APACHE"
    def organization    = [name: "Bertram Labs", url: "http://www.bertramlabs.com/"]
    def issueManagement = [ system: "GITHUB", url: "http://github.com/bertramdev/karman/issues" ]
    def scm             = [ url: "http://github.com/bertramdev/karman" ]
    def pluginExcludes  = [
    ]
    def developers      = [ [name: 'Brian Wheeler'] ]


    def doWithApplicationContext = { applicationContext ->
        def config = application.config.grails.plugins.karman
        StorageProvider.registerProvider(LocalStorageProvider)

        KarmanConfigHolder.config = config

    }
}
