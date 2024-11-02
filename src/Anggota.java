public class Anggota {
    private String id;
    private String nama;

    // Constructor
    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter sama Setter untuk encapsulation
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilkanAnggota() {
        System.out.println("\nID: " + id + ", Nama: " + nama);
    }
}
