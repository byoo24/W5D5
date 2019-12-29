import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i*10));
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }
    }
}
