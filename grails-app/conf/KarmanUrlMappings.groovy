import org.springframework.context.ApplicationContext

class KarmanUrlMappings {

	static mappings = { ApplicationContext context ->
<<<<<<< HEAD
		// def config = getGrailsApplication().config.grails.plugins.karman
=======

		// def config = context.grailsApplication.config.grails.plugins.karman
>>>>>>> 779e4e536008e5bb097e08024d1b86930077dea7
		// def serveLocalStorage = config.containsKey('serveLocalStorage') ? config.serveLocalStorage : true
		// def path = config.serveLocalMapping ?: 'storage'
		
		// if(serveLocalStorage) {
		// 	"/$path/$directory/$id**" (
		// 		controller: 'localStorage',
		// 		plugin: 'karman',
		// 		action: 'show'
		// 	)
		// 	"/$path/$id**" (
		// 		controller: 'localStorage',
		// 		plugin: 'karman',
		// 		action: 'show'
		// 	)
		// }
		
	}
}
