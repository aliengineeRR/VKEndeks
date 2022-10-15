import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int Kilo;
    double Boy;
    Scanner inp= new Scanner(System.in);

    System.out.println("Lütfen Boyunuzu giriniz: ");
    Boy = inp.nextInt();
    System.out.println("Lütfen Kilonuzu giriniz: ");
    Kilo = inp.nextInt();

    double endeks = Kilo/(Boy * Boy);

    System.out.println("Vücut Kitle endeksiz : " + endeks);

    }
}
