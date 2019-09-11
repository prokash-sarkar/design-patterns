package abstract_factory

import abstract_factory.shapes.CircleRounded
import abstract_factory.shapes.RectangleRounded
import abstract_factory.shapes.Shape
import abstract_factory.shapes.SquareRounded

/**
@author Prokash Sarkar
@since Wed, September 11, 2019
@version 1.0
 **/
class ShapeFactoryRounded : AbstractFactory() {

    override fun getShape(type: Type): Shape {
        return when (type) {
            Type.Circle -> CircleRounded()
            Type.Rectangle -> RectangleRounded()
            Type.Square -> SquareRounded()
        }
    }
    
}