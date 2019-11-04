package val.main.petternStrategy.testMultyThreading;

public class Human implements Runnable{
    private final Call callClass;
    private  String   msg;
    public Human(Call call,String msg) {
        this.callClass=call;
        this.msg=msg;
    }

    @Override
    public void run() {
       synchronized (callClass){
           callClass.call(msg);
       }
    }
}
