package val.main.petternStrategy.strategys;

import val.main.petternStrategy.FillStrategy;

public class MotorcycleFillStategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Заправляю мотоцикл");
    }
}
