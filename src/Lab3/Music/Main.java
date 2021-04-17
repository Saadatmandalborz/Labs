package Lab3.Music;

public class Main {
    public static void main(String[] args) {
        MusicCollection myPlaylist = new MusicCollection();
        Song song = new Song("Khaterate_shomal.mp3","Khaterate shomal","Mahasti",1980);
        myPlaylist.addSongToPopSongs(song);
        System.out.println("Searching for Khater:");
        myPlaylist.searchInPopSongs("khater");
        myPlaylist.removeSongFromPopSongs(song);
        System.out.println("Searching for Khater:");
        myPlaylist.searchInPopSongs("khater");

        myPlaylist.addSongToFavoriteSongs(new Song("Khaterate_shomal.mp3","Khaterate shomal","Mahasti",1980));
        myPlaylist.addSongToFavoriteSongs(new Song("Tabestoon kootahe.mp3","Tabestoon kootahe","Zedbazi",2009));
        myPlaylist.addSongToFavoriteSongs(new Song("test.mp3","tttttt","Unknown",2000));
        System.out.println("My favorite Songs:");
        myPlaylist.showFavorites();
    }
}
