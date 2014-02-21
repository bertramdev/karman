package com.bertramlabs.plugins.karman.local

class LocalStorageController {
	def grailsApplication

    def show() { 
    	def config      = grailsApplication.config.grails.plugins.karman
    	def storagePath = config.local.storagePath
		def provider    = new LocalStorageProvider(basePath: storagePath)
		def extension   = extensionFromURI(request.forwardURI)
		def directoryName = params.directory ?: '.'
		def fileName = params.id
        def format = servletContext.getMimeType(fileName)

        if(extension && !fileName.endsWith(".${extension}")) {
        	fileName = fileName + ".${extension}"
        }

        // No reverse traversal!
        if(request.forwardURI.contains('../') || request.forwardURI.contains('..\\')) {
        	render status: 402
        	return
        }

	    response.characterEncoding = request.characterEncoding
	    response.contentType = format
		response.outputStream << provider[directoryName][fileName].bytes
		response.flushBuffer()
    }

    private extensionFromURI(uri) {

        def uriComponents = uri.split("/")
        def lastUriComponent = uriComponents[uriComponents.length - 1]
        def extension
        if(lastUriComponent.lastIndexOf(".") >= 0) {
            extension = uri.substring(uri.lastIndexOf(".") + 1)
        }
        return extension
    }
}
