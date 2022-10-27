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

    //Funcion que me de un nombre del EldenRing(Por que me apetece) aleatorio de un array de 7  nombres
    fun Nombre():String{
        var nombre : String = " "
        var nombres = arrayOf("Gwyn","Gwyndolin","Gwynevere","Malenia","Melina","Ranni","Radagon")

        nombre = nombres.random()

        return nombre
    }

    fun crearPersonaje():Personaje{
        var personaje = Personaje()

        println("¿Que raza quieres que sea?(Elfo,Humano,Enano,Goblin o una que te inventes)")
        personaje.clase = readLine().toString()
        println("¿Que nombre quieres que tenga?(Si el personaje es un Elfo o un Goblin el nombre estara en elfico o goblin)")
        personaje.nombre = readLine().toString()
        println("¿Que edad quieres que tenga?(Adolescente,Adulto o Anciano)")
        personaje.estado = readLine().toString()

        return personaje
    }

}