package tugas04.rumahsakit;

public class Kue {
    private String idKue;
    private String namaKue;
    private String rasa;
    private double harga;

    public Kue(String idKue, String namaKue, String rasa, double harga) {
        this.idKue = idKue;
        this.namaKue = namaKue;
        this.rasa = rasa;
        this.harga = harga;
    }

    public String getIdKue() {
        return idKue;
    }

    public String getNamaKue() {
        return namaKue;
    }

    public String getRasa() {
        return rasa;
    }

    public double getHarga() {
        return harga;
    }

    public String getDetailKue() {
        return namaKue + " (" + rasa + ") - Rp " + harga;
    }
}
