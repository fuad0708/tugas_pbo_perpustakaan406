public class Transaksi {
    protected Anggota anggota;
    protected Buku buku;

    // Constructor buat menginisialisasi anggota sama buku
    public Transaksi(Anggota anggota, Buku buku) {
        this.anggota = anggota;
        this.buku = buku;
    }

    // Method pinjamBuku yang mau di-override di kelas turunan
    public void pinjamBuku() {
        System.out.println("Proses peminjaman dilakukan.");
    }

    // Method kembalikanBuku yang mau di-override di kelas turunan
    public void kembalikanBuku() {
        System.out.println("Proses pengembalian dilakukan.");
    }
}
