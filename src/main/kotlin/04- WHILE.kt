fun main (){


    var psi = 0
    var idade = 0
    var genero = 0

    var comp = 0
    var compPCalm = 0
    var comoNervM = 0
    var compAgressH = 0
    var compCalmO = 0
    var compNerv40 = 0
    var compCalm18 = 0




    while (comp <6) {

        println("Digite a sua idade:")
        idade = readLine()!!.toInt()

        println("Digite qual o seu genêro:")
        println("1- Feminino")
        println("2 - Masculino")
        println("3 - Outro")
        genero = readLine()!!.toInt()

        println("Você se considera uma pessoa...")
        println("1 - Calma")
        println("2 - Nervosa")
        println("3 - Agressiva")
       psi = readLine()!!.toInt()

        if (psi == 1) {
            compPCalm++
        }
        if (genero == 1 && psi == 2) {
            comoNervM++
        }
        if (genero == 2 && psi == 3) {
            compAgressH++
        }
        if (genero == 3 && psi == 1) {
            compCalmO ++
        }
        if (idade >= 40 && psi == 2) {
            compNerv40++
        }
        if (idade <= 18 && psi == 2) {
            compCalm18++
        }
        comp++
    }


    println("O número de pessoas calmas é: $compPCalm")
    println("O número de mulheres nervosas é: $comoNervM")
    println("O número de homens agressivos é $compAgressH")
    println("O número de outros calmos é $compCalmO")
    println("O número de pessoas nervosas com mais de 40 anos é $compNerv40")
    println("O número de pessoas calmas com menos de 18 anos é $compCalm18")


}


