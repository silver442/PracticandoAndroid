package com.silver2.androidmaster

fun main(){
  var name:String ="Silvestre"
  var name2:String ="Silvestre"

  //Indice de 0-6
  //Tamaño 7
  val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

  println(weekDays.size)
  //Tamaños
  if (weekDays.size >= 8){
    println(weekDays[7])
  }else{
    println("No hay mas valores en el array")
  }

  weekDays[0] = "Feliz lunes"
  println(weekDays[0])

  //Bucles para array

  for (position in weekDays.indices){
//    println(weekDays[position])
  }

  for((position, value) in weekDays.withIndex()){
 //   println("La posicion $position, contiene $value")
  }

  for (weekDay in weekDays){
    println("Ahora es $weekDay")
  }
}