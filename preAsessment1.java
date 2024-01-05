import java.util.Scanner;

public class preAsessment1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input data
        int totalKlik = in.nextInt();

        // penyelesaian
        int[] klikLampu = new int[totalKlik];
        for (int i = 0; i < klikLampu.length; i++)
            klikLampu[i] = in.nextInt();
        for (int i : klikLampu) {
            switch (i % 4) {
                case 0:
                    System.out.println("MATI MATI");
                    break;
                case 1:
                    System.out.println("HIDUP MATI");
                    break;
                case 2:
                    System.out.println("HIDUP HIDUP");
                    break;
                case 3:
                    System.out.println("MATI HIDUP");
                    break;
            }
        }
    }
}
