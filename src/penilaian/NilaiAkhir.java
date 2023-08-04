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
    private double uts;
    private double uas;
    private double tugas;

    public NilaiAkhir(String nama, String npm) {
        super(nama, npm);
    }
    
    public double getUts() {
        return uts;
    }
    
    public void setUts(double uts) {
        this.uts = uts;
    }
    
    public double getUas() {
        return uas;
    }
    
    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double getTugas() {
        return tugas;
    }
    
    public void setTugas(double tugas) {
        this.tugas = tugas;
    }
    
    public double hitungNilaiAkhir() {
        // Menggunakan bobot 30% UTS, 30% UAS, dan 40% tugas
        double bobotUts = 0.3;
        double bobotUas = 0.3;
        double bobotTugas = 0.40;
        
        return (uts * bobotUts) + (uas * bobotUas) + (tugas * bobotTugas);
    }
}
    
