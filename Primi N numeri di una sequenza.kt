fun main () {
    //Generare i primi N valori della sequenza 1,3,2,4,3,5,…

    //Dichiarazione
    var numeroValori: Double
    var valore: Double = 1.0
    val ripetizione: Double
    var j: Double = 1.0

    //input
    do {
        println("Inserisci il numero di valori da generare")
        numeroValori = readLine()?.toDouble() ?: 1.0
    } while (numeroValori < 1)

    //buisness logic e Outpout
    ripetizione = numeroValori / 2
    println("il 1.0 valore vale 1.0")
    var i: Double = 1.0
    while (i < numeroValori) {

        valore += 2
        j++
        println("il $j valore vale $valore")
        i++

        if (i == numeroValori) {

        } else {
            valore -= 1
            j++
            println("il $j valore vale $valore")
            i++
        }
    }
}