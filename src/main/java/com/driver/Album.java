package com.driver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {
    private String title;
    private Date releaseDate;
    private List<Song>songs;

    public Album(){
        this.songs=new ArrayList<>();

    }

    public Album(String title){
        this.title = title;
        this.releaseDate = new Date();
        this.songs=new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
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
}
