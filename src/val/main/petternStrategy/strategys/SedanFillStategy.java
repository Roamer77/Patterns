package val.main.petternStrategy.strategys;

import val.main.petternStrategy.FillStrategy;

public class SedanFillStategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Заправляю обычным 92 дерьмом");
    }
}
