package strategy

/**
@author Prokash Sarkar
@since Sun, September 08, 2019
@version 1.0
 **/

/**
 * <p> In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * This type of design pattern comes under behavior pattern.
 *
 * In Strategy pattern, we create objects which represent various strategies and
 * a context object whose behavior varies as per its strategy object.
 * The strategy object changes the executing algorithm of the context object.
 * </p>
 *
 * Source: https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 */
fun main() {
    var context = Context(OperationAdd())
    println("5 + 5 = ${context.executeStrategy(5, 5)}")

    context = Context(OperationSubstract())
    println("5 - 5 = ${context.executeStrategy(5, 5)}")

    context = Context(OperationDivision())
    println("5 / 5 = ${context.executeStrategy(5, 5)}")

    context = Context(OperationMultiplication())
    println("5 * 5 = ${context.executeStrategy(5, 5)}")
}