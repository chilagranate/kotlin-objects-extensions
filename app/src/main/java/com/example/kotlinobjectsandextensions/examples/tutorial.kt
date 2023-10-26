package com.example.kotlinobjectsandextensions.examples

class tutorial {

    fun arrays() {
        val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")

        //puedo crear un array sin especificar el tipo de variable solo usando arrayOf
        val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

        val solarSystem = rockPlanets + gasPlanets

        //imprimo 1x1 los elementos del array
        println(solarSystem[0])
        println(solarSystem[1])
        println(solarSystem[2])
        println(solarSystem[3])
        println(solarSystem[4])
        println(solarSystem[5])
        println(solarSystem[6])
        println(solarSystem[7])

        //escribo nuevo valor en el indice 3
        solarSystem[3] = "Little Earth"

        //si intento escribir en un indice que no existe, voy a tener un error "ArrayIndexOutOfBounds"
        solarSystem[8] = "Pluto"
    }

    fun lists(){
    // Una lista es una colección redimensionable y ordenada que, por lo general, se implementa
    // como un array que puede cambiar de tamaño. Cuando el array alcanza su capacidad máxima y
    // tratas de insertar un nuevo elemento, el array se copia en un nuevo array más grande.

        val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
        println(solarSystem.size)

        //se puede acceder a un elemento de la lista por su indice
        println(solarSystem[2])

        //se puede acceder a un elemento de la lista por su indice usando get
        println(solarSystem.get(3))

        //se puede buscar el indice de un elemento de la lista usando indexOf
        println(solarSystem.indexOf("Earth")) //devuelve 2, ya uqe esta ubicado en el indice 2

        println(solarSystem.indexOf("Pluto")) //devuelve -1 porque no existe


        for (planet in solarSystem){
            println(planet)
        }

        //creando una list de tipo mutable se puede modificar la lista, agregar o quitar objetos
        val mutableSolarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

        mutableSolarSystem.add("Pluto") //se puede agregar un elemento a la lista porque es mutable

        mutableSolarSystem.add(3, "Theia") //agrega un elemento en la posición 3

        mutableSolarSystem[3] = "Future Moon" //puedo modificar un elemento de la lista

        mutableSolarSystem.removeAt(9) //borro el elemento en la posición 9

        mutableSolarSystem.remove("Future Moon") //borro el elemento "Future Moon"

        println(mutableSolarSystem.contains("Pluto")) // devuelve boolean si existe o no el elemento

        println("Future Moon" in mutableSolarSystem) // tambien puedo usar el operador in para buscar un elemento


    }


    /* El beneficio de los conjuntos es garantizar la singularidad. Si estuvieras escribiendo un programa para hacer un seguimiento
    de los planetas recién descubiertos, un conjunto ofrecería una manera simple de comprobar si un planeta ya fue descubierto.
    Cuando hay grandes cantidades de datos, esto suele ser preferible a verificar si un elemento existe en una lista,
    lo que requiere la iteración de todos los elementos. */
    fun sets(){

        val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

        println(solarSystem.size) // muestra el tamaño del set

        solarSystem.add("Pluto")

        println(solarSystem.contains("Pluto")) // devuelve boolean si existe o no el elemento
        println("Pluto" in solarSystem) // tambien puedo usar el operador in para buscar un elemento

        solarSystem.remove("Pluto")
    }
}


fun maps(){
    // Un mapa es una colección de pares clave-valor.


    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println(solarSystem.size) // muestra el tamaño del set

    solarSystem["Pluto"] = 5 // agrego un elemento

    println(solarSystem["Pluto"]) // devuelve el valor del elemento osea 5

    println(solarSystem.get("Theia"))// devuelve null porque no existe

    solarSystem.remove("Pluto")// elimino el elemento clave-valor

    println(solarSystem["Jupiter"]) // devuelve 79
    solarSystem["Jupiter"] = 78 // modifico el valor del elemento
    println(solarSystem["Jupiter"]) // devuelve 78




}
