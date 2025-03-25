import java.util.List;

class Base {}
class Derived extends Base {}

public class OverloadMaster {
       void process(int x, long y) {
        System.out.println("int, long: " + (x + y));
    }

       void process(Integer x, Long y) {
        System.out.println("Integer, Long: " + (x + y));
    }

        void process(Base b, int x) {
        System.out.println("Base, int");
    }

       void process(Derived d, int x) {
        System.out.println("Derived, int");
    }

        <T extends Number> void process(List<T> list, String s) {
        System.out.println("Generic List of Numbers, String: " + list.size());
    }

        void process(List list, Object o) {
        System.out.println("Raw List, Object: " + list.size());
    }

      void process(String s, double d) {
        System.out.println("String, double: " + (s + d));
    }

    public static void main(String[] args) {
        OverloadMaster om = new OverloadMaster();

                om.process(5, 10L);

       
        Integer i = 5;
        Long l = 10L;
        om.process(i, l);

              Base b = new Derived();
        om.process(b, 7);

      
        List<Integer> numbers = List.of(1, 2);
        om.process(numbers, "test");

               List rawList = numbers;
        om.process(rawList, new Object());

      
        om.process("Value: ", 3.14);

       }
}