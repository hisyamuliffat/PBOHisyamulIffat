package tugas02;

public class dragonMain {
    
    public static void main(String[] args) {

      
        tugasDragonHisyam dragon1 = new tugasDragonHisyam();
        tugasDragonHisyam dragon2 = new tugasDragonHisyam();

        System.out.println("=== Posisi Awal ===");

        System.out.println("Dragon 1");
        dragon1.printStatus();

        System.out.println();

        System.out.println("Dragon 2");
        dragon2.printStatus();

        dragon1.changeDirection(2);
        dragon1.move(5);

       
        dragon2.changeDirection(3);
        dragon2.move(3);

        
        System.out.println();
        System.out.println("=== Setelah Bergerak ===");

        System.out.println("Dragon 1");
        dragon1.printStatus();

        System.out.println();

        System.out.println("Dragon 2");
        dragon2.printStatus();
    }
}

