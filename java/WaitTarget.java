public class WaitTarget{
  
  private int loopCount = 1;
  private int threadCount = 0;
  private int waitCount = 0;

  public synchronized void printStr(String str){
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(str+"の処理を実施");
  }
  
  public synchronized void wtWait(String str) {
    try {
        System.out.println(str+"の処理を停止");
        wait();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
  }
  
  public synchronized void wtNotify() {
    clear();
    notify();
  }

  public void clear(){
    //str = "";
  }

  public int getLoopCount(){
    return loopCount;
  }

  public void incWaitCount(){
    waitCount++;
  }
  public int getWaitCount(){
    return waitCount;
  }

  public int getThreadCount(){
    return threadCount;
  }
  
  public void countUp(){
    threadCount++;
  }
}