import java.util.Scanner;

class Shovel{
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int k=scan.nextInt();
	int r=scan.nextInt();
	System.out.println(test(k,r));	
	}
	public static int test(int k,int r){
		int rem=k%10;
		int sum=0,count=2;
		if(rem ==0) return 1;
		if(rem==r) return 1;
		else{
			while(sum==0){
				sum=k*count;
				if(sum%10==0) return count;
				if(sum%10==r) return count;
				else {
					sum=0;
					count++;
				}

			}
		}
		return 1;

	}
}