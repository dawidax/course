package pl.computer;


import drive.SSDDrive;
import file.File;
import file.musicfile.MP3MusicFile;
import imageFile.GIFImageFile;
import imageFile.GIFImageFile;
import imageFile.JPGImageFile;

public class Main {
    public static void main(String[] args) {

        //test

        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);
        SSDDrive drive = new SSDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());
    }
}