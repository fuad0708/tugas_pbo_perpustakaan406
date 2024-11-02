public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("123", "Si  Kancil", "Rahimidin Zahari", 3);
        Buku buku2 = new Buku("456", "Malin Kundang", "Winda Susilo", 2);

        Anggota anggota1 = new Anggota("001", "Ali");
        Anggota anggota2 = new Anggota("002", "Budi");

        Pegawai pegawai1 = new Pegawai("2356", "Pak Ilham");
        Pegawai pegawai2 = new Pegawai("1245", " Pak Budi");


        System.out.println("Data Buku:");
        tampilkanInformasiBuku(buku1);
        System.out.println();
        tampilkanInformasiBuku(buku2);

        // nampilin data anggota
        System.out.println("\nData Anggota:");
        anggota1.tampilkanAnggota();
        anggota2.tampilkanAnggota();

        // lakuin transaksi peminjaman sama pengembalian
        System.out.println("\n=== Transaksi Peminjaman ===");
        TransaksiPeminjaman peminjaman1 = new TransaksiPeminjaman(anggota1, buku1);
        peminjaman1.pinjamBuku();
        pegawai1.tampilkanInforPegawai();
        TransaksiPeminjaman peminjaman2 = new TransaksiPeminjaman(anggota2, buku2);
        peminjaman2.pinjamBuku();
        pegawai2.tampilkanInforPegawai();

        System.out.println("\n=== Transaksi Pengembalian ===");
        TransaksiPengembalian pengembalian1 = new TransaksiPengembalian(anggota1, buku1);
        pengembalian1.kembalikanBuku();
        pegawai1.tampilkanInforPegawai();
        TransaksiPengembalian pengembalian2 = new TransaksiPengembalian(anggota2, buku2);
        pengembalian2.kembalikanBuku();
        pegawai2.tampilkanInforPegawai();

        System.out.println("\nData Buku:");
        tampilkanInformasiBuku(buku1);
        System.out.println();
        tampilkanInformasiBuku(buku2);
    }


    private static void tampilkanInformasiBuku(Buku buku) {
        System.out.println("Kode   = " + buku.getKode());
        System.out.println("Judul  = " + buku.getJudul());
        System.out.println("Penulis = " + buku.getPenulis());
        System.out.println("Stok   = " + buku.getStok());
    }
}
