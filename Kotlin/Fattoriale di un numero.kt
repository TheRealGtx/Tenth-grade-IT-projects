fun main() {
    //calcolo del fattoriale di un numero

    //dichiarazione
    var numero: Int
    val valoreDiDeafult: Int = 1

    val fattoriale: Int

    //input
    do {
        println("Inserisci il numero")
        numero = readLine()?.toInt() ?: valoreDiDeafult
    } while (numero < 0)

    //buisness logic
    if (numero == 0) {
        fattoriale = 1
    } else {    //numero > 0
        var i: Int = 1
        var serieProdotti: Int = 1
        while (i <= numero) {
            serieProdotti *= i      //serieprodotti = serieprodotti * i
            i++      //i = i + 1
        }
        fattoriale = serieProdotti
    }

    //Outpout
    println("Il fattoriale di $numero vale $fattoriale")

}