public class Main2 {
    public Main2() {
        Counter2 c1=new Counter2();
        Counter2 c2=new Counter2();
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }
    public static void main(String[] args) {
        new Main2();
    }
}
