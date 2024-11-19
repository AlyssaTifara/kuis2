import java.util.ArrayList;
import java.util.List;
public class PolymorphismKendaraan {
    // Polymorphic 
    public static void jalankanKendaraan(Kendaraan kendaraan) {
        kendaraan.jalankan();
    }

    public static void main(String[] args) {
        // Heterogeneous 
        List<Kendaraan> garasi = new ArrayList<>();
        garasi.add(new Mobil("Toyota", 4));
        garasi.add(new Motor("Yamaha", "Sport"));
        garasi.add(new Mobil("Honda", 2));

        System.out.println("--------------------------------");
        System.out.println("Menjalankan kendaraan di garasi:");
        System.out.println("--------------------------------");
        for (Kendaraan kendaraan : garasi) {
            jalankanKendaraan(kendaraan); // Polymorphic 
        }

        // Object Casting dan InstanceOf
        System.out.println("\n");
        System.out.println("--------------------------------");
        System.out.println("  Detail kendaraan di garasi:  ");
        System.out.println("--------------------------------");
        for (Kendaraan kendaraan : garasi) {
            if (kendaraan instanceof Mobil) {
                Mobil mobil = (Mobil) kendaraan; // Downcasting
                System.out.println("Mobil: " + mobil.getNama() + ", Jumlah Pintu: " + mobil.getJumlahPintu());
            } else if (kendaraan instanceof Motor) {
                Motor motor = (Motor) kendaraan; // Downcasting
                System.out.println("Motor: " + motor.getNama() + ", Tipe Stang: " + motor.getTipeStang());
            }
        }
    }
}