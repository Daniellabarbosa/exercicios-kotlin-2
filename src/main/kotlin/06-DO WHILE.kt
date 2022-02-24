fun main (){


    var num = 0
    var soma = 0
    var cont = 0

    do {
        println("Digite um número:")
        num = readLine()!!.toInt()

        if (num  % 3 == 0){
            soma += num
            cont++
        }
    }while(num !=0)

    var media = soma /cont

    println("A médias dos número digitados múltiplos de três é: $media")
}