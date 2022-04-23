import java.util.Scanner;
public class test {
	public static void main(String[] args){
		Scanner rdbuf = new Scanner(System.in);
		int N = rdbuf.nextInt();
		while(N-- > 0){
			System.out.print(N + " ");
		}
		rdbuf.close();
	}
}
