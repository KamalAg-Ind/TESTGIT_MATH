
public class TestBranch {
	public void operations( String operation)
	{
		int i , j , result=0 ;
		i = 10;
		j = 5;
		if(operation == "sum")
		{
			result = i + j;
		}
		else if ( operation == "sub")
		{
			result = i - j;
		}
		System.out.println("The result is .." + result);
			
		
	}
}
