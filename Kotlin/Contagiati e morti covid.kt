fun main () {
    /*Data una popolazione iniziale di contagiati COVID, sapendo che tale popolazione cresce ogni giorno con un certo
     tasso maggiore di 1, calcolare il numero di contagiati trascorsi di un certo numero di giorni.*/

    //dichiarazione
    var contagiIniziali: Double
    var tassoDiCrescita: Double
    var giorniTrascorsi: Double
    var percentualeDecessiGiornalieri: Double
    val percentualeDiCrescita: Double
    val mortiAlGiorno: Double
    var contagiAlGiorno: Double
    var nuoviContagi: Double = 0.0
    var nuoviMorti: Double = 0.0
    val contagi: Double

    //input
    do {
        println("Inserisci il numero iniziale di contagiati")
        contagiIniziali = readLine()?.toDouble()?: 1.0
    } while (contagiIniziali < 1)
    do {
        println("inserisci un tasso di crescita")
        tassoDiCrescita = readLine()?.toDouble()?: 1.1
    } while (tassoDiCrescita <= 1)
    do {
        println("Inserisci i giorni trascorsi")
        giorniTrascorsi = readLine()?.toDouble()?: 1.0
    } while (giorniTrascorsi < 1)
    do {
        println("Inserisci la percentuale dei decessi giornalieri")
        percentualeDecessiGiornalieri = readLine()?.toDouble()?: 0.0
    } while (percentualeDecessiGiornalieri < 0)

    //buisness logic
    percentualeDiCrescita = (tassoDiCrescita - 1) * 100
    contagiAlGiorno = (contagiIniziali * percentualeDiCrescita) / 100

    mortiAlGiorno = (contagiAlGiorno * percentualeDecessiGiornalieri) / 100

    var i: Double = 0.0
    do {
        nuoviContagi += contagiAlGiorno

        nuoviMorti += mortiAlGiorno
        i++
    } while (i < giorniTrascorsi)

    contagi = nuoviContagi + contagiIniziali

    //outpout
    println("Dopo $giorniTrascorsi giorni i $contagiIniziali contagiati iniziali sono diventati $contagi e sono morte $nuoviMorti persone")

}