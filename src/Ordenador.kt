class Ordenador (nombre: String, precio: Double, val tipo: TipoOrdenador = TipoOrdenador.BASICO): Articulo(nombre, precio) {

    override fun promocionNavidad(porcentaje: Double){
        if(precio >= 500){
            precio -= precio *(porcentaje/100)

        } else println("No se puede aplicar el descuento a un artículo cuyo precio sea inferior a 500€")
    }

}