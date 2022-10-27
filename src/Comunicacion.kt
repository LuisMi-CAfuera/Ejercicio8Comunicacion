

class Comunicacion {
    var respuesta: String = ""
    fun adolescente(nombre: String, raza: String) {
        if (raza == "Elfo" || raza == "elfo") {
            do {
                println("Di algo")
                respuesta = readLine().toString()
                if (respuesta == "¿Como estas?" || respuesta == "¿como estas?"|| respuesta == "Como estas?" || respuesta == "como estas?") {
                    println(EncriptarClase().control("De lujo"))
                }else {
                    if (respuesta == respuesta.toUpperCase() && respuesta.contains("?") && respuesta != "ADIOS") {
                        println(EncriptarClase().control("Tranqui se lo que hago"))
                    } else {
                        if (respuesta == respuesta.toUpperCase() && respuesta != "ADIOS") {
                            println(EncriptarClase().control("Eh relajate"))
                        } else {
                            if (respuesta.contains(nombre)) {
                                println("${EncriptarClase().control("Que pasa")}?")
                            }else{
                                if(respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS"){
                                    println(EncriptarClase().control("Yo que se"))
                                }

                            }

                        }


                    }


                }

            }while (respuesta != "Adios" && respuesta != "adios" && respuesta != "ADIOS")
        }
    }
}