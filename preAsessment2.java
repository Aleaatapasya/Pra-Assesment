import java.util.*;

public class preAsessment2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> str = new ArrayList<>();
        String enkripsi;
        while (true) {
            String kata = in.nextLine();
            if (kata.length() == 2) {
                enkripsi = kata;
                break;
            }
            str.add(kata);
        }
        for (String i : str) {
            String rev = "";
            switch (str.indexOf(i) % 2) {
                case 0:
                    System.out.print(i + enkripsi + " ");
                    break;
                case 1:
                    for (int j = 0; j < i.length(); j++) {
                        rev = i.charAt(j) + rev;
                    }
                    System.out.print(rev + enkripsi + " ");
            }
        }

    }
}
