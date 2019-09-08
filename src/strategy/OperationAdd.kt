package strategy

/**
 * @author Prokash Sarkar
 * @version 1.0
 * @since Sun, September 08, 2019
 **/
class OperationAdd : Strategy {

    override fun doOperation(num1: Int, num2: Int): Int {
        return num1 + num2
    }

}