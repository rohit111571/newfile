
import java.util.*;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j,r,c;
		System.out.println("Enter no of Rows and column");
		r = sc.nextInt();
		c = sc.nextInt();
		int arr[][] = new int[r][c];
		int res[][] = new int[c][r];
		
		System.out.println("Enter Element in matrix");
		for(i = 0;i < r;i++)
		{
			for(j = 0;j < c;j++)
			{
				System.out.print("Enter Element: ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Transpose Matrix");
		for(i = 0;i < c;i++)
		{
			for(j = 0;j < r;j++)
			{
				res[i][j] = arr[j][i];
			}
		}
		for(i = 0;i < c;i++)
		{
			for(j = 0;j < r;j++)
			{
				System.out.print("  "+res[i][j]);
			}
			System.out.print(" \n ");
		}
	}

}

