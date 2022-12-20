interface ComportamientoArmas {
    var disparosDelObjeto: Int

    fun dispara(): String


}


class Bocadillo : ComportamientoArmas  {
    override var disparosDelObjeto: Int = 0

    override fun dispara(): String {
        disparosDelObjeto += 1
        return "Ha realizado $disparosDelObjeto disparo\n"
    }

    override fun toString(): String {
        return "El objeto bocadillo "
    }



}


class Coche : ComportamientoArmas  {
    override var disparosDelObjeto: Int = 0

    override fun dispara(): String {
        disparosDelObjeto += 1
        return "Ha realizado $disparosDelObjeto disparo\n"
    }


    override fun toString(): String {
        return "El objeto coche "
    }


}



class Casa : ComportamientoArmas  {
    override var disparosDelObjeto: Int = 0

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

    val objetosQueDisparan = mutableListOf<ComportamientoArmas>()

    objetosQueDisparan.add(coche1)
    objetosQueDisparan.add(casa1)
    objetosQueDisparan.add(bocadillo1)

    var disparoRandom : ComportamientoArmas

    var contadorNuevo = 0

    val disparosAleatorios = mutableMapOf<ComportamientoArmas,String>()


    while(contadorNuevo < 6) {
        contadorNuevo += 1
        disparoRandom = objetosQueDisparan.random()
        disparosAleatorios[disparoRandom] = disparoRandom.dispara()
    }


    for(disparo in disparosAleatorios) {
        println(disparo)
    }


}




