grails.project.work.dir = 'target'

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {
    inherits 'global'
    log 'warn'
    legacyResolve false

    repositories {
        grailsCentral()
        mavenCentral()

    }

    dependencies {
        compile 'com.bertramlabs.plugins:karman-core:0.8.3'
    }

    plugins {
        build ':tomcat:7.0.52.1'
        build(':release:3.0.1') {
            export = false
        }
    }
}
