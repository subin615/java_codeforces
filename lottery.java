import java.util.Scanner;
class lottery{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		System.out.println(win(n));
	}
	public static int win(long n){
		int[] arr=new int[]{100,20,10,5,1};
		int count=0,i=0;
		long sum=0;
		while(n>sum){
			long diff=n-sum;
			if(diff>=arr[i]){
				sum+=arr[i];
				count++;
			}
			else i++;
			if(sum==n) return count;
			
		}
		return count;
	}
}