#!/usr/bin/env groovy
println("Hello World")

def listener = { e ->
    println("Clicked on $e.source")
    assert e instanceof Closure
}
def isOdd = {int i -> i%2 != 0 }
assert isOdd(4) == false

def add = {a, b -> println "Sum of two Numbers $a + $b = " + (a + b) }
add(5,10)

def list1 = [1, 2, 3, 4, 5]
def list2 = [10, 20, 30, 40, 50]

def factor = 2
def printIt = {e -> println e * factor }
list1.each printIt
list2.each printIt

def sumList = {list ->
    def sum = 0
    list.each {
        sum = sum + it
    }
    println("sum of list : ${sum}" )
}

sumList.call(list2)