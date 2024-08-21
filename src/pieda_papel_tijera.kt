import kotlin.random.Random

fun main() {
    var jugador1: Int
    var jugador2: Int

    var cont1: Int = 0
    var cont2: Int = 0

    while (cont1 < 2 && cont2 < 2) {
        jugador1 = Random.nextInt(1, 4)
        jugador2 = Random.nextInt(1, 4)

        when {
            jugador1 == 1 && jugador2 == 2 -> {
                println("Gana jugador 1 con Tijera contra papel")
                cont1++
            }
            jugador1 == 2 && jugador2 == 3 -> {
                println("Gana jugador 2 con Piedra contra Tijera")
                cont2++
            }
            jugador1 == 3 && jugador2 == 1 -> {
                println("Gana jugador 1 con Piedra contra Tijera")
                cont1++
            }
            jugador2 == 1 && jugador1 == 2 -> {
                println("Gana jugador 2 con Tijera contra Papel")
                cont2++
            }
            jugador2 == 2 && jugador1 == 3 -> {
                println("Gana jugador 1 con Piedra contra Papel")
                cont1++
            }
            jugador2 == 3 && jugador1 == 1 -> {
                println("Gana jugador 2 con Piedra contra Tijera")
                cont2++
            }
            else -> {
                println("Empate")
            }
        }

        println(" ")
        println("Puntaje - Jugador 1: $cont1, Jugador 2: $cont2")

    }
}



