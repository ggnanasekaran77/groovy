#!/usr/bin/env groovy
import groovy.json.JsonSlurper

String key = new File("E:\\Studies\\Repos\\bitbucket\\groovy\\samples\\src\\test\\resources\\hello.txt").text
String endPoint = 'https://api.flickr.com/services/rest?'

def params = [method: 'flickr.photos.search', api_key: key,
              format: 'json']

def qs = params.collect {k,v -> "$k=$v"}.join('&')


def repoApi = new URL ("https://api.github.com/users/ggnanasekaran77/repos").getText()

def fileParse = new JsonSlurper()

def reponame = fileParse.parseText(repoApi)

reponame.each {
    println(it.name)
}

