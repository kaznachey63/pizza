abstract class PizzaCity(
    protected val neapoLitanPizzaPrice: Double,
    protected val romanPizzaPrice: Double,
    protected val sicilianPizzaPrice: Double,
    protected val tyroleanPizzaPrice: Double
) {
    protected var neapoLitanPizzaCount = 0
    protected var romanPizzaCount = 0
    protected var sicilianPizzaCount = 0
    protected var tyroleanPizzaCount = 0

    protected var countCheck = 0
    protected var sumCheck = 0
    protected var countOrderCheck = 0
    protected var pokazCheck = 0.0
    protected var NotPokazCheck = 0.0

    protected var countDrink = 0
    protected var sumDrink = 0
    protected var countOrderDrink = 0.0
    protected var pokazDrink = 0.0
    protected var NotPokazDrink = 0.0

    protected var neapolitanPizzaWithCoffee = 0
    protected var romanPizzaWithCoffee = 0
    protected var sicilianPizzaWithCoffee = 0
    protected var tyroleanPizzaWithCoffee = 0

    protected var countSous = 0
    protected var countCheese = 0
    protected var countKislii = 0
    protected var orderSousov = 0
    protected var sousCheese = 0
    protected var sousKislii = 0
    protected var sumSousov = 0

    protected var countCheckSamara = 0.0
    protected var sumCheckSamara = 0.0
    protected var countOrderCheckSamara = 0.0
    protected var pokazCheckSamara = 0.0
    protected var NotPokazCheckSamara = 0.0

    protected var countDrinkSamara = 0.0
    protected var sumDrinkSamara = 0
    protected var countOrderDrinkSamara = 0.0
    protected var pokazDrinkSamara = 0.0
    protected var NotPokazDrinkSamara = 0.0

//    protected var neapolitanPizzaWithCoffeeSamara = 0
//    protected var romanPizzaWithCoffeeSamara = 0
//    protected var sicilianPizzaWithCoffeeSamara = 0
//    protected var tyroleanPizzaWithCoffeeSamara = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()

    fun showStatics() {
        fun calcPercentage(part: Int, total: Int): Double = if (total > 0) (part.toDouble() / total * 100) else 0.0

        println("Продано неаполитанской пиццы: $neapoLitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано туролеанской пиццы: $tyroleanPizzaCount\n")

        val moneyMoscow =
            (neapoLitanPizzaCount * neapoLitanPizzaPrice +
                romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice +
                tyroleanPizzaCount * tyroleanPizzaPrice) - sumCheck

        val moneyPiter =
            ((neapoLitanPizzaCount * neapoLitanPizzaPrice +
                    romanPizzaCount * romanPizzaPrice +
                    sicilianPizzaCount * sicilianPizzaPrice +
                    tyroleanPizzaCount * tyroleanPizzaPrice) + sumDrink)

        val moneySamara =
            ((neapoLitanPizzaCount * neapoLitanPizzaPrice +
                    romanPizzaCount * romanPizzaPrice +
                    sicilianPizzaCount * sicilianPizzaPrice +
                    tyroleanPizzaCount * tyroleanPizzaPrice) + sumDrinkSamara + sumSousov) - sumCheckSamara

        if (this is PizzaMoscow) {
            println("Процент показанных чеков: $pokazCheck%")
            println("Процент непоказанных чеков: $NotPokazCheck%")
            println("Всего заработано денег c учетом скидок: $moneyMoscow")
        }
        else if (this is PizzaPeter) {
            println("Процент купленных кофе: $pokazDrink%")
            println("Процент некупленных кофе: $NotPokazDrink%")

            println("\nНеаполитанская пицца с кофе: $neapolitanPizzaWithCoffee (${calcPercentage(neapolitanPizzaWithCoffee, neapoLitanPizzaCount)}%)")
            println("Римская пицца с кофе: $romanPizzaWithCoffee (${calcPercentage(romanPizzaWithCoffee, romanPizzaCount)}%)")
            println("Сицилийская пицца с кофе: $sicilianPizzaWithCoffee (${calcPercentage(sicilianPizzaWithCoffee, sicilianPizzaCount)}%)")
            println("Тирольская пицца с кофе: $tyroleanPizzaWithCoffee (${calcPercentage(tyroleanPizzaWithCoffee, tyroleanPizzaCount)}%)")

            println("Всего заработано денег: $moneyPiter")
        }
        else if (this is PizzaSamara) {
            println("Процент показанных чеков: $pokazCheckSamara%")
            println("Процент непоказанных чеков: $NotPokazCheckSamara%")

            println("\nПроцент купленных кофе: $pokazDrinkSamara%")
            println("Процент некупленных кофе: $NotPokazDrinkSamara%")

            println("\nНеаполитанская пицца с кофе: $neapolitanPizzaWithCoffee (${calcPercentage(neapolitanPizzaWithCoffee, neapoLitanPizzaCount)}%)")
            println("Римская пицца с кофе: $romanPizzaWithCoffee (${calcPercentage(romanPizzaWithCoffee, romanPizzaCount)}%)")
            println("Сицилийская пицца с кофе: $sicilianPizzaWithCoffee (${calcPercentage(sicilianPizzaWithCoffee, sicilianPizzaCount)}%)")
            println("Тирольская пицца с кофе: $tyroleanPizzaWithCoffee (${calcPercentage(tyroleanPizzaWithCoffee, tyroleanPizzaCount)}%)")

            println("\nКоличество проданных соусов: $orderSousov ")
            println("Выручка за Сырный соус: $sousCheese ")
            println("Выручка за Кисло-сладкий соус: $sousKislii ")
            println("\nВсего заработано денег c учетом скидок: $moneySamara")
        }
    }
}