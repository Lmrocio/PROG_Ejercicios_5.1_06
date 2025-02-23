# Ejercicio 6: Sistema de articulos

Crear una ``clase Articulo`` con un ``nombre`` y un ``precio``, que ambos se puedan modificar.
También tendrá un ``id`` que se generará de forma automática mediante un contador
(totalArticulos) y una función ``generarId()``. Este id no podrá modificarse ni obtenerse fuera
de Articulo.

- Crear un método ``promocionNavidad()`` que reciba el porcentaje de rebaja y lo aplique al precio.

- Sobreescribir el método ``toString()`` para que retorne el "{nombre} - {precio con dos decilames}€ (ID: {id})".

- Crear una clase que herede de Articulo y se llame ``Ordenador``. Debe agregar a su constructor primario el tipo, que será de ``TipoOrdenador`` => (BASICO, OFIMATICA, TODOTERRENO, GAMING) y por defecto será BASICO.

- Sobreescribe el método ``promocionNavidad()`` para que solo aplique la promoción si el precio es superior a 500 euros.

- En el main crea dos artículos con precios 25 y 45 euros. También crea dos ordenadores, el primero GAMING de precio 1299.99 y el segundo un ordenador básico de 399.99 euros.

- Crear una variable para generar una lista con ellos y recorrerla aplicándoles la promoción e imprimiendo su contenido.

Puedes declarar la variable de la siguiente forma:

// Lista de todos los artículos
val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

## Responde a las siguientes preguntas:

1. ¿De qué tipo genera en la lista por defecto el compilador?
En Kotlin, el compilador genera por defecto el tipo más genérico de los elementos de una lista. En este caso, la lista tiene elementos de tipo Articulo y Ordenador, por lo que el compilador inferirá como tipo más general Articulo porque es la clase base o padre de Ordenador. Es decir, por defecto la lista será de tipo Articulo (List<Articulo>)

2. ¿Qué está ocurriendo en este ejemplo con respecto a lo que hemos visto del polimorfismo de la herencia?
El polimorfismo nos permite tratar a los elementos de una clase derivada como los elementos de la clase base. Esto nos permite, entre otras cosas, crear listas con ambas clases que podemos recorrer aplicando el mismo método: el método .promocionNavidad() porque es heredado de una clase a otra.

3. ¿Qué pasaría si creáramos la lista con listOf<Ordenador>? ¿Y si la hiciéramos con listOf<Any>?
En ese caso, la lista sólo podría contener elementos de tipo Ordenaddor, mientras que si hacemos una lista de tipo Any, esta podría contener cualquier tipo de objeto en su interior. Esto último, como desventaja, no nos permitiría acceder a los métodos y propiedades específicas de las clases.
