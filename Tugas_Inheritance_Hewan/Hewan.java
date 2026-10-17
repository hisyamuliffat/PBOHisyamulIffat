public class Hewan {
    public String nama;
    public String habitat;
    public String jenisMakanan;


    public Hewan() {
        System.out.println("Constructor Hewan (Default) dipanggil");
    }

    
    public Hewan(String nama, String habitat, String jenisMakanan) {
        this.nama = nama;
        this.habitat = habitat;
        this.jenisMakanan = jenisMakanan;
        System.out.println("Constructor Hewan (Berparameter) dipanggil");
    }

    public void berkembang() {
        System.out.println("Hewan ini berkembang biak.");
    }

  
    public String getInfo() {
        String info = "";
        info += "Nama          : " + nama + "\n";
        info += "Habitat       : " + habitat + "\n";
        info += "Jenis Makanan : " + jenisMakanan + "\n";
        return info;
    }
}
