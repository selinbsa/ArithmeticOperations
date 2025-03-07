import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İşlemde kullancağınız ilk sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.println("İşlemde kullancağınız ikinci sayıyı giriniz: ");
        int b = scanner.nextInt();
        System.out.println("İşlemde kullancağınız üçüncü sayıyı giriniz: ");
        int c = scanner.nextInt();

        int total = a+b*c-b;

        System.out.println("Girdiğiniz değerlere göre işlemin sonucu: " + total);


    }
}