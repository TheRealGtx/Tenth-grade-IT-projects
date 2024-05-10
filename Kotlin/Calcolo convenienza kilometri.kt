fun main () {
    /*Luigi deve noleggiare un’auto per un viaggio di lavoro. Sapendo che può scegliere tra due soluzioni: soluzione A:
    noleggio a chilometri illimitati con un costo pari a 100 euro/giorno soluzione B: noleggio con un costo di 75
    euro/giorno più 0,10 euro per ogni chilometro percorso. Aiuta Luigi a scegliere la soluzione per lui più economica*/

    //Dichiarazione
    var giorni: Double
    var kilometri: Double
    val soluzioneA: Double
    var soluzioneB: Double
    val costoFissoAlGiornoA: Double = 100.0
    val costoFissoAlGiornoB: Double = 75.0
    val costoKilometri: Double
    val prezzoAlKilometro: Double = 0.10

    //Input
    do {
        println("Inserisci la durata in giorni del viaggio")
        giorni = readLine()?.toDouble()?: 1.0
    } while (giorni < 1)
    do {
        println("Inserisci la distanza in kilometri da percorrere")
        kilometri = readLine()?.toDouble()?: 1.0
    } while (kilometri < 1)

    //Buisness logic
    soluzioneA = costoFissoAlGiornoA * giorni
    soluzioneB = costoFissoAlGiornoB * giorni
    costoKilometri = prezzoAlKilometro * kilometri
    soluzioneB += costoKilometri

    //Outpout
    if (soluzioneA > soluzioneB) {
        println("La soluzione B ($soluzioneB€) è più economica della soluzione A ($soluzioneA€)")
    } else {
        if (soluzioneB > soluzioneA) {
            println("La soluzione A ($soluzioneA€) è più economica della soluzione B ($soluzioneB€)")
        } else {
            println("Entrambe le soluzioni sono convenienti ($soluzioneA€)")
        }
    }

}