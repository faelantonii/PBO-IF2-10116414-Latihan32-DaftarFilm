/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan32_DaftarFilm;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan daftar film
 */
public class Film {
    String namaFilm, genre;
    double rating;
    int duration;

    public void playing() {
        System.out.println("Judul Film\t: " + namaFilm);
        System.out.println("Genre Film\t: " + genre);
        System.out.println("Rating Film\t: " + rating);
        System.out.println("Duration Film\t: " + duration +" Menit");
    }
}
