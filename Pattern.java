import java.util.Scanner;
public class Pattern {
	
	public static void main(String[] args) {
		
		
		int n,i,j,k;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of rows  : ");
		
		n = input.nextInt();
		
	    for(i=1 ;i<=n;i++){

            k=i;

            for(j=1;j<=2*n-1;j++){

                if(j>=n+1-i && j<=n-1+i) {

                        System.out.print(k);;

                        if(j<n) k++;
                        
                        else k--;

                }

                else{

                        System.out.print(" ");

                }

            }

    System.out.println();

	    	}
}
		
	}


