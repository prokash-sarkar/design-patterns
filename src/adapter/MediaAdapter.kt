package adapter

/**
@author Prokash Sarkar
@since Thu, September 12, 2019
@version 1.0
 **/
class MediaAdapter(audioType: String) : MediaPlayer {

    private lateinit var advancedMusicPlayer: AdvancedMediaPlayer

    init {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMusicPlayer = VlcPlayer()
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMusicPlayer = Mp4Player()
        }
    }

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMusicPlayer.playVlc(fileName)
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMusicPlayer.playMp4(fileName)
        }
    }

}