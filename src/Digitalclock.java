import java.util.Scanner;
public class Digitalclock {
	public static void main(String args[]){
		int tc,hr,min,i=0;
		int[] rep_dig_arr = {0,1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99};
		int[] rep_dig_arr_hr = new int[rep_dig_arr.length];
		int[] rep_dig_arr_min = new int[rep_dig_arr.length];
		Scanner rdbuf = new Scanner(System.in);
		tc = rdbuf.nextInt();
		int[] output = new int[tc];
		while(i<tc){
			int count = 0;
			hr = rdbuf.nextInt();
			min = rdbuf.nextInt();
			int iter_temp_h=0, iter_temp_m=0;			
			for(int iter=0 ; iter < rep_dig_arr.length ; iter++){
				if(rep_dig_arr[iter] < hr){
					rep_dig_arr_hr[iter_temp_h] = rep_dig_arr[iter];
					iter_temp_h++;
				}
				if(rep_dig_arr[iter] < min){
					rep_dig_arr_min[iter_temp_m] = rep_dig_arr[iter];
					iter_temp_m++;
				}
			}
			for(int j=0 ; j < iter_temp_h ; j++){
				for(int k=0 ; k < iter_temp_m ; k++){
					if(rep_dig_arr_hr[j]%10 == rep_dig_arr_min[k]%10){
						count++;
					}
				}
			}
			output[i] = count;
			i++;
		}
		for(i=0 ; i < tc ; i++){
			System.out.println(output[i]);
		}
		rdbuf.close();
	}
}