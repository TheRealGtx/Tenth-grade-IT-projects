//Calcolare la somma dei primi n quadrati

fun quadrato (radice: Int) : Int {
    return radice * radice
}

fun main () {
    //dichiarazione
    var numeroQuadrati: Int
    var contatore: Int = 0
    var sommaQuadrati: Int = 0
    var i: Int = 0

    //Input
    do {
        println("Inserisci il numero di quadrati che vuoi calcolare")
        numeroQuadrati = readLine()?. toInt()?: 1
    } while (numeroQuadrati < 1)

    //business logic
    do {
        contatore++
        var quadrato = quadrato(contatore)
        sommaQuadrati += quadrato
        i++
    } while (i < numeroQuadrati)

    //output
    println("La somma dei primi $numeroQuadrati quadrati è $sommaQuadrati")
}