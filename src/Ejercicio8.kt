import java.util.*

fun main() {

    var personaje = Personaje()


    //Aqui te dejo elegir si quieres que el personaje sea aleatorio o lo crees tu
    println("¿Quieres que el personaje sea aleatorio? (S/N)")
    var respuesta = readLine().toString()

    if (respuesta == "S" || respuesta == "s" || respuesta == "Si" || respuesta == "si") {
        println("El personaje es ${personaje.clase},${personaje.nombre},${personaje.estado}")
    } else {
        personaje = personaje.crearPersonaje()
        println("El personaje es ${personaje.clase},${personaje.nombre},${personaje.estado}")
    }



    if (personaje.estado == "Adolescente" || personaje.estado == "adolescente") {
        Comunicacion().adolescente(personaje.nombre, personaje.clase)
    } /*else {
        if (personaje.estado == "Adulto" || personaje.estado == "adulto") {
            //Comunicacion().adulto(personaje.nombre, personaje.clase)
        } else {
            if (personaje.estado == "Anciano" || personaje.estado == "anciano")
                //Comunicacion().anciano(personaje.nombre, personaje.clase)
        }
    }*/
}