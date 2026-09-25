package praktikum02;

public final class Barang {
    
    private String kode;
    private String nama;
    private int stok;
    private String keterangan;
    
    public Barang(String kode, String nama, int stok, String keterangan) {
        setKode(kode);
        setNama(nama);
        setStok(stok);
        setKeterangan(keterangan);
    }
    
    public String getKode() {
        return kode;
    }
    
    public void setKode(String kode) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException(
            "Nama barang tidak boleh kosong.");
        }
        this.nama = nama.trim();
    }
    
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        if (stok <0){
            throw new IllegalArgumrntException(
            "Stok tidak boleh negatif.");
        }
        this.stok = stok;
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public void setKeterangan(String keterangan)
    {
        this.keterangan =
                keterangan == null ? "" : keterangan.trim();
    }

    public String tampilkanInfo() {
        return kode + " | " + nama
                + " | Stok: " + stok
                + " | " + keterangan;
    }

    private void setNama(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
}
 