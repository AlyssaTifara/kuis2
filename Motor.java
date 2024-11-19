class Motor extends Kendaraan {
    private String tipeStang;

    public Motor(String nama, String tipeStang) {
        super(nama);
        this.tipeStang = tipeStang;
    }

    public String getTipeStang() {
        return tipeStang;
    }

    @Override
    public void jalankan() {
        System.out.println(getNama() + " (Motor) sedang berjalan dengan tipe stang: " + tipeStang);
    }
}