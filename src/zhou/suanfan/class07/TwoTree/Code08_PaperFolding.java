package zhou.suanfan.class07.TwoTree;

public class Code08_PaperFolding {

	public static void printAllFolds(int N) {
		printProcess(1, N, true);
	}

	// 閫掑綊杩囩▼锛屾潵鍒颁簡鏌愪竴涓妭鐐癸紝
	// i鏄妭鐐圭殑灞傛暟锛孨涓�鍏辩殑灞傛暟锛宒own == true  鍑�    down == false 鍑�
	public static void printProcess(int i, int N, boolean down) {
		if (i > N) {
			return;
		}
		printProcess(i + 1, N, true);
		System.out.println(down ? "凹 ": "凸");
		printProcess(i + 1, N, false);
	}

	public static void main(String[] args) {
		int N = 3;
		printAllFolds(N);
	}
}
