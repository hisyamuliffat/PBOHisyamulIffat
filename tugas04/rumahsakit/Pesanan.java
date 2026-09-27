package tugas04.rumahsakit;

import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private ArrayList<DetailPesanan> daftarDetail;
    private String tanggalPesanan;

    public Pesanan(String idPesanan, String tanggalPesanan) {
        this.idPesanan = idPesanan;
        this.tanggalPesanan = tanggalPesanan;
        this.daftarDetail = new ArrayList<>();
    }

    public void tambahDetail(DetailPesanan detail) {
        daftarDetail.add(detail);
    }

    public ArrayList<DetailPesanan> getDaftarDetail() {
        return daftarDetail;
    }

    public double hitungTotalPesanan() {
        double total = 0;
        for (DetailPesanan detail : daftarDetail) {
            total += detail.hitungSubtotal();
        }
        return total;
    }

    public void tampilkanStruk() {
        System.out.println("==========================================");
        System.out.println("               STRUK PESANAN              ");
        System.out.println("==========================================");
        System.out.println("ID Pesanan      : " + idPesanan);
        System.out.println("Tanggal Pesanan : " + tanggalPesanan);
        System.out.println("------------------------------------------");
        System.out.println("Detail Item:");
        
        for (DetailPesanan detail : daftarDetail) {
            System.out.println("- " + detail.getDetail());
        }
        
        System.out.println("------------------------------------------");
        System.out.println("TOTAL PESANAN   : Rp " + hitungTotalPesanan());
        System.out.println("==========================================");
    }
}
