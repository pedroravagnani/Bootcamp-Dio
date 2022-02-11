import java.util.*

fun main(args: Array<String>) {
    //Função inicial de menu da calculadora
    var sair=0
    var sel: Int

    while(sair==0) {
        println("Selecione uma opção: \n" +
                "1. Adição \n" +
                "2. Subtração \n" +
                "3. Divisão \n" +
                "4. Multiplicação \n" +
                "5. Sair\n" +
                "Seleção: ")
        sel = readLine()!!.toInt()
        if(sel==5){
           sair = 1
        }else {
            inserirNumeros(sel)
        }


    }
}

fun inserirNumeros(op:Int) {
    val reader = Scanner(System.`in`)
    var num1:Float
    var num2:Float
    var resultado:Float
    var mod:String
    println("Digite o Primeiro Número: ")
    num1 = reader.nextFloat()
    println("Digite o Segundo Número: ")
    num2 = reader.nextFloat()
    mod= when(op){
        1   -> "+"
        2   -> "-"
        3   -> "/"
        4   -> "*"
        else -> "Operação invalida!"
    }
    resultado= when(op){
        1   -> num1 + num2
        2   -> num1 - num2
        3   -> num1 / num2
        4   -> num1 * num2
        else -> {
            println("Erro de operação!")
            return
        }
    }
    println("\nO resultado de $num1 $mod $num2 é $resultado ")
}