fun main () {

    //dichiarazione
    var divisore: Int = 1
    var numero: Int
    var resto: Int
    var somma: Int = 0
    var numeroPerfetto: Boolean

    //Input
    do {
        println("Inserisci il numero da verificare")
        numero = readLine()?.toInt() ?: 1
    } while (numero < 1)

    //Business logic
    while (divisore < numero) {
        resto = numero % divisore
        if (resto == 0) {
            somma += divisore
        }
        divisore += 1
    }

    if (somma == numero) {
        numeroPerfetto = true
    } else {
        numeroPerfetto = false
    }

    //Output
    if (numeroPerfetto == true) {
        println("Il numero $numero è un numero perfetto")
    } else {
        println("Il numero $numero non è un numero perfetto")
    }

}