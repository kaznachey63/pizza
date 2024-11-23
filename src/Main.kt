import kotlin.system.exitProcess
// 6, 7

fun main() {
    val pizzaPeter = PizzaPeter(
        175.0, 241.5,
        167.5, 215.0
    )

    val pizzaMoscow = PizzaMoscow(
        215.0, 250.5,
        180.5, 240.0
    )

    val pizzaSamara = PizzaSamara(
            215.0, 250.5,
            180.5, 240.0
    )


    // переменная для хран. выбранной пиццериии
    var currentPizzaCity: PizzaCity

    while (true) {
        // выбор города
        println("\nДобрый день, выберите город")
        println("1. Москва\n2. Санкт-Петербург\n3. Самара\n0. Выход из программы")

        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "3" -> pizzaSamara
            "0" -> break
            else -> {
                println("Неверный номер пиццерии")
                continue
            }
        }
        // выбор пиццы
        selectPizza(currentPizzaCity)
    }
}

private fun selectPizza(currentPizzaCity: PizzaCity) {
    while (true) {
        println("Выберите пиццу:")
        println(
            "1. Неаполитанская пицца\n2. Римская пицца\n" +
                    "3. Сицилийская пицца\n4. Тирольская пицца\n0. Показать статистику"
        )
        when (readln()) {
            "1" -> {
                currentPizzaCity.neapolitanPizzaSale()
                selectAddService(currentPizzaCity)
                break
            }

            "2" -> {
                currentPizzaCity.romanPizzaSale()
                selectAddService(currentPizzaCity)
                break
            }

            "3" -> {
                currentPizzaCity.sicilianPizzaSale()
                selectAddService(currentPizzaCity)
                break
            }

            "4" -> {
                currentPizzaCity.tyroleanPizzaSale()
                selectAddService(currentPizzaCity)
                break
            }

            "0" -> {
                currentPizzaCity.showStatics()
                    break
            }
            else -> {
                println("Неверный номер пиццы!")
            }
        }
    }
}
fun selectAddService(currentPizzaCity: PizzaCity) {
    when (currentPizzaCity) {
        is CheckPhoto -> currentPizzaCity.showCheckPhoto()
        is Drink -> currentPizzaCity.drinkSale()
        is Sous -> {
            currentPizzaCity.buySous()
            currentPizzaCity.skidkaSamara()
            currentPizzaCity.kofeSamara()
        }
    }
}
