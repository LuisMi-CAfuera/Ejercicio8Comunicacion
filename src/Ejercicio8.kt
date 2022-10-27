import java.util.*

fun main(){

    var personaje = Personaje()


    //Aqui te dejo elegir si quieres que el personaje sea aleatorio o lo crees tu
    println("¿Quieres que el personaje sea aleatorio? (S/N)")
    var respuesta = readLine().toString()

    if(respuesta == "S" || respuesta == "s" || respuesta == "Si" || respuesta == "si"){
        println("El personaje es ${personaje.clase},${personaje.nombre},${personaje.estado}")
    }else{
        println("¿Que raza quieres que sea?(Elfo,Humano,Enano,Goblin o una que te inventes)")
        personaje.clase = readLine().toString()
        println("¿Que nombre quieres que tenga?(Si el personaje es un Elfo o un Goblin el nombre estara en elfico o goblin)")
        personaje.nombre = readLine().toString()
        println("¿Que edad quieres que tenga?(Adolescente,Adulto o Anciano)")
        personaje.estado = readLine().toString()
        println("El personaje es ${personaje.clase},${personaje.nombre},${personaje.estado}")
    }
    if(personaje.clase == "Elfo" || personaje.clase == "Goblin"){
        println("El personaje es un elfo")
    }

}