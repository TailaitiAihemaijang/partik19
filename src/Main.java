import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/10/2023 9:41 AM
 * @Version 1.0
 */
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
// ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
public class Main {
    public static void main(String[] args) {
        int i ;
        int total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Lutfen bir Sayi Giriniz ");
            i = input.nextInt();
            if (i % 2 ==0 && i % 4 ==0){
                total += i;
            }
        }while (i % 2 ==0);
       System.out.println("Toplam sayi :" + total);


    }
}
