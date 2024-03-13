import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner SC = new Scanner(System.in);
	    int n,i,j;
	    n = SC.nextInt();
	    int arr[][] = new int[n][];
        for(i=0; i<n;i++)
        {
            arr[i] = new int[SC.nextInt()];
        }
        for(i=0; i<arr.length; i++)
        {
            for(j=0; j<arr[i].length; j++)
            {
                arr[i][j] = SC.nextInt();
	        }
        }
        for(i=0; i<arr.length; i++)
        {
            for(j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.print("\n");
        }
	}
}
