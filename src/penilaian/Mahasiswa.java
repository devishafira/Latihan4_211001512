package penilaian;

public class Mahasiswa {
    String nama;
    String npm;;
    
    void nama (String dc) {
        nama=dc;
        System.out.println("Nama  = " +nama);
    }
    
    void npm (String dc) {
        npm=dc;
        System.out.println("npm      = " +npm);
    }
    
    void uts (int uts){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    void uas (int uas){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    void tugas (int tugas){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
