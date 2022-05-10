import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) {
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("java");
        arrListString.add("ok");
        arrListString.add("c#");

        System.out.println("Các phần tử có trong mảng: ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }
    }

}
