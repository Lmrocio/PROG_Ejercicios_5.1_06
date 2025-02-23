fun main() {

    val articulo = Articulo("Camiseta", 25.0)
    val articulo2 = Articulo("Abrigo", 45.0)

    val ordenador1 = Ordenador("Ordenador Gaming", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("Ordenador Básico", 399.99)


    val articulos = listOf(articulo, articulo2, ordenador1, ordenador2)


    for (articulo in articulos) {

        articulo.promocionNavidad(10.0)
        println(articulo)

    }
}