import java.util.*;
class ringroad{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[] a=new int[m];
		for(int i=0;i<m;++i) a[i]=s.nextInt();
		System.out.println(test(n,m,a));
	}
	public static int test(int n,int m,int[] a){
		int path=a[0];
		int i=0,count=a[0]-1;
		while(i<a.length-1){
			if(a[i]>a[i+1] && a[i]<=n){
				path++;
				count++;
				if(path>n) path%=4;
			}
			else if(a[i]<a[i+1]){
				path++;
				count++;

			}
			if(path==a[i+1]) ++i;

		}
		return count;
	}
}
