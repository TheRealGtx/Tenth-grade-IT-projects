fun main () {
    val firstNumber : Double
    val secondNumber : Double

    //lettura
     println ("inserisci il primo numero")
    firstNumber = readLine()?. toDouble()?: 0.0

    println ("inserisci il primo numero")
    secondNumber = readLine()?. toDouble()?: 0.0

    //buisness logic
    val media : Double = (firstNumber + secondNumber) / 2

    println ("La media è $media")
}
