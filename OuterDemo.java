public class OuterDemo {
    public static void main(String args[]) {
        Outer outer= new Outer();
        outer.test();
    }
}
class Outer {
    int outer_x = 100;
    int i;
    void test() {
        for(i=0; i<10; i++) {
            class Inner {
                void display() {
                    System.out.println("display: outer_x = " + outer_x);
                    System.out.println(i);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
