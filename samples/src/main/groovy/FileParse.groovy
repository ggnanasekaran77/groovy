#!/usr/bin/env groovy
import groovy.json.JsonSlurper

println("Hello World")

new File('repo.json') << new URL ("https://api.github.com/users/ggnanasekaran77/repos").getText()

String file = new File('repo.json').text

def fileParse = new JsonSlurper().parseText(file)

fileParse.each {
    println(it.name)
}
