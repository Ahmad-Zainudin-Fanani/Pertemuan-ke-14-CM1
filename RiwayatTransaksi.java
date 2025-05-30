public class RiwayatTransaksi {
    NodeTransaksi head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambah(TransaksiLayanan trx) {
        NodeTransaksi baru = new NodeTransaksi(trx);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public void tampilkan() {
        if (isEmpty()) {
            System.out.println(">> Belum ada riwayat transaksi.");
            return;
        }
        NodeTransaksi temp = head;
        System.out.println("=== RIWAYAT TRANSAKSI ===");
        while (temp != null) {
            temp.data.tampilkanTransaksi();
            temp = temp.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeTransaksi temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
}