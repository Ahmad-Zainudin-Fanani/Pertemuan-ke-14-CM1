public class AntrianPasien {
    Pasien[] antrian;
    int front, rear, size, max;

    public AntrianPasien(int kapasitas) {
        max = kapasitas;
        antrian = new Pasien[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Pasien pasien) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } 
        else {
            rear++;
        }
        antrian[rear] = pasien;
        size++;
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }

    public Pasien layaniPasien() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Pasien dilayani = antrian[front];
        front++;
        size--;
        return dilayani;
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println(">> Tidak ada pasien dalam antrian.");
        } 
        else {
            System.out.println("== Antrian Pasien ==\n");
            for (int i = front; i <= rear; i++) {
                antrian[i].tampilkanInformasi();
                System.out.println("--------------------------");
            }
        }
    }

    public int sisaAntrian() {
        return size;
    }
}