/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package practica0

class App {


}

fun main() {
    var productos=ArrayList<Producto>()
    productos.add(Producto("Lavadora grande",345f
    ,"lg.jpeg","lavadora grande",Estado.ACTIVO))

    productos.add(Producto("Televisor 55\"",545f
    ,"tv55.jpeg","televisor grande",Estado.ACTIVO))

    productos.add(Producto("Portatil 14",654f
    ,"ptt.jpeg","portatil de 8gb pequeño",Estado.ACTIVO))

    var portatiles = Categoria("Portátiles", Estado.ACTIVO, "imagen_portatil.jpg")
    var impresoras = Categoria("Impresoras", Estado.ACTIVO, "imagen_impresora.jpg")

    portatiles.productos.add(
        Producto(
            "Lisa",
            100f,
            "lisa.jpg",
            "Uno de los primeros ordenadores de Apple")
    )
    portatiles.productos.add(
        Producto(
            "IBMPC",
            50f,
            "ibmpc.jpg",
            "El primer equipo para el gran público")
    )

    impresoras.productos.add(
        Producto(
            "Brother Colo1234",
            10f,
            "brother.jpg",
            "Impresora a color")
    )
    impresoras.productos.add(
        Producto(
            "HP Laser",
            20f,
            "hplaser.jpg",
            "Impresora laser")
    )

    // Agregar categorias al HashMap
    var categorias: HashMap<String, ArrayList<Producto>> = HashMap()

    categorias.put("Portatiles", portatiles.productos)
    categorias.put("Impresoras", impresoras.productos)

    println("\nMuestro las categorias")
    categorias.entries.stream().forEach { (categoria) ->
        println(categoria)
    }

    println("\nMuestro todos los portatiles")
    categorias["Portatiles"]?.forEach { println(it.nombre) }


    val todosLosProductos = categorias.values.flatten()
    val precioMedia = todosLosProductos.map { it.precio }.average()
    println("\nPrecio media de los productos: $precioMedia €")


}