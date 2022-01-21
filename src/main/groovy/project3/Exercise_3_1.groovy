package project3

def list1 = ['a', 'b', 'c']
def list2 = [1, 8, 23]

println "a)"
println "list1:"
list1.each { print "$it " }

println "\nlist2:"
list2.each { print "$it " }

def list11 = []
def list12 = []

println "\nb)"
list1.each { list11 << it * 2 }
list2.each { list12 << it * 2 }

println "list11: $list11"
println "list12: $list12"