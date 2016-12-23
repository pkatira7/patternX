
public class patternX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for (i = 0 ; i<=4 ; i++ )
		{
			for (  j=0 ; j<=4;  j++)
			{
				if (i == j || i+j==4 )
					System.out.print("*");
					System.out.print(" ");
			}
			System.out.println();
				
		}
		
		
	}

}
