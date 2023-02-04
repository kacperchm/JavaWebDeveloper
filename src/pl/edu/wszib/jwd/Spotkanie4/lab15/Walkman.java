package pl.edu.wszib.jwd.Spotkanie4.lab15;

import java.util.List;

public class Walkman extends MusicPlayer {
    public Walkman(List<Song> songs) {
        this.name = "Walkman";
        this.playlist = songs;
    }

}
