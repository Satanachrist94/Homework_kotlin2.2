import junit.framework.Assert.assertEquals
import org.junit.Test

internal class MainKtTest {

    @Test
    fun comission_calculation_for_mastercard() {
        var amount = 460000
        val expected :Double = 29600.0
        var TYPE_CARD = TYPE_CARD_MASTERCARD
        val actual_comission = comission_calculation(TYPE_CARD, amount= amount)
        assertEquals(expected, actual_comission)
    }
    @Test
    fun comission_calculation_for_maestro() {
        var amount = 460000
        val expected :Double = 29600.0
        var TYPE_CARD = TYPE_CARD_MAESTRO
        val actual_comission = comission_calculation(TYPE_CARD, amount= amount)
        assertEquals(expected, actual_comission)
    }
    @Test
    fun comission_calculation_for_vkpay() {
        var amount = 460000
        val expected_comission :Double = 0.0
        var TYPE_CARD = TYPE_CARD_VKPAY
        var actual_comission = comission_calculation(TYPE_CARD, amount=amount)
        assertEquals(expected_comission, actual_comission)

    }
    @Test
    fun comission_calculation_for_mir() {
        var amount = 460000
        val expected_comission :Double =34500.0
        var TYPE_CARD = TYPE_CARD_MIR
        var actual_comission = comission_calculation(TYPE_CARD, amount=amount)
        assertEquals(expected_comission, actual_comission)

    }
    @Test
    fun comission_calculation_for_visa() {
        var amount = 460000
        val expected_comission :Double =34500.0
        var TYPE_CARD = TYPE_CARD_VISA
        var actual_comission = comission_calculation(TYPE_CARD, amount=amount)
        assertEquals(expected_comission, actual_comission)

    }

    @Test
    fun getMin_comission_visa() {
        var amount = 20000
        val expected_comission :Double =0.0
        var TYPE_CARD = TYPE_CARD_VISA
        var actual_comission = comission_calculation(TYPE_CARD, amount=amount)
        assertEquals(expected_comission, actual_comission)
    }
    @Test
    fun getMin_comission_mir() {
        var amount = 20000
        val expected_comission :Double =0.0
        var TYPE_CARD = TYPE_CARD_MIR
        var actual_comission = comission_calculation(TYPE_CARD, amount=amount)
        assertEquals(expected_comission, actual_comission)

    }


}