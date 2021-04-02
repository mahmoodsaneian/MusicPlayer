package com.company;

import java.util.Scanner;

public class Main {

    public static void printMenu() {
        System.out.println("1.add file");
        System.out.println("2.remove file by index");
        System.out.println("3.remove file by name");
        System.out.println("4.play with name");
        System.out.println("5.stop play");
        System.out.println("6.number of list which exist in your collection");
        System.out.println("7.list all files");
        System.out.println("8.list specify file.please enter index of file which you want");
        System.out.println("9.exit");
    }

    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        Scanner scan = new Scanner(System.in);
        int code = -1;
        //print menu for user and we ask what him wants
        outer:
        while (true) {

            System.out.println("first , please enter the name of collection");

            String temp = scan.next();
            //if it deals with a pop section
            if (temp.equals("pop")) {
                printMenu();
                code = scan.nextInt();
                switch (code) {
                    case 1:
                        String name = scan.next();
                        pop.addFile(name);
                        break;
                    case 2:
                        int tmp = scan.nextInt();
                        pop.removeByIndex(tmp);
                        break;
                    case 3:
                        name = scan.next();
                        pop.removeByName(name);
                        break;
                    case 4:
                        name = scan.next();
                        pop.startPlaying(name);
                        break;
                    case 5:
                        pop.stopPlaying();
                        break;
                    case 6:
                        System.out.println(pop.getNumberOfFiles());
                        break;
                    case 7:
                        pop.listAllFiles();
                        break;
                    case 8:
                        tmp = scan.nextInt();
                        pop.listFile(tmp);
                        break;
                    case 9:
                        break outer;
                }
            }
            //if it deals with a jazz section
            if (temp.equals("jazz")) {
                printMenu();
                code = scan.nextInt();
                switch (code) {
                    case 1:
                        String name = scan.next();
                        jazz.addFile(name);
                        break;
                    case 2:
                        int tmp = scan.nextInt();
                        jazz.removeByIndex(tmp);
                        break;
                    case 3:
                        name = scan.nextLine();
                        jazz.removeByName(name);
                        break;
                    case 4:
                        name = scan.next();
                        jazz.startPlaying(name);
                        break;
                    case 5:
                        jazz.stopPlaying();
                        break;
                    case 6:
                        System.out.println(jazz.getNumberOfFiles());
                        break;
                    case 7:
                        jazz.listAllFiles();
                        break;
                    case 8:
                        tmp = scan.nextInt();
                        jazz.listFile(tmp);
                        break;
                    case 9:
                        break outer;
                }
            }
            //if it deals with a rock section
            if (temp.equals("rock")) {
                printMenu();
                code = scan.nextInt();
                switch (code) {
                    case 1:
                        String name = scan.next();
                        rock.addFile(name);
                        break;
                    case 2:
                        int tmp = scan.nextInt();
                        rock.removeByIndex(tmp);
                        break;
                    case 3:
                        name = scan.next();
                        rock.removeByName(name);
                        break;
                    case 4:
                        name = scan.next();
                        rock.startPlaying(name);
                        break;
                    case 5:
                        rock.stopPlaying();
                        break;
                    case 6:
                        System.out.println(rock.getNumberOfFiles());
                        break;
                    case 7:
                        rock.listAllFiles();
                        break;
                    case 8:
                        tmp = scan.nextInt();
                        rock.listFile(tmp);
                        break;
                    case 9:
                        break outer;
                }
            }
            //if it deals with a country section
            if (temp.equals("country")) {
                printMenu();
                code = scan.nextInt();
                switch (code) {
                    case 1:
                        String name = scan.next();
                        country.addFile(name);
                        break;
                    case 2:
                        int tmp = scan.nextInt();
                        country.removeByIndex(tmp);
                        break;
                    case 3:
                        name = scan.next();
                        country.removeByName(name);
                        break;
                    case 4:
                        name = scan.next();
                        country.startPlaying(name);
                        break;
                    case 5:
                        country.stopPlaying();
                        break;
                    case 6:
                        System.out.println(country.getNumberOfFiles());
                        break;
                    case 7:
                        country.listAllFiles();
                        break;
                    case 8:
                        tmp = scan.nextInt();
                        country.listFile(tmp);
                        break;
                    case 9:
                        break outer;
                }
            }
        }
    }
}