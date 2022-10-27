public class EncriptarClase{
    //Este es el mismo ejercicio de encriptar que se usa aqui para los elfos y goblin
    fun control(text : String):String{
        val abc="abcdefghijklmnñopqrstuvwxyz"
        var cifrado = ""
        val rot = 13

        text.forEach {
            if(it.isLetter()){
                if(abc.indexOf(it)+rot<27){
                    cifrado += abc[abc.indexOf(it)+rot]
                }else{
                    if (abc.indexOf(it)+rot>=27){
                        cifrado += abc[abc.indexOf(it)+rot-27]
                    }
                }
            }
        }

        return cifrado

    }

}