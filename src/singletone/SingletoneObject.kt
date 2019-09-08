package singletone

/**
@author Prokash Sarkar
@since Sun, September 08, 2019
@version 1.0
 **/
class SingletoneObject private constructor() {

    companion object {

        private val instance = SingletoneObject()

        fun getInstance(): SingletoneObject {
            return instance
        }
    }

    fun showMessage() {
        println("Hello World!")
    }

}