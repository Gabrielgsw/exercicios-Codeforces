import java.util.Scanner;

public class exercicioMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int movimentos = 0;
		int  t = sc.nextInt();
		int n=0;
		//int numero=n;
		
		for(int i=0;i<t;i++) {
			 n = sc.nextInt();
			 int numero =n;
			while(n%6==0 || (n*2)%6==0 ) {
				if(n%6==0) {
					n=n/6;
					movimentos++;
				}else if((n*2)%6==0) {
					n=(n*2)/6;
					movimentos+=2;
				}else if(n%6==0 && (n*2)%6==0) {
					n=n/6;
					movimentos++;
				}
				
				else if(n==1) {
					System.out.println(0);
				}
			
				
				}
						
			
				 if((n==2 || n==4 || n==5 || n%6!=0 || (n*2)%6!=0 )&& n!=1) {
					System.out.println(-1);			
													
				}else if(n==3) {
					System.out.println(2);
				}else{
					System.out.println(movimentos);
					movimentos=0;
				
				
				}
		
		
		
		
		

	

	
		
		}
			sc.close();
	}
}