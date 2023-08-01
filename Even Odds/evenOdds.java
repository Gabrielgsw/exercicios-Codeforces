import java.util.*;
public class evenOdds
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,k;
		
		int j = 1;
		int x = 2;
		n=sc.nextInt(); k=sc.nextInt();
		
		int[] vect = new int[n];
		
		
		
		
		for(int i=1;i<=n;i++){
		    vect[i-1] = j;
		    j+=2;
		    if(vect[i-1]>n){
		        vect[i-1]=x;
		        x+=2;
		    }
		}
		
		System.out.println(vect[k-1]);
		
		
		
		sc.close();
	    
	    
	}
}
