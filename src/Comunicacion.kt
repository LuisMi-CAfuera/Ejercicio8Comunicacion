

class Comunicacion {
    var respuesta: String = ""
    fun adolescente(nombre: String, raza: String) {
        if (raza == "Elfo" || raza == "elfo") {
            println("Dile algo")
            println("Si es una pregunta siempre como minimo tiene que tener un signo de interrogacion y para acabar di 'adios'")
            respuesta = readLine().toString()
            while (respuesta != "adios" || respuesta != "Adios"){
                if (respuesta == "¿Como estas?" || respuesta == "¿como estas?" || respuesta == "como estas?" || respuesta == "Como estas?") {
                    println(EncriptarClase().control("De Lujo"))
                } else {
                    if (respuesta == respuesta.toUpperCase()) {
                        println(EncriptarClase().control("Eh relajate"))
                    } else {
                        if (respuesta == respuesta.toUpperCase() && respuesta.contains("?")) {
                            println(EncriptarClase().control("Tranqui se lo que hago"))
                        } else {
                            if (respuesta.contains(nombre)) {
                                println(EncriptarClase().control("¿Que Pasa?"))
                            } else {
                                if (respuesta == "adios" || respuesta == "Adios") {
                                    println(EncriptarClase().control("Yo que se"))
                                }
                            }

                        }
                        }
                    }
                println("Dile algo")
                println("Si es una pregunta siempre como minimo tiene que tener un signo de interrogacion y para acabar di 'adios'")
                respuesta = readLine().toString()
            }
        }
    }
}