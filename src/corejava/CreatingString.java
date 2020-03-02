package corejava;

public class CreatingString {

	public static void main(String[] args) {
		String s1="yurrrr";
		String s2="yurrrr";
		
		String s3=new String("hello");
		String s4=new String("hello");
		if(s1==s2)
		{
			System.out.println("s1 and s2 references are equal");
		}
		if(s3==s4)
		{
			System.out.println("s3 and s4 references are equal");
		}
		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 content is same");
		}
		if(s3.equals(s4))
		{
			System.out.println("s3 and s4 content is same");
		}

	}

}
