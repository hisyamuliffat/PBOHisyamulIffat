public class Mamalia extends Hewan {
    public int masaKehamilan; 

   
    public Mamalia() {
        super();
        System.out.println("Constructor Mamalia (Default) dipanggil");
    }

  
    public Mamalia(String nama, String habitat, String jenisMakanan, int masaKehamilan) {
        super(nama, habitat, jenisMakanan); 
        this.masaKehamilan = masaKehamilan;
        System.out.println("Constructor Mamalia (Berparameter) dipanggil");
    }

    public void menyusui() {
        System.out.println(nama + " sedang menyusui anaknya.");
    }

   
    @Override
    public String getInfo() {
        return "Masa Kehamilan: " + masaKehamilan + " bulan\n";
    }

   
    public String getAllInfo() {
        String info = super.getInfo(); 
        info += this.getInfo();        
        return info;
    }
}
