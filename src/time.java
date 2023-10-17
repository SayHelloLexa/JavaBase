
public class time {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i ++){
            System.out.println("Dead Head");
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.:" + " " + (stopTime - startTime));
    }


}
