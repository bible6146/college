import java.util.ArrayList;
import java.util.Comparator;

public class KnumberTest {

	public ArrayList<Integer> solution(int[] array, int[][] commands) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		
		for (int i = 0; i <commands.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j >= commands[i][0] - 1 && j <= commands[i][1] - 1) {
					temp.add(array[j]);
				}
				if (j == commands[i][1] - 1) {
					temp.sort(new Comparator<Integer>() {

						@Override
						public int compare(Integer o1, Integer o2) {
							return o1 - o2;
						}
					});
					list.add(temp.get(commands[i][2] - 1));
					temp.clear();
					break;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] a = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] b = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
	

	}

}
