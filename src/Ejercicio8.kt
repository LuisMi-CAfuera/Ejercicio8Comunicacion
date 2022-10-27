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

    //Funcion que me un nombre de 5 aleatorio
    fun Nombre():String{
        var nombre : String = " "
        var letras = arrayOf("a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z")
        var cont = 0

        while(cont<5){
            nombre += letras.random()
            cont++
        }

        return nombre
    }

}



fun main(){

    var personaje = Personaje()


    println("${personaje.clase},${personaje.nombre},${personaje.estado},")



}