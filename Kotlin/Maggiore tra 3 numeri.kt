fun main () {
    //Calcolo dei maggiore di 3 numeri

    //Dischiarazione
    val primoNumero: Double
    val secondoNumero: Double
    val terzoNumero: Double
    var piuGrande: Double = 0.0

    //Input
    println("Inserisci il primo numero")
    primoNumero = readLine()?. toDouble() ?: 0.0
    println("Inserisci il secondo numero")
    secondoNumero = readLine()?. toDouble() ?: 0.0
    println("Inserisci il terzo numero")
    terzoNumero = readLine()?. toDouble() ?: 0.0

    //Buisness logic
    if (primoNumero > secondoNumero){
         if (primoNumero > terzoNumero){
             piuGrande = primoNumero
         } else{
             piuGrande = terzoNumero
         }
    } else{
        if (secondoNumero > primoNumero){
            if (secondoNumero > terzoNumero){
                piuGrande = secondoNumero
            } else {
                piuGrande = terzoNumero
            }
        } else{
            piuGrande = primoNumero
        }
        }

    //Outpout
    println("Il numero più grande vale $piuGrande")

    }