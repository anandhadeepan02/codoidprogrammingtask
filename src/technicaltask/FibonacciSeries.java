package technicaltask;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s1=0,s2=1,s3;
int count=10;
System.out.println("Fibonacci series till "+count+" terms");
for(int i=1;i<=count;i++) {
	
	System.out.print(s1+",");
s3=s1+s2;
s1=s2;
s2=s3;

}
	}

}
