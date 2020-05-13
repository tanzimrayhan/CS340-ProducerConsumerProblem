public class Producer implements Runnable {
    private int[] buffer;
    private int n, k, t;
    private int next_in = 0;

    public Producer(int[] buffer, int k, int t) {
        this.buffer = buffer;
        this.k = k;
        this.t = t;
        this.n = this.buffer.length;
    }

    @SuppressWarnings("static-access")
    @Override
    public void run() {

        while (true) {
            int k1 = (int) (Math.random() * k);

            for (int i = 0; i < k1; i++) {
                buffer[(next_in + i) % n] += 1;
            }
            next_in = (next_in + k1) % n;
            int t1 = (int) (Math.random() * t);

            try {
                System.out.println(Thread.currentThread().getName() + "produced," + "will be going to sleep");
                Thread.currentThread().sleep(t1 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
                throw new IllegalArgumentException(e);
            }
        }

    }

}