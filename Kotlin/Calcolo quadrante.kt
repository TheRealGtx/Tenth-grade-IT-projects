//Dato un punto nel piano cartesiano determinare in quale quadrante si trova

fun main() {
    val ascissaPunto: Double
    val ordinataPunto: Double
    val quadrante: Int
    val noQuadrante: Int = 0
    val quadranteUno: Int = 1
    val quadranteDue: Int = 2
    val quadranteTre: Int = 3
    val quadranteQuattro: Int = 4
    var noQuadranteVero : Boolean = false
    var quadranteUnoVero : Boolean = false
    var quadranteDueVero : Boolean = false
    var quadranteTreVero : Boolean = false
    var quadranteQuattroVero : Boolean = false

    //input

    println("inserisci l'ascissa")
    ascissaPunto = readLine()?.toDouble() ?: 0.0
    println("inserisci l'ordinata")
    ordinataPunto = readLine()?.toDouble() ?: 0.0

    //Business Logic

    if (ascissaPunto == 0.0 || ordinataPunto == 0.0) {
        quadrante = noQuadrante
    } else if (ascissaPunto > 0.0 && ordinataPunto > 0.0) {
        quadrante = quadranteUno
    } else if (ascissaPunto > 0.0 && ordinataPunto < 0.0) {
        quadrante = quadranteQuattro
    } else if (ascissaPunto < 0.0 && ordinataPunto > 0.0) {
        quadrante = quadranteDue
    } else {
        quadrante = quadranteTre
    }

    if (quadrante == noQuadrante) {
        noQuadranteVero = true

    } else if (quadrante == quadranteUno) {
        quadranteUnoVero = true

    } else if (quadrante == quadranteDue) {
        quadranteDueVero = true

    } else if (quadrante == quadranteTre) {
        quadranteTreVero = true

    } else {
        quadranteQuattroVero = true

    }

    //output

    if (noQuadranteVero == true) {
        println("I numeri inseriti non appartengono a nessun quadrante")

    } else if (quadranteUnoVero == true) {
        println("I numeri inseriti appartengono al primo quadrante")

    } else if (quadranteDueVero == true) {
        println("I numeri inseriti appartengono al secondo quadrante")

    } else if (quadranteTreVero == true) {
        println("I numeri inseriti appartengono al terzo quadrante")

    } else {
        println("I numeri inseriti appartengono al quarto quadrante")

    }

}