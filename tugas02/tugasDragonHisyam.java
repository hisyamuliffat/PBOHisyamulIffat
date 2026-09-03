package tugas02;
public class tugasDragonHisyam {
    int x;
    int y;
    int direction;

    
    tugasDragonHisyam() {
        x = 0;
        y = 0;
        direction = 1;
    }

    void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid!");
        }
    }

    void move(int steps) {
        if (direction == 1) {
            y += steps;
        } else if (direction == 2) {
            x += steps;
        } else if (direction == 3) {
            y -= steps;
        } else if (direction == 4) {
            x -= steps;
        }
    }

    void printStatus() {
        System.out.println("Posisi naga: (" + x + ", " + y + ")");
        System.out.println("Arah naga: " + direction);
    }
}