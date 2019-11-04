package val.main.petternStrategy.testMultyThreading;

public class Main {
    public static void main(String[] args) {
        Q q=new Q();
        Consumer consumer=new Consumer(q);
        Producer producer=new Producer(q);
    }
}
