fun main () {
    //Dato un numero intero positivo ed una cifra determinare quante volte la cifra è presente nel numero

    //Dichiarazione
    var numero: Int
    var cifra: Int
    var resto: Int
    var numeroApparizioni: Int = 0
    var verificaCifra: Int = 0
    var N: Int

    //Input
    do {
        println("Inserisci un numero")
        numero = readLine()?. toInt() ?: 0
    } while (numero < 0)
    do {
        println("Inserisci una cifra")
        cifra = readLine()?. toInt()?: 0
    } while (cifra < 0 || cifra > 9)

    //Business logic
    N = numero
    do {
        verificaCifra = N - cifra
        resto = verificaCifra % 10
        if (resto == 0) {
            numeroApparizioni += 1
        }
        N /= 10
    } while (N > 0)

    //Output
    println("Nel numero $numero la cifra $cifra è ripetuta $numeroApparizioni volte")
}