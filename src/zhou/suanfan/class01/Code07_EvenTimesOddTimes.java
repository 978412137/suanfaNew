package zhou.suanfan.class01;

public class Code07_EvenTimesOddTimes {

	// arr涓紝鍙湁涓�绉嶆暟锛屽嚭鐜板鏁版
	public static void printOddTimesNum1(int[] arr) {
		int eor = 0;
		for (int i = 0; i < arr.length; i++) {
			eor ^= arr[i];
		}
		System.out.println(eor);
	}

	// arr涓紝鏈変袱绉嶆暟锛屽嚭鐜板鏁版
	public static void printOddTimesNum2(int[] arr) {
		int eor = 0;
		for (int i = 0; i < arr.length; i++) {
			eor ^= arr[i];
		}
		// eor = a ^ b
		// eor != 0
		// eor蹇呯劧鏈変竴涓綅缃笂鏄�1
		int rightOne = eor & (~eor + 1); // 鎻愬彇鍑烘渶鍙崇殑1
		int onlyOne = 0; // eor'
		for (int i = 0 ; i < arr.length;i++) {
			if ((arr[i] & rightOne) != 0) {
				onlyOne ^= arr[i];
			}
		}
		System.out.println(onlyOne + " " + (eor ^ onlyOne));
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println(a);
		System.out.println(b);

		int[] arr1 = { 3, 3, 2, 3, 1, 1, 1, 3, 1, 1, 1 };
		printOddTimesNum1(arr1);

		int[] arr2 = { 4, 3, 4, 2, 2, 2, 4, 1, 1, 1, 3, 3, 1, 1, 1, 4, 2, 2 };
		printOddTimesNum2(arr2);

	}

}
