package Z_GFG.Bank.Learningg.multithreading;

class MyThread extends Thread {
   public void run() {
      for (int i = 1; i <= 3; i++) {
         System.out.println("Child thread: " + i);
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            System.out.println(e);
         }
      }
   }
}

public class JoinExample {
   public static void main(String[] args) {
      MyThread t = new MyThread();


      try {
         t.start(); // start child thread
         t.join(); // main thread waits here for child thread to finish
      } catch (Exception e) {
         System.out.println(e);
      }

      System.out.println("Main thread ends after child thread.");
   }
}
