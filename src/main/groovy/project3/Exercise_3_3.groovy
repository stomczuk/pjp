package project3

import java.text.SimpleDateFormat

def textToCheck = "aSDA 2013-04-22 FDA.F. 112 33-223--11 AFD 2233-12-13 2018-13-40 AAasd 1"

def matches = textToCheck =~ /[0-9]{4}-[0-9]{2}-[0-9]{2}/
def validated = matches.findAll({
    def valid = true
    try {
        def dateFormat = new SimpleDateFormat("yyyy-MM-dd")
        dateFormat.setLenient(false)
        dateFormat.parse(it)
    } catch (Exception e) {
        valid = false
    }
    valid
})

println validated