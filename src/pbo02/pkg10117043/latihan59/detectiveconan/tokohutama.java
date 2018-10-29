/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan59.detectiveconan;

/**
 *
 * @author Acer
 */
public class tokohutama extends tokoh {
    private String tujuan;
    private String team;

    public tokohutama(String nama, String peran,String tujuan, String team) {
        super(nama, peran);
        this.tujuan=tujuan;
        this.team=team;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getTeam() {
        return team;
    }
   public void tampil(){
        System.out.println("Nama : "+getNama());
        System.out.println("Peran : "+getPeran());
        System.out.println("Team : "+getTeam());
        System.out.println("Tujuan : "+getTujuan());
        System.out.println("");
   }
}
