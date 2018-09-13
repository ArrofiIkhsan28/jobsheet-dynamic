package ORETAN1;

import java.math.BigInteger;
import java.util.Scanner;

public class ORETAN1 {
 private static void tampiljudul(String identitas){
     System.out.println(identitas +"identitas");
     
     System.out.println("\nhitung fibonnaci");
     System.out.println("1,1,2,3,5,8,13....dst.\n");
 }
 public static void main(String[]args){
      
     String identitas = (" arrofi ikhsan nur abror / xrpl2/08");
     tampiljudul(identitas);
 int n = tampilInput();
 BigInteger hasil = fibo(n);
 }
     private static int tampilInput() {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         return n;
     }
     {
        
     }
     private static BigInteger fibo (int n){
         BigInteger [] hasil = new BigInteger[n];
         
         hasil [0] = BigInteger.ONE;
         hasil [1] = BigInteger.ONE;
         for (int i = 0; i < n; i++) {
             hasil[i] = hasil[i-1].add(hasil[i-2]);
             
         }
         return hasil [n-1];
     }
 }
    

