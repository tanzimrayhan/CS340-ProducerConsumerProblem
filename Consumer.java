public class Consumer implements Runnable {
    private int[] buffer;
    private int n, k, t;
    private int next_out = 0;
    private int data;

    public Consumer(int[] buffer, int k, int t) {
        this.buffer = buffer;
        this.k = k;
        this.t = t;
        this.n = this.buffer.length;
    }

    @SuppressWarnings("static-access")
    @Override
    public void run() {

        while (true) {
            int t2 = (int) (Math.random() * t);
            try {
                System.out.println(Thread.currentThread().getName() + " going to sleep");
                Thread.currentThread().sleep(t2 * 1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
                System.out.println(e);
                throw new IllegalArgumentException(e);
            }

            int k2 = (int) (Math.random() * k);
            for (int i = 0; i < k2; i++) {
                data = buffer[(next_out + i) % n];

                if (data > 1) {
                    System.out.println("***   RACE CONDITION DETECTED  ***");
                    break;
                }
                buffer[(next_out + i) % n] = 0;
                next_out = (next_out + k2) % n;

            }

        }

    }

}