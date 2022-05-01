import java.time.temporal.TemporalAmount

const val TYPE_CARD_MASTERCARD = "Mastercard"
const val TYPE_CARD_MAESTRO = "Maestro"
var TYPE_CARD_VKPAY = "VKPay"
var TYPE_CARD_VISA = "Visa_mir"
var TYPE_CARD_MIR = "Mir"
val min_comission = 3500


fun main() {
    var amount = 460_000

    var comission = comission_calculation( amount = amount) / 100
    var transfer = (amount / 100 - comission)

    println("Комиссия ${comission} рублей")
    println("Сумма перевода ${transfer} рублей ")

}

fun comission_calculation(type: String = TYPE_CARD_VKPAY, last_amount: Int = 0, amount: Int): Double {
    return when (type) {
        TYPE_CARD_MAESTRO, TYPE_CARD_MASTERCARD -> amount * 0.06 + 2000

        TYPE_CARD_MIR, TYPE_CARD_VISA ->
            when {
                amount * 0.075 < min_comission -> {
                    println("Минимальная комиссия 35 рублей")
                    0.0
                }
                else -> amount * 0.075
            }
        else -> 0.0
    }

}





