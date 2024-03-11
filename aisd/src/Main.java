import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyStack<Integer> ms=new MyStack<>();
        ms.push(49);//max 2
        ms.push(4);
        ms.push(1);//min 2
        ms.push(48);
        ms.push(50);//max 1
        ms.push(-1);//min 1
        ms.push(7);
        ms.push(2);
        ms.push(1);//min 2
        System.out.println("max 1" +": "+ms.getMax());
        System.out.println("min 1"+": "+ms.getMin());
        ms.pop();
        ms.pop();
        ms.pop();
        ms.pop();
        ms.pop();
        ms.pop();

        System.out.println();

        System.out.println("max 2" +": "+ms.getMax());
        System.out.println("min 2"+": "+ms.getMin());



    }
}