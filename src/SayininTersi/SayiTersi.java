package SayininTersi;

import java.util.Scanner;
public class SayiTersi {

	public static void main(String[] args) {
		// girilen sayının tersi
		Scanner scan=new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int num=scan.nextInt();
		int ters=0;

		while(num>0) {
			ters=ters*10;
			ters=ters+num%10;
			num=num/10;
		}System.out.println("Sayının tersi: "+ters);
		
	}

}
