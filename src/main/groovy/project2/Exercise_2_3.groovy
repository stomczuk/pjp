package project2

def apply(List list, Closure c) {
    list.collect { c(it) }
}

def myList = [1, 1, 2, 3, 4]

println "Lista: ${myList}"
println "Lista z elementami pomnożonymi przez 10: ${apply(myList, { it * 10 })}"
println "Lista z elementami podzielonymi przez 10: ${apply(myList, { it / 10 })}"
println "Lista z elementami do ktorych dodano 10: ${apply(myList, { it + 10 })}"

