 import java.util.*;

class MultiplyMatrix{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i,j,k,r1,r2,c1,c2;
		System.out.println("Enter no of rows and column for 1st matrix");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		System.out.println("Enter no of rows and column for 2nd matrix");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		
		while(c1 != r2)
		{
			System.out.println("Error ! rows and column are not compatable for multiply Enter again");
			System.out.println("Enter no of rows and column for 1st matrix");
			r1 = sc.nextInt();
			c1 = sc.nextInt();
			System.out.println("Enter no of rows and column for 2nd matrix");
			r2 = sc.nextInt();
			c2 = sc.nextInt();
		}
		int a1[][] = new int[r1][c1];
		int a2[][] = new int[r2][c2];
		int a3[][] = new int[r1][c2];
		
		System.out.println("Enter data in 1st Matrix");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print("Enter Element: ");
				a1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter data in 2nd Matrix");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print("Enter Element: ");
				a2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Multiplication of Matrices");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				for(k=0;k<c1;k++)
				{
					a3[i][j] = a1[i][k] * a2[k][j];
				}
			}
		}
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print("  "+(a3[i][j]));
			}
			System.out.print(" \n ");
		}
	}
}
