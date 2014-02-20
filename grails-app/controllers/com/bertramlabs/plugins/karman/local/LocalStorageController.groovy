package com.bertramlabs.plugins.karman.local

class LocalStorageController {
	def grailsApplication

    def show() { 
    	def config      = grailsApplication.config.grails.plugins.karman
    	def storagePath = config.local.storagePath
		def provider    = new LocalStorageProvider(basePath: storaegPath)

		def directoryName = params.directory ?: '.'
		def fileName = params.id
        def format = servletContext.getMimeType(fileName)

	    response.characterEncoding = request.characterEncoding
	    response.contentType = format
		response.outputStream << provider[directoryName][fileName].bytes
		response.flushBuffer()
    }
}
