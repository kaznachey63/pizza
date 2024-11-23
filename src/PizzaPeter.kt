class PizzaPeter(
    neapoLitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapoLitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), Drink {
    override fun drinkSale() {

        println("Будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            println("С вас 200р")
            countDrink++
            sumDrink += 200
        }

        countOrderDrink++
        pokazDrink = (countDrink.toDouble() / countOrderDrink.toDouble() * 100.0)
        NotPokazDrink = 100.0 - pokazDrink

    }

    override fun neapolitanPizzaSale() {
        neapoLitanPizzaCount++
        if (countDrink > 0) {
            neapolitanPizzaWithCoffee++
        }
        println("Спасибо за покупку неаполитанской пиццы в Санкт-Петербурге")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        if (countDrink > 0) {
            romanPizzaWithCoffee++
        }
        println("Спасибо за покупку римской пиццы в Санкт-Петербурге")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        if (countDrink > 0) {
            sicilianPizzaWithCoffee++
        }
        println("Спасибо за покупку сицилийской пиццы в Санкт-Петербурге")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        if (countDrink > 0) {
            tyroleanPizzaWithCoffee++
        }
        println("Спасибо за покупку тирольской пиццы в Санкт-Петербурге")
    }
}
