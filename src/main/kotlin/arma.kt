interface ComportamientoArmas {
    fun dispara(): String

    fun recarga(): String

}


open class ArmaDeFuego (
    var nombre: String = "",
    var municion: Int,
    var municionARestar: Int,
    var tipoDeMunicion: String,
    var danio: Int,
    var radio: String = ""
) :ComportamientoArmas {

    init {
        require(radio == "Pequeño" || radio == "Amplio") {"El radio tiene que ser pequeño o amplio"}
    }

    var disparos = 0
    override fun dispara(): String {
        disparos += 1
        return "Se ha realizado $disparos disparo\n"
    }

    override fun recarga(): String {
        return "Se ha recargado el arma"
    }


    override fun toString(): String {
        return "El arma de nombre: $nombre, con municion: $municion, tipo de municion: $tipoDeMunicion, danio: $danio y radio: $radio"
    }



}



class Pistola(
    nombre: String = "",
    municion: Int,
    municionARestar: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: String = ""
): ArmaDeFuego(nombre,municion, municionARestar, tipoDeMunicion,danio,radio) , ComportamientoArmas {

    override fun dispara(): String {
        municion -= (municionARestar * 1)
        return super.dispara() + "La municion actual es $municion"
    }

    override fun recarga(): String {
        municion += 2
        return "La municion actual tras recargar es $municion"
    }


}





class Rifle(
    nombre: String = "",
    municion: Int,
    municionARestar: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: String = ""
): ArmaDeFuego(nombre,municion, municionARestar, tipoDeMunicion,danio,radio) , ComportamientoArmas {



    override fun dispara(): String {
        municion -= (municionARestar * 2)
        return super.dispara() + "La municion actual es $municion"
    }

    override fun recarga(): String {
        municion += 4
        return "La municion actual tras recargar es $municion"
    }




}




class Bazooka(
    nombre: String = "",
    municion: Int,
    municionARestar: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: String = ""
): ArmaDeFuego(nombre,municion, municionARestar, tipoDeMunicion,danio,radio) , ComportamientoArmas {



    override fun dispara(): String {
        municion -= (municionARestar * 3)
        return super.dispara() + "La municion actual es $municion"
    }

    override fun recarga(): String {
        municion += 6
        return "La municion actual tras recargar es $municion"
    }



}


fun main() {

    val pistola1 = Pistola("Glock 17",6,1,"Ligera",20,"Pequeño")

    val rifle1 = Rifle("Rifle de cerrojo",18,1,"Pesada",40,"Amplio")

    val bazooka1 = Bazooka("Lanzacohetes",22,1,"Pesada",200,"Amplio")

    println("Pistola: ${pistola1.recarga()}")

    println("Rifle: ${rifle1.recarga()}")

    println("Bazooka: ${bazooka1.recarga()}")

    val armas: MutableList<ArmaDeFuego> = mutableListOf()

    armas.add(pistola1)

    armas.add(rifle1)

    armas.add(bazooka1)

    var armaAleatoria : ArmaDeFuego

    var contador = 0

    val disparoArmas = mutableMapOf<ArmaDeFuego,String>()

    while(contador < 6) {
        contador += 1
        armaAleatoria = armas.random()
        disparoArmas[armaAleatoria] = armaAleatoria.dispara()
    }


    for(disparo in disparoArmas) {
        println(disparo)
    }

}




