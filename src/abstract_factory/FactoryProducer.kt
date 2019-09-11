package abstract_factory

/**
@author Prokash Sarkar
@since Wed, September 11, 2019
@version 1.0
 **/
class FactoryProducer {

    companion object {

        fun getFactory(rounded: Boolean): AbstractFactory {
            return if (rounded) {
                ShapeFactoryRounded()
            } else {
                ShapeFactory()
            }
        }

    }

}