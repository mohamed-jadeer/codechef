import java.util.Scanner;
public class int2str {
	public static void main(String[] args){
	int num;
	char[] numc;
	char temp;
	String nums = "";
	Scanner rdbuf = new Scanner(System.in);
	num = rdbuf.nextInt();
	while(num>0){
		nums += (char) (num%10 + '0');
		num = num/10;
	}
	numc = nums.toCharArray();
	for(int i=0 , j=(nums.length()-1) ; i < (nums.length()/2) ; i++,j--){
		temp = numc[i];
		numc[i] = numc[j];
		numc[j] = temp;
	}
	System.out.println(numc);
	String nums1 = new String(numc);
	System.out.println("Number in string is " + nums1);
	rdbuf.close();
}
}