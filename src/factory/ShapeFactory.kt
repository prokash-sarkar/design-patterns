package factory

/**
@author Prokash Sarkar
@since Wed, September 11, 2019
@version 1.0
 **/
class ShapeFactory {

    enum class Type {
        Circle, Rectangle, Square
    }

    fun getShape(type: Type): Shape? {
        return when (type) {
            Type.Circle -> Circle()
            Type.Rectangle -> Rectangle()
            Type.Square -> Square()
        }
    }

}