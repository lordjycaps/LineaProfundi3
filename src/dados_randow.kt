
import kotlin.random.Random;

fun main(){

   // var n2 : Int;
  //  var n1: Int;

    //n1 =  Random.nextInt(100);
   // n2 =  Random.nextInt(5,15);

  //  var suma =  n1 + n2;
//    println(suma);


    var dado1 : Int;
    var dado2 : Int;

    var contador1: Int = 0;
    var contador2: Int = 0;

    for ( i in 1 ..5 ){
        dado1 =  Random.nextInt(1, 7);
        dado2 = Random.nextInt(1, 7);

        println("Lanzamiento ${i}")
        println("Dado 1      Dado 2");
        println( "${dado1.toString().padEnd(5)} ${dado2.toString().padStart(10)}");

        if(dado1 > dado2){

            contador1 += 1;

        }else if(dado2 > dado1){

            contador2 += 1;

        }else if ( dado1 == dado2){
            contador1  += 0;
            contador2 += 0;
        }

        if (contador1 > contador2){
            println(" ")
            println("------Ganador de la ronda Dado1 con ${contador1} Dado2 con ${contador2}");
        }else if(contador2 > contador1){
            println(" ")
            println("-----Ganador de la ronda Dado2 con ${contador2} Dado1 con ${contador1}");
        }else if (contador1 == contador2){
            println(" ")
            println("-------es un empate--------")
        }

    }
    println("Resultado final")
    println(" ")

    if (contador1 > contador2 ){
        println("--Ganador Dado1  ${contador1}--");
    }else if(contador2 > contador1) {
        println("--Ganador Dado2  ${contador2}--");
    }else if(contador1 == contador2){
        println("--es un empate--")
    }
}

