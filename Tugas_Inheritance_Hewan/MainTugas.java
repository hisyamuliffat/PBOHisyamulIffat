public class MainTugas {
    public static void main(String[] args) {
        System.out.println("=== INSTANSIASI OBJEK 1 (Default Constructor) ===");
        Mamalia mamalia1 = new Mamalia();
        mamalia1.nama = "Kucing";
        mamalia1.habitat = "Darat";
        mamalia1.jenisMakanan = "Karnivora";
        mamalia1.masaKehamilan = 2;

        System.out.println("\n--- INFO MAMALIA 1 ---");
        System.out.print(mamalia1.getAllInfo());
        mamalia1.menyusui();

        System.out.println("\n==================================================\n");

        System.out.println("=== INSTANSIASI OBJEK 2 (Super Constructor Berparameter) ===");
        Mamalia mamalia2 = new Mamalia("Paus Biru", "Laut", "Karnivora/Plankton", 11);

        System.out.println("\n--- INFO MAMALIA 2 ---");
        System.out.print(mamalia2.getAllInfo());
        mamalia2.menyusui();
    }
}
