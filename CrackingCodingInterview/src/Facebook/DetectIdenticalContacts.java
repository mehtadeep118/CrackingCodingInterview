package Facebook;

/*
 * Given an array of contacts with phone numbers/emails you should detect and union identical contacts. 

For example, given the following contacts array: 

[ [ "John", "john@gmail.com", "john@fb.com"], 
[ "Dan", "dan@gmail.com", "+1234567"], 
[ "john123", "+5412312", "john123@skype.com"], 
[ "john1985", "+5412312", "john@fb.com"] ] 

We can see that john1985, John and john123 are the same person by their contact information. 
 * 
 * 
 */
public class DetectIdenticalContacts {
	
	public static void main(String[] args)
	{
		String[][] s={{"John", "john@gmail.com", "john@fb.com"},{"Dan", "dan@gmail.com", "+1234567"},{"john123", "+5412312", "john123@skype.com"}};
		detect(s);
	}
	
	public static void detect(String[][] a)
	{
		int col=a[0].length;
		int row=a.length;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		
	}

}
