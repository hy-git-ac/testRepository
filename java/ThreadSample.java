import java.lang.Runnable;

public class ThreadSample implements Runnable{
  
  String str;
  WaitTarget wt;
  
  public ThreadSample(String str, WaitTarget wt){
    this.str = str;
    this.wt = wt;
  }
  
  @Override
	public void run() {
	    for (int i=0; i<10; i++){
	       wt.printStr(str);
  	     wt.wtWait(str);
      }
	}
  
  
}