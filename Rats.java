import java.util.Scanner;

class rats{
 	public static void main(String[] args) {
 		Scanner scan =new Scanner(System.in);
 		int N=scan.nextInt();
 		System.out.println(count(N));
 		
 	}
 	public static int count (int N){
 		int[] white=new int[N+1];
 		
 		int whiteRat=1,blackRat=1;
 		int tempblack=1,tempwhite=1;
 	
 		white[0]=1;

 		for(int i=1;i<=N;++i){
 			if(i>=3){
 				tempwhite=tempwhite-white[i-3]+(tempwhite-white[i-3])*3;
 				white[i]=tempwhite;
 			}
			else{
 				tempwhite=tempwhite+tempwhite*3;
 				white[i]=tempwhite;
 			}
 			if(i>=2) tempblack=tempblack*2;
 			else tempblack=tempblack+tempblack*2;
 		}
 		
 		return tempwhite+tempblack;
 	}

}