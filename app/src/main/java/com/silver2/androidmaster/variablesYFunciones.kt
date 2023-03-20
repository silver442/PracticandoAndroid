package com.silver2.androidmaster

val age:Int = 30
fun main(){
  showMyName()
  showMyAge(30)
  add(25, 76)
  val mySubtract = subtract(10, 5)
  println("La resta es $mySubtract")
}

//Funcion sin parametros
fun showMyName(){
  println("Me llamo Silvestre")
}

fun showMyAge(currentAge: Int=30){
  println("Tengo $currentAge años")
}

//Funcion con parametro de entrada
fun add(firstNumber:Int, secondNumber:Int){
    println(firstNumber + secondNumber)
}

//Funcion con parametro de salida
fun subtract(firstNumber:Int, secondNumber:Int):Int {
  return firstNumber - secondNumber
}

//Funcion de una sola linea, en donde devuelve la resta
fun subtractCool(firstNumber:Int, secondNumber:Int) = firstNumber - secondNumber

fun variableBoolean(){
  /*
* Variables Booleanas
*/
  //Boolean
  val booleanExample:Boolean = true
  val booleanExample2:Boolean = false
}

fun variableAlfaNumericas(){
  /*
* Variables alfaNumericas
*/

  //Char, solo soporta un caracter
  var charExample1:Char ='e'
  var charExample2:Char = '2'

  //String
  var stringExample:String = "Silvestre Hernandez"
}

fun variablesNumericas(){
  /*
* Variables Numericas
*/

  //Int -2,147,647 a 2,147,483,647
  var age2:Int = 30

  age2 = 29
  //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
  val example:Long = 30

  //Float sopotan números decimales
  val floatExample:Float = 30.5f

  //Double
  val doubleExample:Double = 3241.3123123

  println("Sumar: ")
  println(age + age2)

  println("restar")
  println(age - age2)

  println("Multiplicar")
  println(age * age2)

  println("Division")
  println(age/age2)

  println("Módulo")
  println(age%age2)
}