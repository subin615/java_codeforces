import java.util.*;
class gamestick{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		System.out.println(result(n,m));
	}
	public static String result(int n,int m) {
  		int min=Math.min(n,m);
  		if(min%2==0) return "kagami";
  		return "akashi";
	}

}