package JavaPackage;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[][]= {{1,2},{3,4},{5,6}};
		int column=a.length;
		int row=a[0].length;
		
		for(int i=0; i<=row;i++)
		{
			for(int j=0; j<column-1;j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}

}
