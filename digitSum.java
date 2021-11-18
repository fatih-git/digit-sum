import java.util.Scanner;

/**
 * @author fatih-git
 */

public class digitSum {

    public static void main(String[] args) {

        int giris, sum=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        giris=input.nextInt();

        while(giris!=0){
            sum+=giris%10;
            giris/=10;
        }

        System.out.println("Girilen sayının basamakları toplamı= "+sum);

    }

}
