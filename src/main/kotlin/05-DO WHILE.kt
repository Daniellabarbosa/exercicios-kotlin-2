fun main () {


    var num = 0
    var soma = 0

    do{
        println("Digite um número:")
        num = readLine()!!.toInt()

        soma +=num

    }while (num != 0)

     println("O resultado da soma dos números digitados é: $soma")
}