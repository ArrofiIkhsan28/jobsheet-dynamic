package ORETAN1;
import java.math.BigInteger;
import java.util.Scanner;
public class tug1 {
private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("100, 500, 1000, 2000, 5000\n");
    }
  public static void main(String[] args) {
        String identitas = "arrofi ikhsan nur abror / XRPL2 / 08";
        
        tampilJudul(identitas);
  int n = tampilInput();
    BigInteger hasil = fibo(n);
    tampilHasil(n, hasil);}
  private static int tampilInput() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Bilangan Ke - : ");
        int n = scanner.nextInt();
        
        return n;
    }
    private static BigInteger fibo(int n) {
        
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] =  BigInteger.ONE;
        
        for(int i = 2; i < n; i++) {
            hasil[i] = hasil[i-1].add(hasil[i-2]);
        }
        
        return hasil[n-1];
    }
    private static void tampilHasil(int n, BigInteger hasil) {
        System.out.println("Bilangan Fibonacci Ke - "+n+" : "+hasil);
    }
}
