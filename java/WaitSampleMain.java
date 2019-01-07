public class WaitSampleMain {
 
    public static void main(String[] args) {
      WaitTarget wt = new WaitTarget();
      ThreadSample ts1 = new ThreadSample("○",wt);
      ThreadSample ts2 = new ThreadSample("×",wt);
      ThreadSample ts3 = new ThreadSample("□",wt);
      ThreadSample ts4 = new ThreadSample("△",wt);
      NotifySample ns = new NotifySample(wt);
      Thread t1 = new Thread(ts1);
      Thread t2 = new Thread(ts2);
      Thread t3 = new Thread(ts3);
      Thread t4 = new Thread(ts4);

      t1.start();
      t2.start();
      t3.start();
      t4.start();
      ns.start();
      
      // t3.start();
      // t4.start();
      
      // t5.start();
    }
}