package com.company;

import java.util.Scanner;

public class Music {

    private String musicName;
    private String singerName;
    private String year;
    private MusicPlayer player;

    Scanner scan = new Scanner(System.in);

    public Music() {
        setMusicName();
        setSingerName();
        setYear();
        player = new MusicPlayer();
    }

    public void setMusicName() {
        System.out.println("enter music name");
        this.musicName = scan.nextLine();
    }

    public void setSingerName() {
        System.out.println("enter singer name");
        this.singerName = scan.nextLine();
    }

    public void setYear() {
        System.out.println("enter year");
        this.year = scan.nextLine();
    }

    public String getMusicName() {
        return musicName;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getYear() {
        return year;
    }


}
