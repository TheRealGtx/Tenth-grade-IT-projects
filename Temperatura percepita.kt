//Calcolo della temperatura percepita

import kotlin.math.sqrt

fun formula (vento: Float, aria: Float): Float {
    return 0.045f * (7.1766f * sqrt(vento) + 10.45f - 0.5145f * vento) * (aria - 33) + 33
}

fun main () {

    //dichiarazione
    var velocitàVento: Float
    var temperaturaAria: Float
    val temperaturaPercepita: Float

    //Input
    do {
        println("Inserisci la velocità del vento in nodi (compresa tra 3 e 48)")
        velocitàVento = readLine()?.toFloat()?: 3f
    } while (velocitàVento < 3.0 || velocitàVento > 48.0)
    do {
        println("Inserisci la temperatura dell'aria in gradi centigradi (meno di 10)")
        temperaturaAria = readLine()?.toFloat()?: 0f
    } while (temperaturaAria > 10.0)

    //Business logic
    temperaturaPercepita = formula(velocitàVento, temperaturaAria)

    //Output
    println("La temperatura percepità è di $temperaturaPercepita°C")
}