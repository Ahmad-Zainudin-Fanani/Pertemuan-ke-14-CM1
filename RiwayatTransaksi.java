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
        System.out.println("== Riwayat Transaksi ==\n");
        while (temp != null) {
            temp.data.tampilkanTransaksi();
            temp = temp.next;
        }
    }
}