import java.util.Scanner;

public class VasyaTheHispster
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		a = sc.nextInt(); b=sc.nextInt();
		
		if(a>b){
		    System.out.print(b+" ");
		    if((a-b)>= 1){
		        System.out.print((int)(a-b)/2);
		    }else{
		        System.out.print(0);
		    }
		}else if(b>a){
		    System.out.print(a+" "); 
		    if((b-a)/2>=1){
		       System.out.print((int)(b-a)/2); 
		    }else{
		        System.out.print(0);
		    }
		}else if(b==a){
		    System.out.print(b+" "); System.out.print(0);
		}else if(a==0 || b==0){
		    System.out.print(0+" "+0);
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}
}
