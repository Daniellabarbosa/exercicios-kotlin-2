fun main () {


    var par = 0
    var impar = 0

    for (i in 0..10){

        println("Digite um {$i} número:")
        val num = readLine()!!.toInt()

        if (num %2 == 0){
            par ++
        } else{
            impar++
        }

    }
      println ("Foram digitados $par números PAR e $impar números IMPAR")

}