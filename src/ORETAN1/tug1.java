package ORETAN1;
import java.util.Scanner;
public class tug1 {
private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("100, 500, 1000, 2000, 5000\n");
    }
  public static void main(String[] args) {
        String identitas = "arrofi ikhsan nur abror / XRPL2 / 08";
        
        tampilJudul(identitas);}
  int n = tampilInput();
  private static int tampilInput() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Bilangan Ke - : ");
        int n = scanner.nextInt();
        
        return n;
    }
}
