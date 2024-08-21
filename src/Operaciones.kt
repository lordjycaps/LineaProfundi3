class Operaciones(var n1:Double, var n2:Double) {

    fun suma(){
        var valor1  = this.n1
        var valor2 = this.n2
        var resultado = valor1 + valor2
        println("${resultado}");
    }
    fun resta() {
        val val1 = 5
        val val2 = this.n1
        val resultado2 = val1 - val2
        println("$resultado2")
    }
    fun dividir(): Double {
        var val1 = this.n1
        var val2 = this.n2

        return val1 / val2;
    }

    fun raiz(x:Double){
        var r = Math.sqrt(x)
        println(r);
    }

    fun cuadrado(c:Double):Double {
        return Math.pow(c, 2.0)
    }

    override fun toString(): String {
        return "Operaciones(n1=$n1, n2=$n2)"
    }


}




