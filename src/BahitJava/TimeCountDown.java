package BahitJava;

    public class TimeCountDown {
    static Thread thread = new Thread();
    public static void main(String[] args) throws InterruptedException {
      for (int i = 60; i>=0; i--) {
          Thread.sleep(1000);
          System.out.println("Remain time is "+i);
      }
          System.out.println("Time is up");
          }
      }
