/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaian;

/**
 *
 * @author USER
 */
public class NilaiAkhir extends Mahasiswa {
     int uts;
    int uas;
    int tugas;
    
    @Override
    public void uts (int Uts){
        uts=Uts;
        System.out.println("Nomor Rumah = " +Uts);
    }
    
    @Override
    public void uas (int Uas){
        uas=Uas;
        System.out.println("Nomor Rumah = " +Uas);
    }
    
     @Override
    public void tugas (int Tugas){
        tugas=Tugas;
        System.out.println("Nomor Rumah = " +Tugas);
    }
}
    
