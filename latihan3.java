import java.util.Scanner;
public class latihan3 {
    public static void main(String[]args ){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan Jenis Kelamin = ");
        String jenisKelamin= input.nextLine();
        System.out.print("Masukkan berat badan = ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan = ");
        double tinggiBadan = input.nextDouble();

        //rumus BMI
        double tinggiBadan2 = tinggiBadan / 100; 
        double hasil = (beratBadan / (tinggiBadan2 * tinggiBadan2));

        System.out.printf("%.2f", hasil );
        kategori (jenisKelamin, hasil);
    }

    public static void kategori(String jenisKelamin, double hasil) {
        switch (jenisKelamin){
            case "Pria" :
                 if (hasil < 20.50){
                    System.out.println( ", Kurus");
                }
                else if (hasil > 20.50 && hasil < 26.99){
                    System.out.println(", Ideal");
                }
                else if (hasil >= 27.00){
                    System.out.println(", Gemuk");
                }
                else{
                    System.out.println("Maaf Inputan Salah");
                }
            break;
            
            case "Wanita":
                if (hasil < 18.50){
                    System.out.println(", Kurus");
                }
                else if (hasil > 18.50 && hasil < 24.99){
                     System.out.println(", Ideal");
                }
                else if (hasil >= 25.00){
                    System.out.println(", Gemuk");
                }
                else {
                    System.out.println("Maaf inputan yang anda masukkan salah.");
                }
            break;
            }
        }               
}
    
    

