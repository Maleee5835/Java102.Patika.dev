import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<>();

        myList.add(10);
        myList.add(25);
        myList.add(20);
        myList.add(1);
        myList.add(2);
        myList.add(35);
        myList.add(45);
        myList.add(55);
        myList.add(65);
        myList.add(19);
        myList.add(15984);
        myList.add(1554);
        myList.add(152);
        myList.add(15584);
        myList.add(155416);
        myList.add(15746);
        myList.add(113125);
        myList.add(1523423);
        myList.add(35435);


        System.out.println(myList.termOfFirst());
        System.out.println(myList.termOfLast());

    }
}