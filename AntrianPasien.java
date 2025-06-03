public class AntrianPasien {
    Pasien[] antrian;
    int front, rear, size, max;

    public AntrianPasien(int kapasitas) {
        max = kapasitas;
        antrian = new Pasien[max];
        front = rear = 0;
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
            System.out.println(">> Antrian penuh!");
            return;
        }

        antrian[rear] = pasien;
        rear = (rear + 1) % max;
        size++;

        System.out.println(">> Pasien masuk ke dalam antrian.");
    }

    public Pasien layaniPasien() {
        if (isEmpty()) {
            System.out.println(">> Antrian kosong!");
            return null;
        }

        Pasien dilayani = antrian[front];
        front = (front + 1) % max;
        size--;

        return dilayani;
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println(">> Tidak ada pasien dalam antrian.");
        } else {
            System.out.println("== Antrian Pasien ==\n");
            int index = front;
            for (int i = 0; i < size; i++) {
                antrian[index].tampilkanInformasi();
                System.out.println("--------------------------");
                index = (index + 1) % max;
            }
        }
    }


    public int sisaAntrian() {
        return size;
    }
}
