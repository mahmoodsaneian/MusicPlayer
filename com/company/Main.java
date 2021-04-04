package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MusicCollection pop     = new MusicCollection();
        MusicCollection jazz    = new MusicCollection();
        MusicCollection country = new MusicCollection();
        MusicCollection rock    = new MusicCollection();
        Scanner scan = new Scanner(System.in);

        outer:
        while (true) {
            System.out.println("first enter collection name among : ");
            System.out.println("1.pop , 2.jazz , 3.country , 4.rock");
            String collectionName = scan.next();

            menu();
            int input = scan.nextInt();

            if (collectionName.equals("pop")){
                switch (input){
                    case 1:
                        Music music = new Music();
                        pop.addFile(music);
                        break;
                    case 2:
                        System.out.println("enter index");
                        int index = scan.nextInt();
                        pop.removeByIndex(index);
                        break;
                    case 3:
                        System.out.println("enter music name");
                        String name = scan.nextLine();
                        name = scan.nextLine();
                        music = pop.findMusic(name);
                        if (music != null) {
                            pop.removeByName(music);
                        }else {
                            System.out.println("music doesn't exist");
                        }
                        break;
                    case 4:
                        System.out.println(pop.getNumberOfFiles());
                        break;
                    case 5:
                        index = scan.nextInt();
                        pop.listFile(index);
                        break;
                    case 6:
                        pop.listAllFiles();
                        break;
                    case 7:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        pop.startPlaying(name);
                        break;
                    case 8:
                        pop.stopPlaying();
                        break;
                    case 9:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        music = pop.findMusic(name);
                        if (music != null) {
                            pop.addFavoriteFile(music);
                            break;
                        }else {
                            System.out.println("this music doesn't exist");
                        }
                        break;
                    case 10:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        pop.removeFavoriteByName(name);
                        break;
                    case 11:
                        pop.printFavorite();
                        break;
                    case 12:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        pop.searchMusicByMusicName(name);
                        break;
                    case 13:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        pop.searchMusicBySingerName(name);
                        break;
                    case 14:
                        System.out.println(pop.getNumberOfFavoriteFiles());
                        break;
                    case 15:
                        break outer;

                }

            }

            if (collectionName.equals("jazz")){
                switch (input){
                    case 1:
                        Music music = new Music();
                        jazz.addFile(music);
                        break;
                    case 2:
                        System.out.println("enter index");
                        int index = scan.nextInt();
                        jazz.removeByIndex(index);
                        break;
                    case 3:
                        System.out.println("enter music name");
                        String name = scan.nextLine();
                        name = scan.nextLine();
                        music = jazz.findMusic(name);
                        if (music != null) {
                            jazz.removeByName(music);
                        }else {
                            System.out.println("music doesn't exist");
                        }
                        break;
                    case 4:
                        System.out.println(jazz.getNumberOfFiles());
                        break;
                    case 5:
                        index = scan.nextInt();
                        jazz.listFile(index);
                        break;
                    case 6:
                        jazz.listAllFiles();
                        break;
                    case 7:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        jazz.startPlaying(name);
                        break;
                    case 8:
                        jazz.stopPlaying();
                        break;
                    case 9:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        music = jazz.findMusic(name);
                        if (music != null) {
                            jazz.addFavoriteFile(music);
                            break;
                        }else {
                            System.out.println("this music doesn't exist");
                        }
                        break;
                    case 10:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        jazz.removeFavoriteByName(name);
                        break;
                    case 11:
                        jazz.printFavorite();
                        break;
                    case 12:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        jazz.searchMusicByMusicName(name);
                        break;
                    case 13:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        jazz.searchMusicBySingerName(name);
                        break;
                    case 14:
                        System.out.println(jazz.getNumberOfFavoriteFiles());
                        break;
                    case 15:
                        break outer;

                }
            }

            if (collectionName.equals("country")){
                switch (input){
                    case 1:
                        Music music = new Music();
                        country.addFile(music);
                        break;
                    case 2:
                        System.out.println("enter index");
                        int index = scan.nextInt();
                        country.removeByIndex(index);
                        break;
                    case 3:
                        System.out.println("enter music name");
                        String name = scan.nextLine();
                        name = scan.nextLine();
                        music = country.findMusic(name);
                        if (music != null) {
                            country.removeByName(music);
                        }else {
                            System.out.println("music doesn't exist");
                        }
                        break;
                    case 4:
                        System.out.println(country.getNumberOfFiles());
                        break;
                    case 5:
                        index = scan.nextInt();
                        country.listFile(index);
                        break;
                    case 6:
                        country.listAllFiles();
                        break;
                    case 7:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        country.startPlaying(name);
                        break;
                    case 8:
                        country.stopPlaying();
                        break;
                    case 9:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        music = country.findMusic(name);
                        if (music != null) {
                            country.addFavoriteFile(music);
                            break;
                        }else {
                            System.out.println("this music doesn't exist");
                        }
                        break;
                    case 10:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        country.removeFavoriteByName(name);
                        break;
                    case 11:
                        country.printFavorite();
                        break;
                    case 12:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        country.searchMusicByMusicName(name);
                        break;
                    case 13:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        country.searchMusicBySingerName(name);
                        break;
                    case 14:
                        System.out.println(country.getNumberOfFavoriteFiles());
                        break;
                    case 15:
                        break outer;

                }
            }

            if (collectionName.equals("rock")){
                switch (input){
                    case 1:
                        Music music = new Music();
                        rock.addFile(music);
                        break;
                    case 2:
                        System.out.println("enter index");
                        int index = scan.nextInt();
                        rock.removeByIndex(index);
                        break;
                    case 3:
                        System.out.println("enter music name");
                        String name = scan.nextLine();
                        name = scan.nextLine();
                        music = rock.findMusic(name);
                        if (music != null) {
                            rock.removeByName(music);
                        }else {
                            System.out.println("music doesn't exist");
                        }
                        break;
                    case 4:
                        System.out.println(rock.getNumberOfFiles());
                        break;
                    case 5:
                        index = scan.nextInt();
                        pop.listFile(index);
                        break;
                    case 6:
                        rock.listAllFiles();
                        break;
                    case 7:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        rock.startPlaying(name);
                        break;
                    case 8:
                        rock.stopPlaying();
                        break;
                    case 9:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        music = rock.findMusic(name);
                        if (music != null) {
                            rock.addFavoriteFile(music);
                            break;
                        }else {
                            System.out.println("this music doesn't exist");
                        }
                        break;
                    case 10:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        rock.removeFavoriteByName(name);
                        break;
                    case 11:
                        rock.printFavorite();
                        break;
                    case 12:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        rock.searchMusicByMusicName(name);
                        break;
                    case 13:
                        name = scan.nextLine();
                        name = scan.nextLine();
                        rock.searchMusicBySingerName(name);
                        break;
                    case 14:
                        System.out.println(rock.getNumberOfFavoriteFiles());
                        break;
                    case 15:
                        break outer;

                }
            }

        }


    }

    public static void menu() {
        System.out.println("1.add music");
        System.out.println("2.remove music by index");
        System.out.println("3.remove music by name");
        System.out.println("4.number of exist files");
        System.out.println("5.list file (inter index)");
        System.out.println("6.print all exist files");
        System.out.println("7.start playing (inter name)");
        System.out.println("8.stop playing");
        System.out.println("9.add music to favorite list(enter music name)");
        System.out.println("10.remove music from favorite list(enter music name)");
        System.out.println("11.print favorite list");
        System.out.println("12.search music by music name(enter name)");
        System.out.println("13.search music by singer name(enter name)");
        System.out.println("14.number of favorite music that exist");
        System.out.println("15.exit");
    }
}