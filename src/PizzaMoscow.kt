class PizzaMoscow (
    neapoLitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapoLitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), CheckPhoto {
    override fun showCheckPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            println("Вам будет скидка 50р с покупки")
            countCheck++
            sumCheck += 50
        }

        countOrderCheck++
        pokazCheck = (countCheck.toDouble() / countOrderCheck.toDouble() * 100.0)
        NotPokazCheck = 100.0 - pokazCheck
    }

    override fun neapolitanPizzaSale() {
        neapoLitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Москве")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Москве")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Москве")    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку туролеанской пиццы в Москве")
    }
}
