import java.util.*

fun main() {

    var personaje = Personaje()


    //Aqui te dejo elegir si quieres que el personaje sea aleatorio o lo crees tu
    println("¿Quieres que el personaje sea aleatorio? (S/N)")
    var respuesta = readLine().toString()

    if (respuesta == "S" || respuesta == "s" || respuesta == "Si" || respuesta == "si") {
        println("El personaje es ${personaje.raza},${personaje.nombre},${personaje.estado},${personaje.clase}")
    } else {
        personaje = personaje.crearPersonaje()
        println("El personaje es ${personaje.raza},${personaje.nombre},${personaje.estado},${personaje.clase}")
    }


    //Este if lo uso por que en la clase comunicacion tengo tres funciones una para cada tipo de estado
    if (personaje.estado == "Adolescente" || personaje.estado == "adolescente") {
        Comunicacion().adolescente(personaje.nombre, personaje.raza)
    } else {
        if (personaje.estado == "Adulto" || personaje.estado == "adulto") {
            Comunicacion().adulto(personaje.nombre, personaje.raza)
        } else {
            if (personaje.estado == "Anciano" || personaje.estado == "anciano")
                Comunicacion().anciano(personaje.nombre, personaje.raza)
        }
    }

    if (personaje.raza == "Elfo" || personaje.raza == "elfo" || personaje.raza == "Goblin" || personaje.raza == "Goblin") {
        println(EncriptarClase().control("Adios"))
    }
}