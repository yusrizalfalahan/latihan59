/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan59.detectiveconan;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * @author Acer
 */
public class PBO0210117043Latihan59Detectiveconan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tokohutama conan = new  tokohutama("Conan Edogawa", "Detektif", "Melesaikan kasus", "Detektif cilik");
        conan.tampil();
        
        tokohutama ran = new tokohutama("Ran Mouri", "Ahli Karate", "Menjadi Ahli Karate di Seluruh Jepang", "Siswi SMA");
        ran.tampil();
        
        tokohutama kogoro = new tokohutama("Kogoro Mouri", "Detektif Swasta", "Memecahkan kasus", "Detektif Swasta");
        kogoro.tampil();
        
        tokohpendukung heiji = new tokohpendukung("Heiji Hattori", "Detektif SMA", "Temannya Conan");
        heiji.tampil();
        
       tokohpendukung kazuha = new tokohpendukung("Kazuha Tayoma", "Ahli Aikido", "Temannya Ran");
        kazuha.tampil();
    }
    
    
}
