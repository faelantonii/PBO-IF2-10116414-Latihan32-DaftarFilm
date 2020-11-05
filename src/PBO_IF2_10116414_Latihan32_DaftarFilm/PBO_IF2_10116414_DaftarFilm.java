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
public class PBO_IF2_10116414_DaftarFilm {
    public static void main(String[] args) {
        
        System.out.println("===Daftar Film Sedang Tayang===\n");
      
        
        Film flm1 = new Film();
        flm1.namaFilm = "Venom";
        flm1.genre = "Action, Horror, Scifi";
        flm1.rating = 8.5;
        flm1.duration = 120;
        flm1.playing();
        System.out.println("");
        
        Film flm2 = new Film();
        flm2.namaFilm = "Small Foot";
        flm2.genre = "Animation";
        flm2.rating = 9.6;
        flm2.duration = 90;
        flm2.playing();
        System.out.println("");
        
        Film flm3 = new Film();
        flm3.namaFilm = "Crazy Rich Asian";
        flm3.genre = "Comedy";
        flm3.rating = 7.8;
        flm3.duration = 119;
        flm3.playing();
        System.out.println("");
        
        Film flm4 = new Film();
        flm4.namaFilm = "Asih";
        flm4.genre = "Horror";
        flm4.rating = 6.0;
        flm4.duration = 100;
        flm4.playing();
}
}
