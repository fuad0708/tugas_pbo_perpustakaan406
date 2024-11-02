public class InformasiPerpustakaan {
    // Encapsulation
    private String kode;
    private String judul;

    // Constructor
    public InformasiPerpustakaan(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
    }

    // Getter sama Setter untuk encapsulation
    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public void tampilkanInformasi() {
        System.out.println("Kode: " + kode + ", Judul: " + judul);
    }
}
