package tugas04.rumahsakit;

public class DetailPesanan {
    private Kue kue;
    private int jumlah;

    public DetailPesanan(Kue kue, int jumlah) {
        this.kue = kue;
        this.jumlah = jumlah;
    }

    public double hitungSubtotal() {
        return kue.getHarga() * jumlah;
    }

    public Kue getKue() {
        return kue;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getDetail() {
        return kue.getNamaKue() + " | Rasa: " + kue.getRasa() + 
               " | Qty: " + jumlah + " | Subtotal: Rp " + hitungSubtotal();
    }
}
    

