public class Producer implements Runnable {
    private int[] buffer;
    private int n, k, t;

    public Producer(int[] buffer, int k, int t) {
        this.buffer = buffer;
        this.k = k;
        this.t = t;
        this.n = this.buffer.length;
    }

    @Override
	public void run() {
        // TODO Auto-generated method stub
        while (true)
        {  
            int k1=
            
        //  generate random integer k1 using k.
        //  for i from 0 to (k1 – 1)
        //  {
        //  buffer[(next_in + i) mod n] += 1
        //  }
        //  next_in = (next_in + k1) mod n
        //  generate random integer t1 using t 
        //  sleep for t1 seconds
        }
		
	}

}