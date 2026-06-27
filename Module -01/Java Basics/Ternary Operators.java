public class Main
{
	public static void main(String[] args) {
		int a = 30, b = 30;
		
		System.out.println((a == b) ? 1 : 0); // 20 == 30 -> false
		System.out.println((a != b) ? 1 : 0); // 20 != 30 -> true
		System.out.println((a > b) ? "Yes" : "No"); // 20 > 30 -> false
		System.out.println((a >= b) ? 'Y' : 'N'); // 20 >= 30 -> false || 30 >= 30 true
		System.out.println((a < b) ? 10 : 20); // 20 < 30 -> true
		System.out.println((a <= b) ? a : b); // 20 <= 30 -> true  | 30 <= 30 true
	}
}
