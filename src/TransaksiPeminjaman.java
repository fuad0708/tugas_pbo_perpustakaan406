public class TransaksiPeminjaman extends Transaksi {

    public TransaksiPeminjaman(Anggota anggota, Buku buku) {
        super(anggota, buku); //  manggil konstruktor kelas induk
    }

    @Override
    public void pinjamBuku() {
        System.out.println("\nAnggota:");
        System.out.println("ID   = " + anggota.getId());
        System.out.println("Nama = " + anggota.getNama());

        System.out.println("\nBuku:");
        System.out.println("Kode   = " + buku.getKode());
        System.out.println("Judul  = " + buku.getJudul());
        System.out.println("Penulis = " + buku.getPenulis());
        System.out.println("Stok   = " + buku.getStok());

        if (buku.getStok() > 0) {
            buku.kurangiStok();
            System.out.println("Peminjaman berhasil: " + anggota.getNama() + " meminjam " + buku.getJudul());
        } else {
            System.out.println("Stok habis untuk buku: " + buku.getJudul());
        }
    }

    @Override
    public void kembalikanBuku() {
        System.out.println("Proses pengembalian tidak berlaku untuk transaksi peminjaman.");
    }
}
