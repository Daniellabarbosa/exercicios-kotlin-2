fun main () {


    var idade = 0
    var idadeMenor = 0
    var idadeMaior = 0

    while (idade != 99) {

        println("Digite a idade:")
        idade = readLine()!!.toInt()

        if (idade in 0..21) {
            idadeMenor++

        } else if (idade >= 50) {
            idadeMaior++

        }
    }
    println ("$idadeMenor tem menos de 21 anos de idade e $idadeMaior tem mais de 50 anos de idade")
}


