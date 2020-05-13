public class Consumer implements Runnable {
    private int[] buffer;
    private int n, k, t;
    private int next_in = 0;

    public Consumer(int[] buffer, int k, int t) {
        this.buffer = buffer;
        this.k = k;
        this.t = t;
        this.n = this.buffer.length;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true){
            int t2=(int) (Math.random()*t);
            
        }
    // {
    //  generate random integer t2 using t
    //  sleep for t2 seconds
    //  generate random integer k2 using k
    //  for i from 0 to (k2 – 1)
    //  {
    //  data = buffer[(next_out + i) mod n]
    //  if (data > 1) exit and report race condition
    //  buffer[(next_out + i) mod n] = 0
    //  }
    //  next_out = (next_out + k2) mod n
    // }

    }

}