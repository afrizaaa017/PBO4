public class Barang {
    String kode_barang;
    String nama_barang;
    int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public int getStok() {
        return stok;
    }
    public void setStok(int stk) {
        if (stk >= 0) {
            stok = stk;
        } else {
            System.out.println("Stok tidak boleh negatif.");
        }
    }

}


