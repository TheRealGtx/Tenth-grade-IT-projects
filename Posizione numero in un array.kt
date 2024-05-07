fun apparizioniNumero(array: DoubleArray, numeroDaTrovare: Double): Int {
    var apparizioni: Int = 0
    var i: Int = 0
    do {
        if (array[i] == numeroDaTrovare) {
            apparizioni++
        }
        i++
    } while (i < array.size)
    return apparizioni
}

fun trovaPosizioneNumero(array: DoubleArray, numeroDaTrovare: Double): IntArray {
    var apparizioni: Int = apparizioniNumero(array, numeroDaTrovare)
    var posizioneNumero = IntArray(apparizioni)
    var i = 0
    var j = 0

    do {
        if (array[i] == numeroDaTrovare) {
            posizioneNumero[j] = i
            j++
        }
        i++
    } while (i < array.size)

    return posizioneNumero
}

fun main () {
    //Dichiarazione
    var dimensioneArray: Int
    var i: Int = 0
    var numeroDaTrovare: Double
    var posizioneNumero: IntArray

    //Input
    do {
        println("Inserisci la dimensione dell'array")
        dimensioneArray = readLine()?.toInt()?: 1
    } while (dimensioneArray < 1)

    var array = DoubleArray(dimensioneArray)


    do {
        println("Inserisci un numero nell'array")
        array[i]= readLine()?.toDouble()?: 1.0
        i++
    } while (i < dimensioneArray)

    println("Inserisci il numero da trovare")
    numeroDaTrovare = readLine()?.toDouble()?: 1.0

    //Business logic
    posizioneNumero = trovaPosizioneNumero(array, numeroDaTrovare)
    i = 0

    //Output
    do {
        println("Il numero $numeroDaTrovare appare nell'array nella posizione ${posizioneNumero[i]}")
        i++
    } while (i < posizioneNumero.size)
}