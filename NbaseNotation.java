/*Question

N-base notations are writing the numbers in the different n symbols
decimal to N-base notations are in (0:0,1:1,.....9:9,10:A,11:B.....35:Z).
steps
1.Divide the decimal number bt n,treat the division as the integer division 
2.write the remainder (in n-base notation)
3.divide the quotient again by n.Treat the division as integger division
4.repeat step1 and step2 until we get 0 as quotient.
5.the n-base value is the sequence of the remainder from last to first.


Condition:where n should be in the range 2 and 36.

*/


import java.util.Scanner;
class NbaseNotation{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num=scan.nextInt();
		System.out.println(test(n,num));
	}
	public static String test(int n,int num){
		int rem=0;
		char c='A';
		String str="";
		while(num!=0){
			rem=num%n;
			num=num/n;
			if(rem>9){
				c=(char)('A'+(rem-10));
				str=str+c;
			}
			else str=str+rem;
		}
		String rev="";

		for(int i=str.length()-1;i>=0;--i){
			rev=rev+str.charAt(i);
		}
		return rev;
	}
}