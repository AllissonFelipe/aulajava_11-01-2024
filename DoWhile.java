public class DoWhile {
    public static void main(String[] args) throws InterruptedException {
        int i = 10;
        do {
            System.out.println("Detonação em " + i + " segundos.");
            i--;
            Thread.sleep(1000);
        } while (i > 0);
        System.out.println("BOOM!");
    }
}
