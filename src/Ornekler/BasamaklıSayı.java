package Ornekler;

import java.util.Scanner;

public class BasamaklıSayı {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("oluşturulacak basamak sayısını giriniz: ");
		int sayi=scan.nextInt();
		
		for(int i=1; i<=sayi; i++) {
			
			for(int j=0; j<i; j++) {
				
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
