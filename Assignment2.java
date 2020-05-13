//n=100 k=70 t=3
public class Assignment2 {
    public static void main(String args[]) {
        int n, k, t;

        try {
            n = Integer.parseInt(args[0]);
            k = Integer.parseInt(args[1]);
            t = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {

            System.out.println(e);
            throw new IllegalArgumentException("Inputs must be numbers");
        }

        int[] buffer = new int[n];

        Producer producer = new Producer(buffer, k, t);
        Consumer consumer = new Consumer(buffer, k, t);

        Thread p = new Thread(producer);
        p.setName("Producer Thread ");
        Thread c = new Thread(consumer);
        c.setName("Consumer Thread");

        p.start();
        c.start();
        try {
            p.join();
            c.join();

        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

    }
}