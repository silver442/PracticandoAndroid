package com.silver2.androidmaster

fun main(){
  ifInt()
}

fun ifMultipleOR(){
  var pet = "dog"
  var isHappy = true

  if (pet == "dog" || (pet == "gato" && isHappy)){
    println("Es un gato o un perro")
  }
}

fun ifMultiple(){
  var age = 18
  var parentPermission = false
  var imHappy = true

  if(age >= 18 && parentPermission && imHappy) {
    println("Puedo beber cerveza")
  }else{
    println("No puedo beber")
  }
}

fun ifInt(){
  var age = 18

  if(age >= 18){
    print("Beber cerveza")
  }else{
    println("Beber un jugo")
  }
}

fun ifBoolean(){
  var soyFeliz:Boolean = true

  //sin nada == true
  // con ! al principio == false

  if(!soyFeliz){
    println("Estoy triste :(")
  }
}

fun ifAnidado(){
  val animal = "dog"

  if(animal == "dog"){
    println("Es un perrito")
  }else if(animal == "cat"){
    println("es un gato")
  }else if(animal == "bird"){
    println("Es un pajaro")
  }else{
    println("No es uno de los animales esperados")
  }

}

fun ifBasico(){
  var name = "PabloChuh"

  if (name == "Silvestre"){
    println("Oye la variable name es Silvestre")
  }else{
    println("Este no es silvestre")
  }

}