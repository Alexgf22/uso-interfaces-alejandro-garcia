interface ComportamientoArmas {
    var disparosDelObjeto: Int

    fun dispara(): String
}


class Bocadillo : ComportamientoArmas  {
    override var disparosDelObjeto: Int = 0

    override fun dispara(): String {
        disparosDelObjeto += 1
        return "Se ha realizado $disparosDelObjeto disparo\n"
    }



}


class Coche : ComportamientoArmas  {
    override var disparosDelObjeto: Int = 0

    override fun dispara(): String {
        disparosDelObjeto += 1
        return "Se ha realizado $disparosDelObjeto disparo\n"
    }


}



class Casa : ComportamientoArmas  {
    override var disparosDelObjeto: Int = 0

    override fun dispara(): String {
        disparosDelObjeto += 1
        return "Se ha realizado $disparosDelObjeto disparo\n"
    }

}





fun main() {

    val pistola2 = Pistola("Glock 22",6,1,"Ligera",20,"Pequeño")

    val rifle2 = Rifle("Rifle de mirilla",18,1,"Pesada",40,"Amplio")

    val bazooka2 = Bazooka("Bazooka",22,1,"Pesada",200,"Amplio")

    println("Pistola : ${pistola2.recarga()}")

    println("Rifle : ${rifle2.recarga()}")

    println("Bazooka : ${bazooka2.recarga()}")

    val objetosQueDisparan = mutableListOf<ComportamientoArmas>()

    //disparosAleatorios.add()

    var disparoRandom : ComportamientoArmas

    var contadorNuevo = 0

    var disparosAleatorios = mutableListOf<ComportamientoArmas>()


    //while(contadorNuevo < 6) {
        //contadorNuevo += 1
        //armaAleatoria = armas.random()
        //disparoArmas[armaAleatoria] = armaAleatoria.dispara()
    //}


    //for(disparo in disparoArmas) {
        //println(disparo)
    //}


}




