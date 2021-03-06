
public class MissingNumber {

	public static void main(String[] args) {
		
		missingNumber(new int[]{1,3,4,6,7,8,10},7);
		findOnemissingNum(new int[] {1,3,4,5},4);
	}
	
	//approach 1: one or more missing number
	public static void missingNumber(int input[], int length) {
		
		int[] temp = new int[input[input.length-1]+1];
		 for(int i:input) {
			 temp[i]=1;
		 }
		 
		 for(int i=1;i<temp.length;i++) {
			 if(temp[i]==0)System.out.print(i + " ");
		 }
	}
	
	//approach 2: finding 1 missing number
	public static void findOnemissingNum(int a[],int n) {
		int i, total;
        total = (n + 1) * (n + 2) / 2;
       
        for (i = 0; i < n; i++)
            total -= a[i];
        
        System.out.println(total);
	}

}
