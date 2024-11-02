public class Pegawai {
    private String idPegawai;
    private String nama;

    // Constructor
    public Pegawai(String idPegawai, String nama) {
        this.idPegawai = idPegawai;
        this.nama = nama;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method buat nampilin informasi pegawai
    public void tampilkanInforPegawai() {
        System.out.println("\nPegawai perpus yang melayani : ");
        System.out.println("Nama: " + nama);
        System.out.println("ID Pegawai: " + idPegawai);
    }
}
