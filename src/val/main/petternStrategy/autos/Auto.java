package val.main.petternStrategy.autos;

import val.main.petternStrategy.FillStrategy;
import val.main.petternStrategy.strategys.SportCarStrategy;

public class Auto {

    public  void gas(){
        System.out.println("Gazzzz");
    }
    public  void stop(){
        System.out.println("stop tzzzzz");
    }
    public  void setfill(FillStrategy strategy){
        strategy.fill();
    }
}
