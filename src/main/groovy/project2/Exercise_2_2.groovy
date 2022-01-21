package project2

import static javax.swing.JOptionPane.showInputDialog

def getInts(Boolean err = false, String wrongList = "") {
    def list = []
    err ? (val = showInputDialog(null, "Bledna lista. Podaj listę liczb jeszcze raz:", wrongList)) : (val = showInputDialog("Podaj listę liczb:"))

    if (val != null) {
        val.tokenize(" ").each {
            it.isInteger() ? list << it.toInteger() : getInts(err = true, wrongList = val)
        }
    }
    list
}

println getInts()
