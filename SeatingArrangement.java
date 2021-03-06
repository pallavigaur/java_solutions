import java.util.Scanner;

public class SeatingArrangement {
	
	 public static void main(String args[] ) throws Exception {
	        
	        Scanner input = new Scanner(System.in);

	        //test cases
	        int t = input.nextInt();

	        int n[]=new int[t];

	        //input seat number
	        for(int i=0;i<t;i++) {
	        	 n[i]=input.nextInt();
	        	 findFacingSeat(n[i]);
	        }
	    }

	    private static void findFacingSeat(int n){

	        String seat = "";
	        int opp=0;

	        if(n>=1 && n<=108){
	        
	            //position
	            if(n%6==0 || n%6==1)seat="WS";
	            else if(n%6==2 || n%6==5) seat = "MS";
	            else seat = "AS";

	            //opposite seat
	            int rem = n%12;
	            switch(rem){
	                case 0:opp=n-11; break;
	                case 1:opp=n+11; break;
	                case 2:opp=n+9; break;
	                case 3:opp=n+7; break;
	                case 4: opp=n+5; break;
	                case 5:opp=n+3; break;
	                case 6:opp=n+1; break;
	                case 7:opp=n-1; break;
	                case 8:opp=n-3; break;
	                case 9:opp=n-5; break;
	                case 10:opp=n-7; break;
	                case 11:opp=n-9; break;
	            }
	        }System.out.println(opp+" "+seat);
	    }

}
