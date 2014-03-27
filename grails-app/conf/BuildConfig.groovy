grails.project.work.dir = 'target'

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {
    inherits 'global'
    log 'warn'
    legacyResolve false
    
    repositories {
        grailsCentral()
        mavenCentral()
        mavenRepo 'http://dl.bintray.com/karman/karman'

    }

    dependencies {
        compile 'com.bertramlabs.plugins:karman-core:0.5.1'
    }

    plugins {
        build ':tomcat:7.0.52.1'
        build(':release:3.0.1') {
            export = false
        }
    }
}
