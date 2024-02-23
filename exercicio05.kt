fun main(){
    println("Soma 10,5 + 10,3 = ${calculadora("soma")(10.5, 10.3)}")
}
 fun calculadora(tipo: String): (Double,Double) -> Double{
     return when(tipo){
         "soma" -> {num1:Double, num2: Double -> num1 + num2 }
         "subtracao" -> {num1, num2 -> num1 - num2}
         "multiplicacao" -> { num1, num2 -> num1 * num2}
         else -> {num1, num2 -> num1 /num2}
     }
 }