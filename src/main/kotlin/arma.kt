open class ArmaDeFuego(
    private var nombre: String,
    var municion: Int,
    var municionARestar: Int,
    private var tipoDeMunicion: String,
    private var danio: Int,
    private var radio: String
) {

    init {
        require(radio == "Pequeño" || radio == "Amplio") {"El radio tiene que ser pequeño o amplio"}
    }

    open fun dispara(): Int {
        municion -= municionARestar
        return municion

    }

    open fun recarga(): Int {
        municion += 10
        return municion
    }

    override fun toString(): String {
        return "El arma de nombre: $nombre, con municion: $municion, tipo de municion: $tipoDeMunicion, daño: $danio y radio: $radio"
    }

}



class Pistola(
    nombre: String,
    municion: Int,
    municionARestar: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: String
): ArmaDeFuego(nombre,municion, municionARestar, tipoDeMunicion,danio,radio) {

    override fun dispara(): Int {
        municion -= (municionARestar * 1)
        return municion
    }

    override fun recarga(): Int {
        return super.recarga()
    }




}





class Rifle(
    nombre: String,
    municion: Int,
    municionARestar: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: String
): ArmaDeFuego(nombre,municion, municionARestar, tipoDeMunicion,danio,radio) {



    override fun dispara(): Int {
        municion -= (municionARestar * 2)
        return municion
    }

    override fun recarga(): Int {
        return super.recarga()
    }


}




class Bazooka(
    nombre: String,
    municion: Int,
    municionARestar: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: String
): ArmaDeFuego(nombre,municion, municionARestar, tipoDeMunicion,danio,radio) {



    override fun dispara(): Int {
        municion -= (municionARestar * 3)
        return municion
    }

    override fun recarga(): Int {
        return super.recarga()
    }


}


fun main() {

    val pistola1 = Pistola("Glock 17",5,1,"Ligera",20,"Pequeño")

    val rifle1 = Rifle("Rifle de cerrojo",8,1,"Pesada",40,"Amplio")

    val bazooka1 = Bazooka("RA PD 115169A",9,1,"Pesada",200,"Amplio")



}