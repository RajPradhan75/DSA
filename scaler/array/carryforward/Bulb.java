package datastructures.src.com.scaler.array.carryforward;

public class Bulb {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1 };
		System.out.println(solution(arr));

	}

	public static int solution(int[] arr) {

		int count = 0, res = 0;

		for (int i = 0; i < arr.length; i++) {

			/*
			 * if the bulb's original state is on and count is even, it is currently on...
			 */
			/* no need to press this switch */
			if (arr[i] == 1 && count % 2 == 0)
				continue;

			/*
			 * If the bulb's original state is off and count is odd, it is currently on...
			 */
			/* no need to press this switch */
			else if (arr[i] == 0 && count % 2 != 0)
				continue;

			/*
			 * if the bulb's original state is on and count is odd, it is currently off...
			 */
			/*
			 * Press this switch to on the bulb and increase the count
			 */
			else if (arr[i] == 1 && count % 2 != 0) {
				res++;
				count++;
			}

			/*
			 * if the bulb's original state is off and count is even, it is currently off...
			 */
			/*
			 * press this switch to on the bulb and increase the count
			 */
			else if (arr[i] == 0 && count % 2 == 0) {
				res++;
				count++;
			}

		}

		return res;
	}

}
