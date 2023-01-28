package JavaTutorial;


import java.util.*;

public class JavaVariables {

	public static void main(String[] args) 
	{
		int myNum =5;
		String name="This is String Variable";
		
		System.out.println(myNum);
		
		// Array
		
		String[] arr= new String[5];
				// In this we declared array and New is creating memory allocation but not assiging values
		arr[0]="this";
		arr[1]="one";
		arr[2]="array";
		arr[3]="list";
		arr[4]="value";
		
		// Creating array by assigning values directly
		
		int[] arr1= {99,97,95,94,95};
		
		
		
		
		//loop Conditions
	
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int j=0; j<arr1.length;j++)
		{
			System.out.println(arr1[j]);
		}
		List<int[]> convertedArrayList=Arrays.asList(arr1);
		System.out.println(convertedArrayList.contains("99"));
		
		//ArrayList
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("ArrayList Value");
		al.add("This is arrayList");
		for (String s : al)
		{
			System.out.println(s);
			
		}
		JavaVariables gd= new JavaVariables();
		gd.getData();
		
		
		
		
		
		

	}
	
	public void getData()
	{
		System.out.println("This is method returns nothing");
	}

}
