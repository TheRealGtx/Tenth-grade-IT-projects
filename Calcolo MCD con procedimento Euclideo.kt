fun resto (numeroUno: Double, numeroDue: Double) : Double {
    return numeroUno % numeroDue
}

fun main () {
    //Calcolo MCD con procedimento Euclideo

    //Dichiarazione
    var primoNumero: Double
    var secondoNumero: Double
    var x: Double
    var y: Double
    var mcd: Double = 1.0

    //Input
    do {
        println("Inserisci il primo numero")
        primoNumero = readLine()?. toDouble()?: 1.0
    } while (primoNumero <= 0.0)
    do {
        println("Inserisci il secondo numero")
        secondoNumero = readLine()?. toDouble()?: 1.0
    } while (secondoNumero <= 0.0)

    //Business logic
    x = primoNumero
    y = secondoNumero
    do {
        var resto = resto(x, y)
        if (resto != 0.0) {
            x = y
            y = resto
        } else {
            mcd = y
        }
    } while (resto > 0.0)

    //Output
    println("Il MCD tra $primoNumero e $secondoNumero è $mcd")
}