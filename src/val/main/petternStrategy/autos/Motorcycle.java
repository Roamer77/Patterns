package val.main.petternStrategy.autos;

import val.main.petternStrategy.strategys.MotorcycleFillStategy;

public class Motorcycle extends Auto {

    @Override
    public void gas() {
        System.out.println("Bruun brun");
    }

    @Override
    public void stop() {
        System.out.println("Psh psh psh");
    }
}
