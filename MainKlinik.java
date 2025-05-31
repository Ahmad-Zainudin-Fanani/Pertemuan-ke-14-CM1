import java.util.Scanner;

public class MainKlinik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPasien antrian = new AntrianPasien(10);
        RiwayatTransaksi riwayat = new RiwayatTransaksi();

        int menu;
        do {
            System.out.println("=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (menu) {
                case 1:
                    System.out.print("Nama Pasien : ");
                    String nama = sc.nextLine();
                    System.out.print("NIK         : ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan     : ");
                    String keluhan = sc.nextLine();
                    antrian.tambahAntrian(new Pasien(nama, nik, keluhan));
                    System.out.println();
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    System.out.println();
                    break;
                case 3:
                    Pasien p = antrian.layaniPasien();
                    if (p != null) {
                        System.out.println("Pasien " + p.nama + " dipanggil\n");
                        System.out.print("Masukkan ID Dokter            : ");
                        String idDokter = sc.nextLine();
                        System.out.print("Masukkan Nama Dokter          : ");
                        String namaDokter = sc.nextLine();
                        System.out.print("Masukkan Durasi Layanan (jam) : ");
                        int durasi = sc.nextInt();
                        sc.nextLine();
                        Dokter dokter = new Dokter(idDokter, namaDokter);
                        riwayat.tambah(new TransaksiLayanan(p, dokter, durasi));
                        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println(">> Sisa pasien dalam antrian: " + antrian.sisaAntrian());
                    System.out.println();
                    break;
                case 5:
                    riwayat.tampilkan();
                    System.out.println();
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