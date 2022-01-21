package project3

def pmap = [Groovy: ['Asia', 'Jan'],
            Grails: ['Asia', 'Jan', 'Stefan', 'Mirek'],
            Java  : ['Asia', 'Stefan', 'Mirek'],
            JEE   : ['Slawek', 'Stefan', 'Janusz']
]

println "a)\n"
pmap.each { println "${it.key}: ${it.value.size()}" }

println "\nb)\n"
pmap.findAll { it.value.size() > 2 }.each { println "${it.key}" }

println "\nc)"
pmap.each {
    key, value ->
        println "\n$key: "
        value.each { print "$it " }
}