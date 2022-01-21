package project1

import static javax.swing.JOptionPane.showInputDialog

def numbersMap = ["0": "zero", "1": "jeden", "2": "dwa", "3": "trzy", "4": "cztery", "5": "pięć", "6": "sześć", "7": "siedem", "8": "osiem", "9": "dziewięć"]
def number = showInputDialog("Podaj liczbe calkowita:")
def numberList = []
(number =~ /\d/).each { numberList << numbersMap[it as String] }

println numberList.join(" - ")
