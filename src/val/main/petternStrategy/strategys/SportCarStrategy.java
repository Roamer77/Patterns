package val.main.petternStrategy.strategys;

import val.main.petternStrategy.FillStrategy;

public class SportCarStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Заправляю спорткар супер топливом");
    }
}
