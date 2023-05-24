package BasamakSayisi;

import java.util.Scanner;

public class Basamak {

	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		
		int num=scan.nextInt();
		int count=0;
		
		while(num>0){
			num=num/10;
			count++;
		}System.out.println("Sayı "+count+" basamaklıdır.");
	}
}
