//Calcolo del checksum nel codice ISBN

fun computeIsbnChecksum (ISBN: Int): Int {
    var cifraDaMoltiplicare: Int
    var divisione: Int = 100000000
    var moltiplicatore: Int = 10
    var somma: Int = 0
    var i: Int = 0
    var multiploDiUndici: Int = 0
    val checksum: Int

    do {
        cifraDaMoltiplicare = ISBN / divisione
        somma += (cifraDaMoltiplicare * moltiplicatore)
        divisione /= 10
        moltiplicatore -= 1
        i++
    } while (i < 9)

    do {
        multiploDiUndici += 11
    } while (multiploDiUndici < somma)

    checksum = multiploDiUndici - somma

    return checksum
}

fun main () {
    //Dichiarazione
    val ISBN: Int
    val checksum: Int

    //Input
    println("Inserisci il codice ISBN a 9 cifre")
    ISBN = readLine()?.toInt() ?: 111111111

    //Business logic
    checksum = computeIsbnChecksum(ISBN)

    //Output
    println("Il checksum del codice ISBN $ISBN vale $checksum")
}