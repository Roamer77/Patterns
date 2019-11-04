package val.main.petternStrategy.testInnerClasses;

public class SimpleClass  implements First{
    private static String name;
    public int age;

    public SimpleClass() {
        super();
        System.out.println("Конструктор класса ");
    }

    @Override
    public void doFirst() {

    }

    @Override
    public void doSecond() {

    }


    static class  InnerClass{
        private static String coco="trete";
        public  int length;

        private void doThis(){

        }
    }
}
