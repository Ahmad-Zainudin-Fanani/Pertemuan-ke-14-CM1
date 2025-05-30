public class Dokter {
    String idDokter, namaDokter;

    public Dokter(String idDokter, String namaDokter) {
        this.idDokter = idDokter;
        this.namaDokter = namaDokter;
    }

    public void tampil() {
        System.out.println("Dokter: " + namaDokter + " (ID: " + idDokter + ")");
    }
}