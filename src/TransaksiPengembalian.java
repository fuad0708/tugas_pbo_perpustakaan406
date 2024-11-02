public class TransaksiPengembalian extends Transaksi {

    public TransaksiPengembalian(Anggota anggota, Buku buku) {
        super(anggota, buku); // buat manggil konstruktor kelas induk
    }

    @Override
    public void pinjamBuku() {
        System.out.println("Proses peminjaman tidak berlaku untuk transaksi pengembalian.");
    }

    @Override
    public void kembalikanBuku() {
        System.out.println("\nAnggota:");
        System.out.println("ID   = " + anggota.getId());
        System.out.println("Nama = " + anggota.getNama());

        System.out.println("\nBuku:");
        System.out.println("Kode   = " + buku.getKode());
        System.out.println("Judul  = " + buku.getJudul());
        System.out.println("Penulis = " + buku.getPenulis());
        System.out.println("Stok   = " + buku.getStok());

        buku.tambahStok();
        System.out.println("Pengembalian berhasil: " + anggota.getNama() + " mengembalikan " + buku.getJudul());
    }
}
