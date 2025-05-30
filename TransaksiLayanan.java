public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya() {
        return durasiLayanan * 50000;
    }

    public void tampilkanTransaksi() {
        System.out.println("=== Transaksi Layanan ===");
        pasien.tampilkanInformasi();
        System.out.println("Dokter: " + dokter.nama + " (ID: " + dokter.idDokter + ")");
        System.out.println("Durasi: " + durasiLayanan + " jam");
        System.out.println("Biaya: Rp " + biaya);
        System.out.println("--------------------------");
    }
}