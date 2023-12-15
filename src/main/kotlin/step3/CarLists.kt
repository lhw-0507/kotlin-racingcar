package step3

import step3.domain.Car
import kotlin.random.Random

class CarLists(
    val carList: List<Car>
) {
    fun progress(seed: Long) {
        val random = Random(seed)
        for (car in carList) {
            val randomNumber = random.nextInt(10)
            car.move(randomNumber)
        }
    }
}
