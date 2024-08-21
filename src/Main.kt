
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val op = Operaciones(5.0, 7.2)
    println(op.suma());
    println(op.resta());
    println(op.dividir());
    println(op.raiz(10.0));
    println(op.cuadrado(10.0));

    val lisOperaciones: MutableList<Operaciones> = mutableListOf()
    lisOperaciones.add(op)

    for (i in lisOperaciones){
        println(i)
    }


}

