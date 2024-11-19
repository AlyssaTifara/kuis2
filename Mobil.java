class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama, int jumlahPintu) {
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    @Override
    public void jalankan() {
        System.out.println(getNama() + " (Mobil) sedang berjalan dengan jumlah pintu: " + jumlahPintu);
    }
}