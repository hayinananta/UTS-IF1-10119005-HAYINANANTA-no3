/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119005.hayinananta.no3;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini untuk menampilkan deskripsi jenis-jenis lagu
 *                     atau musik genre dengan berbasis objek
 */
public class Metal extends MusicGenre implements Punk, HeavyMetal {
    public void genreMetal(String artistName) {
        System.out.println(artistName + " adalah musisi Metal");
    }
    
    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName + " adalah musisi Heavy Metal");
    }
    
    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName + " adalah musisi Punk");
    }
    
    public void genreGrunge(String artistName) {
        System.out.println(artistName + " adalah musisi Grunge");
    }
}