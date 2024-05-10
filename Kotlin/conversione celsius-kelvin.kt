fun main () {
    //dichiarazione
    val gradiCelsius : Double
    val valoreConversione : Double = 273.15
    //assegnazione
    println("Inserisci i gradi in Celsius")
    gradiCelsius = readLine()?. toDouble()?: 0.0

    //Calcolo
    val gradiKelvin : Double = gradiCelsius + valoreConversione

    //Outpout
    println("$gradiCelsius gradi celsius corrispondono a $gradiKelvin gradi Kelvin")
}
