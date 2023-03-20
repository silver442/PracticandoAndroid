package com.silver2.androidmaster

fun main(){
  result("dddd")
}

fun result(value:Any){
  when(value){
    is Int -> value + value
    is String -> println(value)
    is Boolean -> if(value) print("holiwi")
  }
}

fun getSemester(month: Int) = when(month){
    in 1..6 -> "Primer Semestre"
    in 7..12 -> "Segundo Semestre"
    !in 1 .. 12 -> "Semestre no es válido"
     else -> "dawda"
  }

fun getTrimester(month:Int){
  when(month){
    1, 2, 3 -> println("Primer trimestre")
    4, 5, 6 -> println("Segundo Trimestre")
    7, 8, 9 -> println("Tercer trimestre")
    10, 11, 12 -> println("Cuarto Trimestre")
    else -> println("Trimestre no es válido")
  }
}

fun getMonth(month:Int){
  when(month){
    1 -> println("enero")
    2 -> println("febrero")
    3 -> println("marzo")
    4 -> println("abril")
    5 -> println("mayo")
    6 -> println("junio")
    7 -> println("julio")
    8 -> println("agosto")
    9 -> println("septiembre")
    10 -> println("octubre")
    11 -> {println("noviembre")
          println("Noviembre")
    }
    12 -> println("diciembre")
    else -> println("No es un mes válido")
  }
}
