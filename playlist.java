package Playlist;

import java.util.ArrayList;
import java.util.Scanner;

public class playlist {

    private ArrayList<String> songs;

    public playlist(){
        songs = new ArrayList<>();
    }

    public void addSong(String song){
        songs.add(song);
        System.out.println("Kenga " + song + " u shtua ne playlist");
    }

    public void removeSong(String song){
        songs.remove(song);
        System.out.println("Kenga " + song + " u hoq nga playlist");
    }

    public boolean searchSong(String song){
        return songs.contains(song);
    }

    public int getTotalSonggs(){
        return songs.size();
    }

    public static void main(String[] args) {
        
        playlist list = new playlist();
        
        System.out.println("Cfare doni te beni me listen?");
        
        
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();

        
        list.addSong(song);

        list.removeSong(song);

        if (list.searchSong(song) == true) {
            System.out.println("Kenga " + song + "eshte ne playlist");
        }else{
            System.out.println("Kenga " + song + " nuk eshte ne playlist");
        }

        System.out.println("Playlist ka ne total " + list.getTotalSonggs() + " kenge");
        
        scanner.close();
    }
}
