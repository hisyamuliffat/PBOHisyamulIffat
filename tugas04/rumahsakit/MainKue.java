package tugas04.rumahsakit;

public class MainKue {
    public static void main(String[] args) {
      
        Kue kue1 = new Kue("K01", "Kue Lapis", "Cokelat", 25000);
        Kue kue2 = new Kue("K02", "Brownies", "Keju", 35000);

     
        DetailPesanan detail1 = new DetailPesanan(kue1, 2);
        DetailPesanan detail2 = new DetailPesanan(kue2, 1);

       
        Pesanan pesanan = new Pesanan("P001", "2026-09-27");

      
        pesanan.tambahDetail(detail1);
        pesanan.tambahDetail(detail2);

        pesanan.tampilkanStruk();
    }
}
