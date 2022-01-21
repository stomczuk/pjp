package project3

def plnToEuroRatio = 4.30

def aText = "kot: 120.00 PLN pies: 150.50 PLN chomik: 10.50 PLN"
aText = aText.replaceAll(/(\d+\.?,?\d+) PLN/) { all, price ->
    String.format("%.2f", price.toBigDecimal() / plnToEuroRatio) + ' EUR'
}
println aText

