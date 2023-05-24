package Sekil;

public class AzalanSekil {
	static int count=6;
	public static void main(String[] args) {
		
		for(int i=0;i<6;i++) {
			
			for(int j=0;j<count;j++) {
				System.out.print("*");
				
			}
			count--;
			System.out.println();
		}
		AzalanSekil a=new AzalanSekil();
		a.run();
	}
	
	void run() {
		for(int i=0; i<9; i++) {
			System.out.print(count);
			
			
		}
	}
	

}
