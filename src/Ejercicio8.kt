import java.util.*

class Personaje{
    var nombre = "Pepito"
    var clase = Raza()
    var estado = "Vivo"

    constructor(nombre: String, ) {
        this.nombre = nombre
    }

    constructor(){

    }

    fun Raza():String{
        var raza : String = " "
        var razas = arrayOf("Elfo","Humano","Enano","Goblin")

        raza = razas.random()

        return raza
    }
}



fun main(){

    var personaje = Personaje("Pepito")


    println("${personaje.clase},${personaje.nombre},${personaje.estado},")



}