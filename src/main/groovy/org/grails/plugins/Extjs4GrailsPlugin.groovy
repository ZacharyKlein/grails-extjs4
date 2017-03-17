package org.grails.plugins

import grails.plugins.*

class Extjs4GrailsPlugin extends Plugin {

    def grailsVersion = "3.1.0 > *"
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Grails Extjs4 Plugin"
    def author = "Matthias Hryniszak"
    def authorEmail = "padcom@gmail.com"
    def description = '''\
This plugin provides resources needed to create an Ext JS 4 RIA"
'''
    def profiles = ['web']
    def documentation = "http://grails.org/plugin/extjs4"
}
