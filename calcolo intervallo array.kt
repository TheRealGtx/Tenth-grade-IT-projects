fun estraiIntervallo (inizioIntervallo: Int, fineIntervallo: Int, array: DoubleArray) {
    var i: Int = 0
    var j: Int = 1
    do {
        if (i >= inizioIntervallo && i <= fineIntervallo) {
            println("il $j numero dell'intervallo è ${array[i]}")
            j++
        }
        i++
    } while (i < array.size)
}

fun main () {
    //Dichiarazione
    var dimensioneArray: Int
    var i: Int = 0
    var inizioIntervallo: Int
    var fineIntervallo: Int

    //Input
    do {
        println("Inserisci la dimensione dell'array")
        dimensioneArray = readLine()?.toInt() ?: 1
    } while (dimensioneArray < 1)

    val array = DoubleArray(dimensioneArray)

    do {
        println("Inserisci il ${i + 1} numero dell'array")
        array[i] = readLine()?.toDouble()?: 0.0
        i++
    } while (i < dimensioneArray)

    do {
        println("Inserisci l'inizio dell'intervallo")
        inizioIntervallo = readLine()?.toInt()?: 0
    } while (inizioIntervallo < 0 && inizioIntervallo > dimensioneArray)

    do {
        println("Inserisci la fine dell'intervallo")
        fineIntervallo = readLine()?.toInt()?: 1
    } while (fineIntervallo < inizioIntervallo && fineIntervallo > dimensioneArray)

    //Business logic
    estraiIntervallo(inizioIntervallo, fineIntervallo, array)
}