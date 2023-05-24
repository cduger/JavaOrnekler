package TasKagıtMakas;

import java.util.Random;
import java.util.Scanner;
public class Oyun {

	public static void main(String[] args) {
		System.out.println("1 taş, 2 kağıt, 3 makas");
		System.out.print("1 ile 3 arasında bir sayı giriniz: ");
		Scanner scan =new Scanner(System.in);

		int hCount=0;
		int mCount=0;
		
		while(true) {
			int x =scan.nextInt();
			System.out.println("Seçtiiğiniz sayı: "+ x);

			int y=(int) (3*Math.random()+1);

			System.out.println("bilgisayarın seçimi:  "+ y);
		
			if(x==1&&y==2) {
				System.out.println("makine kazandı.");
				mCount++;
			}else if(x==1 && y==3) {
				System.out.println("insan kazandı.");
				hCount++;
			}else if(x==2&&y==1) {
				System.out.println("insan kazandı.");
				hCount++;
			}else if(x==2 && y==3) {
				System.out.println("makine kazandı.");
				mCount++;
			}else if(x==3&&y==1) {
				System.out.println("makine kazandı.");
				mCount++;
			}else if(x==3 && y==2) {
				System.out.println("insan kazandı.");
				hCount++;
			}else if(x<1 || x>3) {
				System.out.println("geçerli bir sayı giriniz!!!");
			}else if(x==y) {
				System.out.println("berabere!!!");
			}
			
			if(mCount==3) {
				System.out.println("makine kazandı---insan puanı: "+ hCount + " makine puanı: "+mCount);
			}else if(hCount==3) {
				System.out.println("insan kazandı---insan puanı: "+ hCount + " makine puanı: "+mCount);
			}
		}

	}

}
