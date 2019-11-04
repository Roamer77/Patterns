package val.main.petternStrategy.testInnerClasses;
@FunctionalInterface
public interface Finteface {
     int  a=10;
     Double init( );
     static void lol(){
         System.out.println(a);
     }
     default void kek(){
         System.out.println(a);
     }

}
