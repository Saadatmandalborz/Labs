package Lab3.Music;

import java.util.ArrayList;

public class MusicCollection{
    private ArrayList<Song> popSongs;
    private ArrayList<Song> jazzSongs;
    private ArrayList<Song> countrySongs;
    private ArrayList<Song> rockSongs;
    private ArrayList<Song> favorites;

    public MusicCollection() {
        popSongs = new ArrayList<Song>();
        jazzSongs = new ArrayList<Song>();
        countrySongs = new ArrayList<Song>();
        rockSongs = new ArrayList<Song>();
        favorites = new ArrayList<>();
    }

    public void search(String input){
        for(Song song : popSongs)
        {
            if(song.containsKey(input))
            {
                song.print();
            }
        }
        for(Song song : jazzSongs)
        {
            if(song.containsKey(input))
            {
                song.print();
            }
        }
        for(Song song : countrySongs)
        {
            if(song.containsKey(input))
            {
                song.print();
            }
        }
        for(Song song : rockSongs)
        {
            if(song.containsKey(input))
            {
                song.print();
            }
        }
    }

    public void searchInRockSongs(String input){
        for(Song song : rockSongs)
        {
            if(song.containsKey(input))
            {
                song.print();
            }
        }
    }

    public void searchInCountrySongs(String input){
        for(Song song : countrySongs)
        {
            if(song.containsKey(input))
            {
                song.print();
            }
        }
    }

    public void searchInJazzSongs(String input){
        for(Song song : jazzSongs)
        {
            if(song.containsKey(input))
            {
                song.print();
            }
        }
    }

    public void searchInPopSongs(String input){
        for(Song song : popSongs)
        {
            if(song.containsKey(input))
            {
                song.print();
            }
        }
    }

    public void showFavorites(){
        for(Song song : favorites)
        {
            song.print();
        }
    }

    public void addSongToPopSongs(Song s){
        popSongs.add(s);
    }

    public void addSongToCountrySongs(Song s){
        countrySongs.add(s);
    }

    public void addSongToJazzSongs(Song s){
        jazzSongs.add(s);
    }

    public void addSongToRockSongs(Song s){
        rockSongs.add(s);
    }

    public void addSongToFavoriteSongs(Song s){
        favorites.add(s);
    }

    public void removeSongFromFavoriteSongs(Song s){
        favorites.removeIf(s::equals);
    }

    public void removeSongFromPopSongs(Song s){
        popSongs.removeIf(s::equals);
    }

    public void removeSongFromCountrySongs(Song s){
        countrySongs.removeIf(s::equals);
    }

    public void removeSongFromJazzSongs(Song s){
        jazzSongs.removeIf(s::equals);
    }

    public void removeSongFromRockSongs(Song s){
        rockSongs.removeIf(s::equals);
    }


}