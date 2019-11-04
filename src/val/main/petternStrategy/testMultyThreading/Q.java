package val.main.petternStrategy.testMultyThreading;

public class Q {
    private int n;
    boolean valueSet=false;
    public synchronized int getN() {
        while (!valueSet){ //false
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Получено "+n);
        valueSet=false;
        notify();
        return n;
    }

    public synchronized void setN(int n) {
        this.n = n;
        while (valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet=true;
        System.out.println("Отправлено "+n);
        notify();
    }
}
