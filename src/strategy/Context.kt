package strategy

/**
@author Prokash Sarkar
@since Sun, September 08, 2019
@version 1.0
 **/
class Context(private val strategy: Strategy) {

    fun executeStrategy(num1: Int, num2: Int): Int {
        return strategy.doOperation(num1, num2)
    }

}