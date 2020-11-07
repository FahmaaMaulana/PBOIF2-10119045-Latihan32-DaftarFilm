/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan32.daftarfilm;

/**
 *
 * @author Legion
 * NAMA     : Fahma Maulana
 * KELAS    : PBOIF2
 * NIM      : 10119045
 * Deskripsi: Daftar Film
 */
public class PBOIF210119045Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film film = new Film();
        System.out.println("===Daftar Film Sedang Tayang===");

        film.filmName = "Venom";
        film.filmGenre = "Action,Horror,Scifi";
        film.filmRating = 8.5;
        film.filmDuration = 120;
        film.nowPlaying();

        film.filmName = "Small Foot";
        film.filmGenre = "Animation";
        film.filmRating = 9.0;
        film.filmDuration = 96;
        film.nowPlaying();

        film.filmName = "Crazy Rich Asian";
        film.filmGenre = "Comedy";
        film.filmRating = 7.8;
        film.filmDuration = 119;
        film.nowPlaying();

        film.filmName = "Asih";
        film.filmGenre = "Horror";
        film.filmRating = 6.0;
        film.filmDuration = 100;
        film.nowPlaying();
    }

}
   
