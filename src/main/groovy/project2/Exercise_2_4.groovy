package project2

import static javax.swing.JOptionPane.showInputDialog

def getData(Class<?> clazz = String, Closure closure = {
    return true
}, Boolean err = false, String wrongList = "") {
    list = []
    err ? (val = showInputDialog(null, "Bledna lista. Podaj listę liczb jeszcze raz:", wrongList)) : (val = showInputDialog("Podaj listę liczb:"))

    if (val != null) {
        val.tokenize(" ").each {
            try {
                newVal = it.asType(clazz)
                if (closure(newVal)) {
                    list << newVal
                } else {
                    getData(clazz, closure, true, val)
                }
            } catch (Exception e) {
                getData(clazz, closure, true, val)
            }
        }
    }
    list
}

println getData(Integer) { it > 0 }     // liczby całkowite większe od 0
//println getData() { it.size() > 3 }  // słowa o długości większej od 3 (domyślny typ: String)
//println getData()                          // dowolne napisy (słowa)
//println getData(BigDecimal)         // dowolne liczby