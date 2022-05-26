
package Test;
import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
					
		}
		
		int count=0;
		
		breakloop:
		for(int i=0;i<n;i++) {
			for(int k=i+1;k<n;k++) {
				for(int j=k+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
					if(j==n-1) {
						break breakloop;
					}
				}
			}
		}
		
		System.out.println(n-count);
        
	}

}



// List<Integer> li=new ArrayList<Integer>();
for(int i=0;i<n)