interface ComportamientoArmas {

    fun dispara(): String


}


class Bocadillo(
    var municion: Int = 0
) : ComportamientoArmas  {
    var disparosDelObjeto: Int = 0

    override fun dispara(): String {
        disparosDelObjeto += 1
        return "Ha realizado $disparosDelObjeto disparo\n"
    }

    override fun toString(): String {
        return "El objeto bocadillo "
    }



}


class Coche(
    var municion: Int = 0
) : ComportamientoArmas  {
    var disparosDelObjeto: Int = 0

    override fun dispara(): String {
        disparosDelObjeto += 1
        return "Ha realizado $disparosDelObjeto disparo\n"
    }


    override fun toString(): String {
        return "El objeto coche "
    }


}



class Casa(
    var municion: Int = 0
) : ComportamientoArmas  {
    var disparosDelObjeto: Int = 0

    override fun dispara(): String {
        disparosDelObjeto += 1
        return "Ha realizado $disparosDelObjeto disparo\n"
    }


    override fun toString(): String {
        return "El objeto casa "
    }

}





fun main() {

    val coche1 = Coche()
    val casa1 = Casa()
    val bocadillo1 = Bocadillo()

    val pistola2 = Pistola("Glock 22",8,1,"Ligera",20,"Pequeño")
    val rifle2 = Rifle("Rifle de mirilla",20,1,"Pesada",40,"Amplio")
    val bazooka2 = Bazooka("Bazooka",26,1,"Pesada",200,"Amplio")


    val objetosQueDisparan = mutableListOf<ComportamientoArmas>()

    objetosQueDisparan.add(coche1)
    objetosQueDisparan.add(casa1)
    objetosQueDisparan.add(bocadillo1)

    objetosQueDisparan.add(pistola2)
    objetosQueDisparan.add(rifle2)
    objetosQueDisparan.add(bazooka2)

    var disparoRandom : ComportamientoArmas

    //var contadorNuevo = 0

    val disparosAleatorios = mutableMapOf<ComportamientoArmas,String>()


    for(paso in 1..6) {
        //contadorNuevo += 1
        disparoRandom = objetosQueDisparan.random()
        disparosAleatorios[disparoRandom] = disparoRandom.dispara()
    }


    for(disparo in disparosAleatorios) {
        println(disparo)
    }


}




