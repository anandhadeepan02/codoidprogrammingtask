package technicaltask;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="anandhadeepan";
String reverse="";
int b=a.length();
for(int i=b-1;i>=0;i--) {
	reverse=reverse+a.charAt(i);

}
System.out.println(reverse);
	}

}
