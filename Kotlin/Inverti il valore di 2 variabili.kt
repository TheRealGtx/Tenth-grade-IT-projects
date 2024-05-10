fun main () {
    //Date 2 variabili invertirne i valori

    //dichiarazione
    var primaVariabile: Double
    var secondaVariable: Double
    var intermedia: Double

    //input
    println("Inserisci un valore")
    primaVariabile = readLine()?. toDouble()?: 0.0
    println("Inserisci un altro valore")
    secondaVariable = readLine()?. toDouble()?: 0.0

    //buisness logic
    intermedia = primaVariabile
    primaVariabile = secondaVariable
    secondaVariable = intermedia

    //outpout
    println("la prima variabile ora vale $primaVariabile e la seconda variabile $secondaVariable")
}