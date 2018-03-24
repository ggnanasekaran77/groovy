#!/usr/bin/env groovy
println "Hello World"
def firstname = "Homer"
def map = [:]
map."Simpson-${firstname}" = "Homer Simpson"

assert map.'Simpson-Homer' == "Homer Simpson"

println "map.Simpson-\"${firstname}\" = " + map."Simpson-${firstname}"