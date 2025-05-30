public class Pasien {
    String nama;
    String nik;
    String keluhan;

    public Pasien(String nama, String nik, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
    }

    public void tampil() {
        System.out.println("Pasien: " + nama + " (NIK: " + nik + ")");
        System.out.println("Keluhan: " + keluhan);
    }
}