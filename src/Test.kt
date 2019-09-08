import singletone.SingletoneObject
import strategy.*

/**
@author Prokash Sarkar
@since Sun, September 08, 2019
@version 1.0
 **/
fun main() {
    //testStrategyDesignPattern()
    testSingletoneDesignPattern()
}

/**
 * <p> In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * This type of design pattern comes under <b>behavior pattern</b>
 *
 * In Strategy pattern, we create objects which represent various strategies and
 * a context object whose behavior varies as per its strategy object.
 * The strategy object changes the executing algorithm of the context object.
 * </p>
 *
 * Source: https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 */
private fun testStrategyDesignPattern() {
    var context = Context(OperationAdd())
    println("5 + 5 = ${context.executeStrategy(5, 5)}")

    context = Context(OperationSubstract())
    println("5 - 5 = ${context.executeStrategy(5, 5)}")

    context = Context(OperationDivision())
    println("5 / 5 = ${context.executeStrategy(5, 5)}")

    context = Context(OperationMultiplication())
    println("5 * 5 = ${context.executeStrategy(5, 5)}")
}

/**
 * <p> In Singletone pattern, only one instance of a class is created
 * This type of design pattern comes under creational pattern.
 *
 * This pattern involves a single class which is responsible to create an object
 * while making sure that only single object gets created.
 * This class provides a way to access its only object which can be accessed directly
 * without need to instantiate the object of the class.
 * </p>
 */
private fun testSingletoneDesignPattern() {
    val singletoneObject = SingletoneObject.getInstance()
    singletoneObject.showMessage()
}