/*Date le coordinate di 2 punti, realizzare una funzione che calcola la distanza Euclidea. Successivamente realizzare
una seconda funzione che calcola la distanza tra un punto e l’origine e determinarne quindi la distanza di ciascuno dei
2 punti letti.*/

import java.util.zip.DeflaterOutputStream
import kotlin.math.pow
import kotlin.math.sqrt

fun formula (primox: Double, secondoX: Double, primoY: Double, secondoY: Double): Double {
    return sqrt((secondoX - primox).pow(2) + (secondoY - primoY).pow(2))
}

fun distanza1 (primox: Double, valoreAsse: Double = 0.0, primoY: Double): Double {
    return sqrt((primox - valoreAsse).pow(2) + (primoY - valoreAsse).pow(2))
}

fun distanza2 (secondoX: Double, valoreAsse: Double = 0.0, secondoY: Double): Double {
    return sqrt((secondoX - valoreAsse).pow(2) + (secondoY - valoreAsse).pow(2))
}

 fun main () {
    //Dichiarazione
    val x1: Double
    val x2: Double
    val y1: Double
    val y2: Double
    val valoreAsssi: Double = 0.0

    //Input
     println("Inserisci la coordinata X del primo punto")
     x1 = readLine()?.toDouble()?: 0.0

     println("Inserisci la coordinata Y del primo punto")
     y1 = readLine()?.toDouble()?: 0.0

     println("Inserisci la coordinata X del secondo punto")
     x2 = readLine()?.toDouble()?: 0.0

     println("Inserisci la coordinata Y del secondo punto")
     y2 = readLine()?.toDouble()?: 0.0

     //business logic
     val formula = formula(x1, x2, y1, y2)
     val distanza1= distanza1(x1, valoreAsssi, y1)
     val distanza2= distanza1(x2, valoreAsssi, y2)

     //Output
     println("La distanza tra i 2 punti è $formula, la distanza del primo punto dall' origine è $distanza1, e quella del secondo è $distanza2")
 }