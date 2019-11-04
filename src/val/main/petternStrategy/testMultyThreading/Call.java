package val.main.petternStrategy.testMultyThreading;

public class Call {
    public  void  call(String msg){
        for(int i=0;i<5;i++){
            System.out.println(msg);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
