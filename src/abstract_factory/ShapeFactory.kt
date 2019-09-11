package abstract_factory

import abstract_factory.shapes.Circle
import abstract_factory.shapes.Rectangle
import abstract_factory.shapes.Shape
import abstract_factory.shapes.Square

/**
@author Prokash Sarkar
@since Wed, September 11, 2019
@version 1.0
 **/
class ShapeFactory : AbstractFactory() {

    override fun getShape(type: Type): Shape {
        return when (type) {
            Type.Circle -> Circle()
            Type.Rectangle -> Rectangle()
            Type.Square -> Square()
        }
    }

}