package adapter

/**
@author Prokash Sarkar
@since Thu, September 12, 2019
@version 1.0
 **/
class VlcPlayer : AdvancedMediaPlayer {

    override fun playVlc(fileName: String) {
        println("Playing vlc file. Name: $fileName")
    }

    override fun playMp4(fileName: String) {
        //do nothing
    }

}