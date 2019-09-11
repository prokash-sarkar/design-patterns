package abstract_factory

import abstract_factory.shapes.Shape

/**
@author Prokash Sarkar
@since Wed, September 11, 2019
@version 1.0
 **/
abstract class AbstractFactory {

    enum class Type {
        Circle, Rectangle, Square
    }

    abstract fun getShape(type: Type): Shape

}