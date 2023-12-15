package step3

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import step3.domain.Car

class CarListsTest {
    @Test
    fun `progress 동일 seed 테스트`() {
        val randomCount = (Math.random() * 10).toInt()
        val carList1 = CarLists(List(randomCount) { Car() })
        val carList2 = CarLists(List(randomCount) { Car() })

        val randomSeed1 = (Math.random() * 10000).toLong()
        carList1.progress(randomSeed1)
        carList2.progress(randomSeed1)

        val randomSeed2 = (Math.random() * 10000).toLong()
        carList1.progress(randomSeed2)
        carList2.progress(randomSeed2)

        carList1.carList.zip(carList2.carList).forEach { (car1, car2) ->
            assertThat(car1.getProgress()).isEqualTo(car2.getProgress())
        }
    }
}
