package pl.edu.wszib.jwd.Spotkanie4.lab15;

import java.util.ArrayList;
import java.util.List;

public abstract class MusicPlayer implements Player {

    int songNo;
    String name;
    List<Song> playlist = new ArrayList<>();

    public MusicPlayer(List<Song> songs) {
        this.name = "nieznany";
        this.songNo = 0;
        this.playlist = songs;
    }

    public MusicPlayer() {
    }

    @Override
    public void play() {
        Song song = playlist.get(songNo);
        System.out.println("Odtwarzano piosenkę " + song.getTitle() + " z albumu " + song.getAlbum() + " wykonaną przez " + song.getArtist() + " na " + name);
    }

    @Override
    public void pause() {
        System.out.println("Zatrzymano " + name);
    }

    @Override
    public void next() {
        System.out.println("Zmieniono na następną piosenkę");
        if (songNo++ >= playlist.size()) {
            songNo = 0;
            play();
        } else {
            songNo = songNo++;
            play();
        }
    }

    @Override
    public void prev() {
        System.out.println("Zmieniono na poprzednią piosenkę");
        if (songNo-- <= 0) {
            songNo = playlist.size() - 1;
            play();
        } else {
            songNo = songNo--;
            play();
        }
    }
}
