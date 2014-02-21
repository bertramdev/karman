import org.springframework.context.ApplicationContext

class AssetUrlMappings {

	static mappings = { ApplicationContext context ->
		// def path = context?.assetProcessorService?.assetMapping ?: 'assets'
		// if(context.)

		"/storage/$directory/$id**" (
			controller: 'localStorage',
			plugin: 'karman',
			action: 'show'
		)
		"/storage/$id**" (
			controller: 'localStorage',
			plugin: 'karman',
			action: 'show'
		)
	}
}
