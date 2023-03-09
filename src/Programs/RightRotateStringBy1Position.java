package Programs;

public class RightRotateStringBy1Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="arun";  //naru
		
		char[] ca = str.toCharArray();
		
		int size = ca.length;
		
		 char last = ca[size-1]; //n
		
		for(int i=size-1; i>0; i--)   //ca['a','a','r','u']
		{
			ca[i]=ca[i-1];
		}
		ca[0]=last;
		
		StringBuilder sb = new StringBuilder();
		
		for(char c:ca)
		{
			sb.append(c);
		}
		
		System.out.println(sb);
		
	}

}
