import java.util.Scanner;

public class sayilarlabol {
    public static void main(String[] args) {

        int n;
        int total = 0;

        Scanner tuba =new Scanner(System.in);

        do {
            System.out.print("sayıyı giriniz:");
            n= tuba.nextInt();
            if(n % 2 == 0 && n % 4 == 0){
                total += n;

            }

        }while (n>0);
        System.out.println("toplam:"+total);



    }
}
