package project1

import static javax.swing.JOptionPane.showInputDialog
import static javax.swing.JOptionPane.showMessageDialog

map = [:].withDefault { 0 }

while (true) {
    val = showInputDialog("Podaj produkt w formie: (produkt = cena) \nCancel - wyswietli podsumowanie:")

    if (val == null) break

    val = val.tokenize("=")

    if (val.size() == 2 && val[1].isNumber()) {
        map[val[0].trim()] += val[1].toBigDecimal()
    }
}

showMessageDialog(null, "Rezultat: $map")