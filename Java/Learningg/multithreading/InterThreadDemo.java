package Z_GFG.Bank.Learningg.multithreading;


class SharedData {
   boolean ready = false;

   synchronized void produce() {
      System.out.println("Producing...");
      ready = true;
      notify();  // Notify consumer that data is ready
   }

   synchronized void consume() {
      if (!ready) {
         try {
            wait();  // Wait for producer to produce
         } catch (InterruptedException e) {
            System.out.println(e);
         }
      }
      System.out.println("Consuming...");
   }
}

public class InterThreadDemo {
   public static void main(String[] args) {
      SharedData data = new SharedData();

      // Consumer Thread
      new Thread(() -> data.consume()).start();

      // Producer Thread
      new Thread(() -> {
         try {
            Thread.sleep(10000);
         } catch (Exception e) {
         }
         data.produce();
      }).start();
   }
}

