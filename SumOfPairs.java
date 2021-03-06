import java.util.Arrays;

public class SumOfPairs {

	public static void main(String[] args) {
		
		findPairs(new int[]{1,3,5,8,9,4,10,7}, 8,8);

	}

	private static void findPairs(int[] is, int i,int sum) {
		
		int l, r;
		 
        /* Sort the elements */
        Arrays.sort(is);
 
        /* Now look for the two candidates 
        in the sorted array*/
        l = 0;
        r = i - 1;
        while (l < r) {
            if (is[l] + is[r] == sum) {
               System.out.println(is[l]+" ,"+is[r]);break;}
            else if (is[l] + is[r] < sum)
                l++;
            else 
                r--;
        }
		
	}

}
