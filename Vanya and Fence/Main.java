package Application;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n,h,count;
	    count=0;
	    
	    n=sc.nextInt(); h=sc.nextInt();
	   
	    
	    int[] vector = new int[n];
	    
	    for(int i=0;i<n;i++){
	        vector[i]=sc.nextInt();
	        if(vector[i]>h){
	            vector[i]=2;
	            count+=2;
	        }else{
	            vector[i]=1;
	            count+=1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	    
	    sc.close();
	}
}