import java.util.*

class Personaje{
    var nombre = Nombre()
    var clase = Raza()
    var estado = Edad()

    constructor(nombre: String, clase: String, estado: String) {
        this.nombre = nombre
        this.clase = clase
        this.estado = estado
    }
    constructor()

    //Funcion que me diga que raza es aleatoriamente
    fun Raza():String{
        var raza : String = " "
        var razas = arrayOf("Elfo","Humano","Enano","Goblin")

        raza = razas.random()

        return raza
    }
    //Funcion que me diga si es adolescente,adulto o anciano aleatoriamente
    fun Edad():String{
        var edad : String = " "
        var edades = arrayOf("Adolescente","Adulto","Anciano")

        edad = edades.random()

        return edad
    }

    //Funcion que me de un nombre aleatorio de un array de 5
    fun Nombre():String{
        var nombre : String = " "
        var nombres = arrayOf("Jack","John","Jhonny","Jhon","Jhonathan")

        nombre = nombres.random()

        return nombre
    }

}



fun main(){

    var personaje = Personaje()


    println("${personaje.clase},${personaje.nombre},${personaje.estado},")



}