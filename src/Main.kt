fun main(args: Array<String>) {

    "Hola mi nombre es Sergio".print()

    println(4.multiply(2))
    println(4 multiply 5)

    val listNombres = mutableListOf<String>("Alejandra", "Sergio", "Andres")

    listNombres.swap(0,2)

    println(listNombres.toString())

}

//Extension Function es simplemente dar mas funcionalidad a
//Funciones ya existentes en el lenguaje

infix fun Int.multiply(numM: Int): Int{
    return this * numM
}

fun String.print(){
    println(this)
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}