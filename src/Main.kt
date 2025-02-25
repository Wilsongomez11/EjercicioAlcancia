fun main() {
    var mon20 = 0
    var mon50 = 0
    var mon100 = 0
    var mon200 = 0
    var mon500 = 0

    do {
        println(
            """
            Ingresa una opción:
            1. Agregar una moneda
            2. Contar la cantidad de cada moneda 
            3. Calcular el dinero total
            4. Romper la alcancía
        """.trimIndent()
        )

        val opcion = readln().toInt()

        when (opcion) {
            1 -> {
                println("Ingresa el valor de la moneda (20, 50, 100, 200, 500):")
                val moneda = readln().toInt()

                when (moneda) {
                    20 -> mon20++
                    50 -> mon50++
                    100 -> mon100++
                    200 -> mon200++
                    500 -> mon500++
                    else -> println("Esta moneda no es valida. Solo se aceptan: 20, 50, 100, 200, 500")
                }
            }

            2 -> {
                println("Cantidad de monedas en la alcancía:")
                println("Monedas de 20: $mon20")
                println("Monedas de 50: $mon50")
                println("Monedas de 100: $mon100")
                println("Monedas de 200: $mon200")
                println("Monedas de 500: $mon500")
            }

            3 -> {
                val total = mon20 * 20 + mon50 * 50 + mon100 * 100 + mon200 * 200 + mon500 * 500
                println("El dinero total en la alcancía es: $$total")
            }

            4 -> {
                println("Rompiste la alcancía. Total retirado: $${mon20 * 20 + mon50 * 50 + mon100 * 100 + mon200 * 200 + mon500 * 500}")
                mon20 = 0
                mon50 = 0
                mon100 = 0
                mon200 = 0
                mon500 = 0
            }

            else -> println("Opción no aceptadam, intenta de nuevo")
        }

    } while (opcion != 4)
}