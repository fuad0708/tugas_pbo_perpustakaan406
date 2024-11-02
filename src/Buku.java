public class Buku extends InformasiPerpustakaan {
    private String penulis;
    private int stok;

    // Overloading pada constructor
    public Buku(String kode, String judul, String penulis, int stok) {
        super(kode, judul);
        this.penulis = penulis;
        this.stok = stok;
    }

    // Getter sama Setter untuk encapsulation
    public String getPenulis() {
        return penulis;
    }

    public int getStok() {
        return stok;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void kurangiStok() {
        if (stok > 0) stok--;
    }

    public void tambahStok() {
        stok++;
    }

    //ini Polymorphism method overriding
    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Penulis: " + penulis + ", Stok: " + stok);
    }
}
