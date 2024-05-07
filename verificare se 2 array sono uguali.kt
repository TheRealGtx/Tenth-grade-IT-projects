import kotlin.system.exitProcess

//verificare se 2 array sono uguali

fun comparaNumeriArray (primoArray: IntArray,secondoArray: IntArray,dimensionePrimoArray: Int): Boolean {
    var i = 0
    var numeriUguali: Boolean
    do {
        if (primoArray[i] == secondoArray[i]) {
            numeriUguali = true
            i++
        } else {
            numeriUguali = false
            return numeriUguali
        }
    } while (i < dimensionePrimoArray)
    return numeriUguali
}

fun comparaDimensioneArray (dimensionePrimoArray: Int,dimensioneSecondoArray: Int): Boolean {
    val dimensioneUguale: Boolean
    if (dimensionePrimoArray == dimensioneSecondoArray) {
        dimensioneUguale = true
    } else {
        dimensioneUguale = false
        fermaProgramma()
    }
    return dimensioneUguale
}

fun fermaProgramma () {
    println("I due array non sono uguali")
    exitProcess(0)
}

fun main () {
    //dichiarazione
    var dimensionePrimoArray: Int
    var dimensioneSecondoArray:Int
    val numeriUguali: Boolean

    //Input
    do {
        println("Inserisci la dimensione del primo array")
        dimensionePrimoArray = readLine()?.toInt()?: 1
    } while (dimensionePrimoArray < 1)

    do {
        println("Inserisci la dimensione del secondo array")
        dimensioneSecondoArray = readLine()?.toInt()?: 1
    } while (dimensioneSecondoArray < 1)

    //Business logic
    comparaDimensioneArray(dimensionePrimoArray,dimensioneSecondoArray)

    //variabili di input
    val primoArray = IntArray(dimensionePrimoArray)
    val secondoArray = IntArray(dimensionePrimoArray)
    var i = 0
    var j = 1

    do {
        println("Inserisci il $j numero del primo array")
        primoArray[i] = readLine()?.toInt()?: 0
        i++
        j++
    } while (i < dimensionePrimoArray)

    i = 0
    j = 1

    do {
        println("Inserisci il $j numero del secondo array")
        secondoArray[i] = readLine()?.toInt()?: 0
        i++
        j++
    } while (i < dimensioneSecondoArray)

    //Business logic
    numeriUguali = comparaNumeriArray(primoArray, secondoArray,dimensionePrimoArray)

    //Output
    if (numeriUguali) {
        println("I due array sono uguali")
    } else {
        println("I due array non sono uguali")
    }
}