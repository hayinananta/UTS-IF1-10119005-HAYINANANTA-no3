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
public class HardRock extends MusicGenre implements PopRock, ProgressiveRock, PsychedelicRock{
    public void genreHardRock(String artistName) {
        System.out.println(artistName + " adalah musisi Hard Rock");
    }
    
    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName + " adalah musisi Pop Rock");
    }
    
    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName + " adalah musisi Progressive Rock");
    }
    
    @Override
    public void genrePsychedelicRock(String artistName) {
        System.out.println(artistName + " adalah musisi Psychedelic Rock");
    }
}