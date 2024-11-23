class PizzaSamara(
    neapoLitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapoLitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), Sous {

    override fun buySous() {
        println("Соус брать будете?")
        println("1. Да\n2. Нет")
        val viborSous = readln()

        if (viborSous == "1") {
            countSous++
            println("1. Сырный\n2. Кисло-сладкий")
            val sousChoice = readln()  // Читаем выбор соуса

            when (sousChoice) {
                "1" -> {
                    countCheese++
                    sousCheese += 25
                }
                "2" -> {
                    countKislii++
                    sousKislii += 25
                }
                else -> println("Некорректный выбор, выберите 1 или 2.")
            }

            orderSousov = countCheese + countKislii
            sumSousov = orderSousov * 25
        }
    }

    override fun skidkaSamara() {
        println("У вас есть фотография чека?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            println("Вам будет скидка 50р с покупки")
            countCheckSamara++
            sumCheckSamara += 50
        }

        countOrderCheckSamara++
        pokazCheckSamara = (countCheckSamara.toDouble() / countOrderCheckSamara) * 100.0
        NotPokazCheckSamara = 100 - pokazCheckSamara
    }


    override fun kofeSamara() {
        println("Будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            println("С вас 200р")
            countDrinkSamara++
            sumDrinkSamara += 200
        }

        countOrderDrinkSamara++
        pokazDrinkSamara = (countDrinkSamara.toDouble() / countOrderDrinkSamara.toDouble() * 100.0)
        NotPokazDrinkSamara = 100.0 - pokazDrinkSamara
    }

    override fun neapolitanPizzaSale() {
        neapoLitanPizzaCount++
        if (countDrinkSamara > 0) {
            neapolitanPizzaWithCoffee++
        }
        println("Спасибо за покупку неаполитанской пиццы в Самаре")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        if (countDrinkSamara > 0) {
            romanPizzaWithCoffee++
        }
        println("Спасибо за покупку римской пиццы в Самаре")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        if (countDrinkSamara > 0) {
            sicilianPizzaWithCoffee++
        }
        println("Спасибо за покупку сицилийской пиццы в Самаре")    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        if (countDrinkSamara > 0) {
            tyroleanPizzaWithCoffee++
        }
        println("Спасибо за покупку туролеанской пиццы в Самаре")
    }
}