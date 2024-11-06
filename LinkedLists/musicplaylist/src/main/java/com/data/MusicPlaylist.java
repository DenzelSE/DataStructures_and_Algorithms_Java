package com.data;

import java.util.LinkedList;

public class MusicPlaylist {
    private LinkedList <String> playlist;

    public MusicPlaylist(){
        playlist = new LinkedList<>();
    }

    public void addSong (String song){
        playlist.add(song);
    }
    public String getCurrentSong(){
        if (!playlist.isEmpty()){
        return playlist.getFirst(); 
        }
        return null;
    }
    public void playNextSong(){
        if(!playlist.isEmpty()){
            System.out.println("Now Playing: "+ playlist.removeFirst());
        }
        else{
            System.out.println("Playlist is empty");
        }
    }
    public boolean isEmpty(){
        return playlist.isEmpty();
    }

    public void clearPlaylist(){
        playlist.clear();
    }
}
