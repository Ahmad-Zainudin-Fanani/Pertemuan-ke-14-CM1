import java.util.Scanner;

public class MainKlinik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPasien antrian = new AntrianPasien(10);
        RiwayatTransaksi riwayat = new RiwayatTransaksi();

        int menu;
        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("NIK: ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = sc.nextLine();
                    antrian.tambahAntrian(new Pasien(nama, nik, keluhan));
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    Pasien p = antrian.layaniPasien();
                    if (p != null) {
                        System.out.println("Pasien " + p.nama + " dipanggil");
                        System.out.print("Masukkan ID Dokter: ");
                        String idDokter = sc.nextLine();
                        System.out.print("Masukkan Nama Dokter: ");
                        String namaDokter = sc.nextLine();
                        System.out.print("Masukkan Durasi Layanan (jam): ");
                        int durasi = sc.nextInt();
                        sc.nextLine();
                        Dokter d = new Dokter(idDokter, namaDokter);
                        riwayat.tambah(new TransaksiLayanan(p, d, durasi));
                        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
                    }
                    break;
                case 4:
                    System.out.println(">> Sisa pasien dalam antrian: " + antrian.sisaAntrian());
                    break;
                case 5:
                    riwayat.tampilkan();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (menu != 0);
        sc.close();
    }
}