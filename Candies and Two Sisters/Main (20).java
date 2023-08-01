import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,t,n,q;
		
		a=0;
		b=0;
		q=0;
		
		t=sc.nextInt();
		
		int[] v = new int[t];
		
		for(int i = 0;i<t;i++){
		    n=sc.nextInt();
		    if(n<=2){
		        v[i] = 0;
		    }else{
		        a=n-1;
		        b=1;
		        while(a>b){
		            a=a-1;
		            b=b+1;
		            q++;
		            v[i]=q;
		        }
		        q=0;
		    }
		  }
		
		
		for(int k : v){
		    System.out.println(k);
		}
		
		sc.close();
	}
}
