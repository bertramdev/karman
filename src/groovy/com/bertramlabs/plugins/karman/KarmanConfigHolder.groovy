package com.bertramlabs.plugins.karman


class KarmanConfigHolder {
	static config = [
		defaultFileACL: CloudFileACL.Private
	]
	
	static grailsApplication


	static void setConfig(configMap) {
		config += configMap
	}
}