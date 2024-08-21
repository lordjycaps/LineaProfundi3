import kotlin.random.Random

fun main() {
    val secuencia = mutableListOf<String>()
    var cont1: Int = 0
    val muerto: Int = 1

    while (cont1 < muerto) {
        val jugador1 = Random.nextInt(1, 7)
        val jugador2 = Random.nextInt(1, 7)
        val jugador3 = Random.nextInt(1, 7)
        val jugador4 = Random.nextInt(1, 7)
        val jugador5 = Random.nextInt(1, 7)

        if (jugador1 == 4) {
            println("------Muere Jugador 1-----")
            secuencia.add("Jugador 1: $jugador1")
            cont1 += 1
        } else {
            secuencia.add("Jugador 1: --$jugador1")
        }
        if (jugador2 == 4) {
            println("-----Muere Jugador 2-----")
            secuencia.add("Jugador 2 $jugador2")
            cont1 += 1
        } else {
            secuencia.add("Jugador 2: --$jugador2")
        }
        if (jugador3 == 4) {
            println("-----Muere Jugador 3-----")
            secuencia.add("Jugador 3: $jugador3")
            cont1 += 1
        } else {
            secuencia.add("Jugador 3: --$jugador3")
        }
        if (jugador4 == 4) {
            println("-----Muere Jugador 4-----")
            secuencia.add("Jugador 4: --$jugador4")
            cont1 += 1
        } else {
            secuencia.add("Jugador 4: --$jugador4")
        }
        if (jugador5 == 4) {
            println("-----Muere Jugador 5-----")
            secuencia.add("Jugador 5: $jugador5")
            cont1 += 1
        } else {
            secuencia.add("Jugador 5: --$jugador5")
        }
    }

    println("Secuencia de eventos:")
    for (evento in secuencia) {
        println(evento)
    }
}
