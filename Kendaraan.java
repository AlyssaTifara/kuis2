abstract class Kendaraan {
    private String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void jalankan();
}