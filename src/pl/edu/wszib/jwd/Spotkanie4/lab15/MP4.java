package pl.edu.wszib.jwd.Spotkanie4.lab15;

import java.util.ArrayList;
import java.util.List;

public class MP4 extends MusicPlayer{

    public MP4(List<Song> songs) {
        this.name = "MP4";
        this.playlist = songs;
    }
    @Override
    public void play() {
        Song song = playlist.get(songNo);
        System.out.println("Odtwarzano piosenkę " + song.getTitle() + " z albumu " + song.getAlbum() + " wykonaną przez " + song.getArtist() );
    }


}
