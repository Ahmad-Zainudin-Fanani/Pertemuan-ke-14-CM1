public class Transaksi {
    String namaPasien;
    String idDokter;
    String namaDokter;
    int durasiJam;
    int biaya;

    public Transaksi(String namaPasien, String idDokter, String namaDokter, int durasiJam) {
        this.namaPasien = namaPasien;
        this.idDokter = idDokter;
        this.namaDokter = namaDokter;
        this.durasiJam = durasiJam;
        this.biaya = durasiJam * 50000;
    }

    public void tampilkanTransaksi() {
        System.out.println("Pasien: " + namaPasien);
        System.out.println("Dokter: " + namaDokter + " (ID: " + idDokter + ")");
        System.out.println("Durasi: " + durasiJam + " jam");
        System.out.println("Biaya: Rp " + biaya);
        System.out.println("---------------------------");
    }
}