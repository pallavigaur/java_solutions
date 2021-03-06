import java.util.Arrays;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		findDuplicate(new int[] {1,2,2,3,4,4,5},7);

	}

	private static void findDuplicate(int[] is, int i) {
		
		//sort
		Arrays.sort(is);
		
		//temp
		int temp[] = new int[i];
		
		//store previous
		int prev = is[0];
		temp[0] = prev;
		
		//iterate
		for(int j=1;j<i;j++) {
			int ch = is[j];
			if(ch!=prev)temp[j]=ch;
			prev=ch;
		}
		
		for(int it:temp)System.out.print(it+" ");
		
	}

}
