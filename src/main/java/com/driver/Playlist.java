package com.driver;

import com.google.common.util.concurrent.Service;

import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String title;
    private List<Song> songs;
    private User creator;
    private List <User>listeners;

    public Playlist(){
        this.songs= new ArrayList<>();
        this.listeners= new ArrayList<>();

    }

    public Playlist(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }
    public User getCreator() {
        return creator;
    }
    public boolean hasListener(User user) {
        return listeners.contains(user);
    }
    public void addUser(User user) {
        listeners.add(user);
    }


}
