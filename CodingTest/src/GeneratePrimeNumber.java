import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratePrimeNumber {
	
	public static int solution(int[] nums) {
		int answer = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int z=j+1;z<nums.length;z++) {
					answer+=check(nums[i]+nums[j]+nums[z]);
				}
			}
		}
        return answer;
    }
	public static int check(int a) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		
		System.out.println(solution(a));

	}

}
