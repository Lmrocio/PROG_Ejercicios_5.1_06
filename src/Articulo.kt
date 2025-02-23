open class Articulo(var nombre: String, var precio: Double) {

    companion object{
        private var totalArticulos = 0

    }

    val id: Int = generarId()

    /**
     * Esta función genera un id incrementado la variable de totalArticulos
     *
     * @return totalArticulos : Int
     */
    private fun generarId(): Int {
        totalArticulos++
        return totalArticulos
    }

    /**
     * Esta función recibe el porcentaje de rebajas a aplicar al precio del artículo
     *
     * @param porcentaje: Double
     */
    open fun promocionNavidad(porcentaje: Double){
        precio -= precio *(porcentaje/100)
    }

    /**
     * Reescribe la función toString para mostrar la información del artículo.
     */
    override fun toString(): String {
        return "$nombre - ${"%.2f".format(precio)}€ (ID: ${id})"
    }
}