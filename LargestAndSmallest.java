import java.util.Scanner;

public class LargestAndSmallest {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//input length
		int l = in.nextInt();int a[]=new int[l];
		
		//input array
		for(int i=0;i<l;i++)
			a[i]=in.nextInt();
		
		int largest=a[0],smallest=a[0];
		
		for(int i=0;i<l;i++) {
			if(a[i]>largest)largest=a[i];
			else if(a[i]<smallest)smallest=a[i];
		}
		
		//return
		System.out.println("Largest: "+largest+"\n Smallest: "+smallest);
		in.close();
	}

}
