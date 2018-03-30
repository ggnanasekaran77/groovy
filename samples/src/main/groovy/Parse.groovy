#!/usr/bin/env groovy
import groovy.json.JsonSlurper

println("Hello World")

def jsonslurper = new JsonSlurper()
def object = jsonslurper.parseText('{"name" : "gnanam"}')

assert object instanceof Map
println("${object}")
assert object.name == 'gnanam'

def object2 = jsonslurper.parseText('{"mylist" : [1, 2, 3, 4, 5]}')
assert object2 instanceof Map
assert object2.mylist instanceof List
assert object2.mylist == [1, 2, 3, 4, 5]

def object3 = jsonslurper.parse('https://api.github.com/users/ggnanasekaran77/repos')

println(object3)