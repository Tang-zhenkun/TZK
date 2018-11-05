public class A {

	public static void main(String[] args) {
		for(int i = 1;i<=9;i++)
		{
		  for(int j = i;j<=9;j++)
		  {
			  System.out.print(i + "X" + j + "=" + i*j);
			  System.out.print(" ");
			  if(j==9)
			  {
				System.out.println();  
			  }
		  }
		  
		}

	}

}
