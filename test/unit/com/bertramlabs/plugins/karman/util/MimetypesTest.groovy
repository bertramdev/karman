package com.bertramlabs.plugins.karman.util

import spock.lang.Specification
import spock.lang.Unroll

class MimetypesTest extends Specification {

    @Unroll
    void "Getting #mimetype from #name"() {
        expect:
        Mimetypes.instance.getMimetype(name) == mimetype

        where:
        name        | mimetype
        'file.txt'  | 'text/plain'
        'file.html' | 'text/html'
        'file.css'  | 'text/css'
        'file.html' | 'text/html'
        'file.gif'  | 'image/gif'
        'file.png'  | 'image/png'
        'file.jpg'  | 'image/jpeg'
        'file.js'   | 'application/x-javascript'
        'file.gz'   | 'application/x-gzip'
    }

}
