package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class MusicCollection {
    private ArrayList<String> files;
    private MusicPlayer player;

    public MusicCollection() {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }

    public void addFile(String fileName) {
        files.add(fileName);
    }

    public int getNumberOfFiles() {
        return files.size();
    }

    public void listFile(int index) {
        System.out.println(files.get(index));
    }

    public void listAllFiles() {
        Iterator<String> it = files.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            System.out.println(temp);
        }
    }

    public void removeByIndex(int index) {
        files.remove(index);
    }

    public void removeByName(String name) {
        files.remove(name);
    }

    public boolean startPlaying(String name) {
        Iterator<String> it = files.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            if (temp.contains(name)) {
                player.startPlaying(name);
                return true;
            }

        }
        System.out.println("this singer is not exist in your list");
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


}

/*
import java.util.ArrayList;

*/
/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 * <p>
 * Create a MusicCollection
 * <p>
 * Add a file to the collection.
 * @param filename The file to be added.
 * <p>
 * Return the number of files in the collection.
 * @return The number of files in the collection.
 * <p>
 * List a file from the collection.
 * @param index The index of the file to be listed.
 * <p>
 * Show a list of all the files in the collection.
 * <p>
 * Remove a file from the collection.
 * @param index The index of the file to be removed.
 * <p>
 * Start playing a file in the collection.
 * Use stopPlaying() to stop it playing.
 * @param index The index of the file to be played.
 * <p>
 * Stop the player.
 * <p>
 * Determine whether the given index is valid for the collection.
 * Print an error message if it is not.
 * @param index The index to be checked.
 * @return true if the index is valid, false otherwise.
 * <p>
 * Create a MusicCollection
 * <p>
 * Add a file to the collection.
 * @param filename The file to be added.
 * <p>
 * Return the number of files in the collection.
 * @return The number of files in the collection.
 * <p>
 * List a file from the collection.
 * @param index The index of the file to be listed.
 * <p>
 * Show a list of all the files in the collection.
 * <p>
 * Remove a file from the collection.
 * @param index The index of the file to be removed.
 * <p>
 * Start playing a file in the collection.
 * Use stopPlaying() to stop it playing.
 * @param index The index of the file to be played.
 * <p>
 * Stop the player.
 * <p>
 * Determine whether the given index is valid for the collection.
 * Print an error message if it is not.
 * @param index The index to be checked.
 * @return true if the index is valid, false otherwise.
 * <p>
 * Create a MusicCollection
 * <p>
 * Add a file to the collection.
 * @param filename The file to be added.
 * <p>
 * Return the number of files in the collection.
 * @return The number of files in the collection.
 * <p>
 * List a file from the collection.
 * @param index The index of the file to be listed.
 * <p>
 * Show a list of all the files in the collection.
 * <p>
 * Remove a file from the collection.
 * @param index The index of the file to be removed.
 * <p>
 * Start playing a file in the collection.
 * Use stopPlaying() to stop it playing.
 * @param index The index of the file to be played.
 * <p>
 * Stop the player.
 * <p>
 * Determine whether the given index is valid for the collection.
 * Print an error message if it is not.
 * @param index The index to be checked.
 * @return true if the index is valid, false otherwise.
 * <p>
 * Create a MusicCollection
 * <p>
 * Add a file to the collection.
 * @param filename The file to be added.
 * <p>
 * Return the number of files in the collection.
 * @return The number of files in the collection.
 * <p>
 * List a file from the collection.
 * @param index The index of the file to be listed.
 * <p>
 * Show a list of all the files in the collection.
 * <p>
 * Remove a file from the collection.
 * @param index The index of the file to be removed.
 * <p>
 * Start playing a file in the collection.
 * Use stopPlaying() to stop it playing.
 * @param index The index of the file to be played.
 * <p>
 * Stop the player.
 * <p>
 * Determine whether the given index is valid for the collection.
 * Print an error message if it is not.
 * @param index The index to be checked.
 * @return true if the index is valid, false otherwise.
 *//*

public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;

    */
/**
 * Create a MusicCollection
 *//*

    public MusicCollection()
    {

    }

    */
/**
 * Add a file to the collection.
 * @param filename The file to be added.
 *//*

    public void addFile(String filename)
    {

    }

    */
/**
 * Return the number of files in the collection.
 * @return The number of files in the collection.
 *//*

    public int getNumberOfFiles()
    {

    }

    */
/**
 * List a file from the collection.
 * @param index The index of the file to be listed.
 *//*

    public void listFile(int index)
    {

    }

    */
/**
 * Show a list of all the files in the collection.
 *//*

    public void listAllFiles()
    {

    }

    */
/**
 * Remove a file from the collection.
 * @param index The index of the file to be removed.
 *//*

    public void removeFile(int index)
    {

    }

    */
/**
 * Start playing a file in the collection.
 * Use stopPlaying() to stop it playing.
 * @param index The index of the file to be played.
 *//*

    public void startPlaying(int index)
    {

    }

    */
/**
 * Stop the player.
 *//*

    public void stopPlaying()
    {

    }


    */
/**
 * Determine whether the given index is valid for the collection.
 * Print an error message if it is not.
 * @param index The index to be checked.
 * @return true if the index is valid, false otherwise.
 *//*

    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.

    }
}*/
