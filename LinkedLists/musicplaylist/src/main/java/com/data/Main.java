package com.data;

public class Main {
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();

        playlist.addSong("Song1");
        playlist.addSong("Drake");        
        playlist.addSong("Drake");
        
        System.err.println("curren Song: "+ playlist.getCurrentSong());
        playlist.playNextSong();
        playlist.playNextSong();
        System.out.println("current song now: "+ playlist.getCurrentSong());
    }
}