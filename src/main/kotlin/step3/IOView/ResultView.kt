package step3.IOView

import step3.CarLists
import step3.domain.Car

class ResultView {
    companion object {
        fun printCarProgress(car: Car) {
            for (i in 0 until car.getProgress()) {
                print("-")
            }
            println()
        }

        fun printProgress(carList: CarLists) {
            for (car in carList.carList) {
                printCarProgress(car)
            }
            println()
        }
    }
}
