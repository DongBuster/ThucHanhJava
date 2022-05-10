import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ArrayInt = new ArrayList<>();

        ArrayInt.add(1);
        ArrayInt.add(2);
        ArrayInt.add(3);
        ArrayInt.add(4);

        System.out.println("Các phần tử có trong mảng: ");
        for (int number : ArrayInt) {
            System.out.print(number + "\t");
        }
    }
}
