open class ArmaDeFuego(
    private var nombre: String,
    private var municion: Int,
    private var municionARestar: Int,
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
        return super.dispara()
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
        return super.dispara()
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
        return super.dispara()
    }

    override fun recarga(): Int {
        return super.recarga()
    }


}


fun main() {





}