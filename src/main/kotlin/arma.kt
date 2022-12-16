open class ArmaDeFuego(
    var nombre: String,
    var municion: Int,
    var municionARestar: Int,
    var tipoDeMunicion: String,
    var danio: Int,
    var radio: String
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
        return "El arma de nombre: $nombre, con municion: $municion, tipo de municion: $tipoDeMunicion, danio: $danio y radio: $radio"
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

    val pistola1 = Pistola("Glock 17",6,1,"Ligera",20,"Pequeño")

    val rifle1 = Rifle("Rifle de cerrojo",18,1,"Pesada",40,"Amplio")

    val bazooka1 = Bazooka("Lanzacohetes",22,1,"Pesada",200,"Amplio")

    val armas: MutableList<ArmaDeFuego> = mutableListOf()

    armas.add(pistola1)

    armas.add(rifle1)

    armas.add(bazooka1)

    var armaAleatoria : ArmaDeFuego

    var contador = 0

    val disparoArmas = mutableMapOf<ArmaDeFuego,Int>()

    while(contador < 6) {
        contador += 1
        armaAleatoria = armas.random()
        disparoArmas[armaAleatoria] = armaAleatoria.dispara()
    }


    for(disparo in disparoArmas) {
        println(disparo)
    }

}