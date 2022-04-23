import java.util.Scanner;
public class LEPERMUT {
	public static void main(String[] args){
		int tc,N,flag;
		Scanner rdbuf = new Scanner(System.in);
		tc = rdbuf.nextInt();
		int[] ansarr = new int[tc];
		while(tc > 0){
			N = rdbuf.nextInt();
			int[] temparr = new int[N];
			for(int i=0 ; i < N ; i++){
				temparr[i] = rdbuf.nextInt();
			}
			//System.out.println("Size of Array=" + N);
			/*for(int j=0 ; j < N ; j++){
				System.out.print(temparr[j]);
			}*/
			flag=1;
			for(int i=0 ; i < N ; i++){
				if(temparr[i] == i+1)
					continue;
				else{
					if(temparr[i] == i+2 && temparr[i+1] == i+1){
						i++;
						continue;
					}
					else{
						//System.out.println("Execution enters else with i=" + i + " length=" + ansarr.length + " and tc=" + tc);
						ansarr[ansarr.length - tc] = 0;
						flag = 0;
						break;
					}
				}
			}
			if(flag == 1){
				ansarr[ansarr.length - tc] = 1;
				tc--;
			}
			else
				tc--;
		}
		for(int i=0 ; i < ansarr.length ; i++){
			//1 means YES and 0 means NO
			//System.out.println(ansarr[i]);
			if(ansarr[i] == 1){
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
		rdbuf.close();
		//System.out.println("You have " + tc + "chances");
	}
}
