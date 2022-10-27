import java.util.*

fun main(){

    var personaje = Personaje()


    println("${personaje.clase},${personaje.nombre},${personaje.estado}")

    println("¿Quieres que el personaje sea aleatorio? (S/N)")
    var respuesta = readLine().toString()

    if(respuesta == "S"){
        println("El personaje es ${personaje.clase},${personaje.nombre},${personaje.estado}")
    }else{
        println("¿Que clase quieres que sea?")
        personaje.clase = readLine().toString()
        println("¿Que nombre quieres que tenga?")
        personaje.nombre = readLine().toString()
        println("¿Que edad quieres que tenga?")
        personaje.estado = readLine().toString()
        println("El personaje es ${personaje.clase},${personaje.nombre},${personaje.estado}")
    }



}