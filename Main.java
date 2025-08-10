package PERTEMUAN12.No4;

public class Main {
    public static void main(String[] args) {
        Queue antrian = new Queue(5);
        antrian.enqueue(14);
        antrian.enqueue(25);
        antrian.enqueue(58);
        while (!antrian.isEmpty()) {
            System.out.println(antrian.dequeue());
        }
    }
}

