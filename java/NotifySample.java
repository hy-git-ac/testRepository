import java.lang.Thread;

public class NotifySample extends Thread{
  
  WaitTarget wt;
  
  public NotifySample(WaitTarget wt){
    this.wt = wt;
  }
  
  @Override
	public void run() {
    for(int i=0; i<10; i++){
	    try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("処理を再開");
      wt.wtNotify();
    }
	}
  
  
}