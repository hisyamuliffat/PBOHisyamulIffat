public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        super();
        System.out.println("Ini constructor class Dosen");
    }

    
    public Dosen(String nip, String nama, double gaji, String nidn) {
        this.nidn = nidn;
        super(nip, nama, gaji); 
       
        System.out.println("Ini constructor berparameter class Dosen");
    }

    @Override
    public String getInfo() {
        return "NIDN    : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }
}