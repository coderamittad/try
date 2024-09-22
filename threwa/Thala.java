package threwa;

public class Thala extends Thread {
    public void runa() {
        for (int i = 1; i < 10; i++) {
            System.out.println("+");
            for (int j = 3; j < i; j++) {
                System.out.println("0000");

            }
        }
    }
}