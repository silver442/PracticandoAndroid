package com.silver2.androidmaster

fun main(){
  mutablelist()
}

fun mutablelist(){
  var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
  weekDays.add(0, "Silvestre") //Añade un valor a la lista en la primera posicion
  println(weekDays)

  if (weekDays.isEmpty()){
    //No voy a pintar nada porque no hay
  }else{
    weekDays.forEach{println(it)  }
  }
  weekDays.last()

  for (item in weekDays){

  }
}

fun inmutablelist(){
  val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

//  println(readOnly.size)
 // println(readOnly)
//  println(readOnly[0])
//  println(readOnly.last())
//  println(readOnly.first())

  //Filtrar listas
 // val example = readOnly.filter { it.contains("a")  }
 // println(example)

  //Hacer un filtrado con forEach y Cambiar el nombre del it.
  readOnly.forEach { weekDay -> println(weekDay)  }
}