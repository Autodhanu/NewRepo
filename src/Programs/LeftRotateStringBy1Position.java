package Programs;

public class LeftRotateStringBy1Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="arun";
		
		char[] ca = str.toCharArray();  //ca['a','r','u','n']
		
		char first = ca[0]; //a
		
		int size = ca.length;
		
		for(int i=0; i<size-1; i++)    //ca['r','u','n','n']
		{
			ca[i]=ca[i+1];
		}
		ca[size-1]=first;              //ca['r','u','n','a']
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : ca)
		{
			sb.append(c);
		}
		
		System.out.println(sb);
	}

}
