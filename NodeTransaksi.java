public class NodeTransaksi {
    TransaksiLayanan data;
    NodeTransaksi next;

    public NodeTransaksi(TransaksiLayanan data) {
        this.data = data;
        this.next = null;
    }
}