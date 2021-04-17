package Lab3.Music;

import java.util.Locale;

public class Song {
    private String file;
    private String name;
    private String singer;
    private int year;


    public Song(String file, String name, String singer, int year) {
        this.file = file;
        this.name = name;
        this.singer = singer;
        this.year = year;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.println(this.name + " (" + year + ") - " + singer);
    }

    public boolean containsKey(String input) {
        if(name.toLowerCase().contains(input.toLowerCase())) return true;
        if(singer.toLowerCase().contains(input.toLowerCase())) return true;
        if(String.valueOf(year).toLowerCase().contains(input.toLowerCase())) return true;
        return false;
    }
}
