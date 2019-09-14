package adapter

/**
@author Prokash Sarkar
@since Thu, September 12, 2019
@version 1.0
 **/
class AudioPlayer : MediaPlayer {

    lateinit var mediaAdapter: MediaAdapter

    override fun play(audioType: String, fileName: String) {
        //inbuilt support to play mp3 music files
        if (audioType.equals("mp3", ignoreCase = true)) {
            println("Playing mp3 file. Name: $fileName")
        } else if (audioType.equals("vlc", ignoreCase = true)
                || audioType.equals("mp4", ignoreCase = true)) {
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter.play(audioType, fileName)
        } else {
            println("Invalid media. $audioType format not supported")
        }
    }
}