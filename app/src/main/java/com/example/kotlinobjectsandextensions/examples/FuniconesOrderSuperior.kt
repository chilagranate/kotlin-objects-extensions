package com.example.kotlinobjectsandextensions.examples

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)



fun main(){
    cookies.forEach{
        println("Menu item ${it.name}") //hay que usar lambda {} para acceder a las propiedades de la clase
    }


    val fullMenu = cookies.map { //es un bucle que convierte una lista en otra
        "${it.name} - $${it.price}"
    }
    fullMenu.forEach{ println(it) }


    val softBakedMenu = cookies.filter { //.filter es un bucle que filtra una lista con una condicion
        it.softBaked  //condicion para filtrar
    }
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }


    //crea un mapa donde las claves son las condiciones, en esta caso
    //true o false, y los valores son las cookies que cumplen esa condicion
    val groupedMenu = cookies.groupBy {it.softBaked}


    val softBakedMenu1 = groupedMenu[true] ?: listOf() //se usa ?: para evitar un null pointer exception
    val crunchyMenu = groupedMenu[false] ?: listOf()

    println("Soft cookies:")
    softBakedMenu1.forEach {
        println("${it.name} - $${it.price}")
    }
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }


    //.fold es un bucle que suma todos los valores de una lista. 0.0 es el valor inicial. Usa total para el acumulador y cookie para el elemento de la colección
    // la flecha -> va despues de la lista de parametros y antes de la expresion
    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }

    println("Total price: $${totalPrice}")

    val alphabeticalMenu = cookies.sortedBy { //ordeno la lista en orden alfabetico pasandole la propiedad que quiero ordenar
        it.name
    }

    alphabeticalMenu.forEach {println(it.name)}



}