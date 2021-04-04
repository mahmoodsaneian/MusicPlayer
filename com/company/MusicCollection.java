package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class MusicCollection {

    private MusicPlayer player;
    private ArrayList<Music> files;
    private ArrayList<Music> favoriteMusic;

    public MusicCollection() {
        player = new MusicPlayer();
        files = new ArrayList<Music>();
        favoriteMusic = new ArrayList<Music>();
    }

    public void addFile(Music music) {
        files.add(music);
    }

    public int getNumberOfFiles() {
        return files.size();
    }

    public void listFile(int index) {
        if (index < files.size())
            System.out.println(files.get(index).getMusicName() + "," + files.get(index).getSingerName() + ","
                    + files.get(index).getYear());
    }

    public void listAllFiles() {
        Iterator<Music> it = files.iterator();
        while (it.hasNext()) {
            Music temp = it.next();
            System.out.println(temp.getMusicName() + "," + temp.getSingerName() + "," + temp.getYear());
        }
    }

    public void removeByIndex(int index) {
        if (index < files.size())
            files.remove(index);
    }

    public void removeByName(Music music) {
        files.remove(music);
    }

    public boolean startPlaying(String name) {
        Iterator<Music> it = files.iterator();
        while (it.hasNext()) {
            Music temp = it.next();
            if (temp.getMusicName().contains(name)) {
                player.startPlaying(name);
                return true;
            }

        }

        System.out.println("this music is not exist in your list");
        return false;
    }

    public void stopPlaying() {
        player.stop();
    }

    private boolean validIndex(int index) {
        if (index < files.size())
            return true;
        else
            return false;
    }

    public void addFavoriteFile(Music music) {
        favoriteMusic.add(music);
    }

    public boolean removeFavoriteByName(String name) {
        Iterator<Music> it = favoriteMusic.iterator();
        while (it.hasNext()) {
            Music music = it.next();
            if (music.getMusicName().contains(name)) {
                favoriteMusic.remove(music);
                return true;
            }
        }
        System.out.println("music doesn't exist");
        return false;
    }

    public void printFavorite() {
        for (Music music : favoriteMusic) {
            System.out.println(music.getMusicName() + "," + music.getSingerName() + "," + music.getYear());
        }
    }

    public boolean searchMusicBySingerName(String name) {
        Iterator<Music> it = files.iterator();
        while (it.hasNext()) {
            Music music = it.next();
            if (music.getSingerName().contains(name)) {
                System.out.println("music characteristic :");
                System.out.println(music.getMusicName() + "," + music.getSingerName() + "," + music.getYear());
                return true;
            }
        }

        System.out.println("a music by this singer name doesn't exist");
        return false;
    }

    public boolean searchMusicByMusicName(String name) {
        Iterator<Music> it = files.iterator();
        while (it.hasNext()) {
            Music music = it.next();
            if (music.getMusicName().contains(name)) {
                System.out.println("music characteristic :");
                System.out.println(music.getMusicName() + "," + music.getSingerName() + "," + music.getYear());
                return true;
            }
        }

        System.out.println("a music doesn't exist");
        return false;
    }

    public Music findMusic(String name) {
        Iterator<Music> it = files.iterator();
        while (it.hasNext()) {
            Music music = it.next();
            if (music.getMusicName().contains(name))
                return music;
        }
        return null;
    }

    public Music findFavoriteMusic(String name) {
        Iterator<Music> it = favoriteMusic.iterator();
        while (it.hasNext()) {
            Music music = it.next();
            if (music.getMusicName().contains(name))
                return music;
        }
        return null;
    }

    public int getNumberOfFavoriteFiles() {
        return favoriteMusic.size();
    }
}

