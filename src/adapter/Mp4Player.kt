package adapter

/**
@author Prokash Sarkar
@since Thu, September 12, 2019
@version 1.0
 **/
class Mp4Player : AdvancedMediaPlayer {

    override fun playVlc(fileName: String) {
        //do nothing
    }

    override fun playMp4(fileName: String) {
        println("Playing mp4 file. Name: $fileName")
    }

}