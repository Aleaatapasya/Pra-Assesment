import java.util.Scanner;

public class latihan1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan 4 digit bilangan bulat = ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        System.out.printf("%04d%n", rumus(x));
        System.out.printf("%04d%n", rumus(y));
        System.out.printf("%04d%n", rumus(z));
    }
        // masukkan rumus yang digunakan
        public static int rumus (int a){
            int angka1 = a/1000;
            int sisaHitung = a % 1000;
            int angka2 = sisaHitung / 100;
            sisaHitung = a % 100;
            int angka3 = sisaHitung / 10;
            int angka4 = sisaHitung % 10;

            angka1 = (angka1 + 5) % 10;
            angka2 = (angka2 + 5) % 10;
            angka3 = (angka3 + 5) % 10;
            angka4 = (angka4 + 5) % 10;

            int tukar = angka2;
            angka2 = angka4;
            angka4 = tukar;

            return angka1 * 1000 + angka2 * 100 + angka3 * 10 + angka4;
        }

    }