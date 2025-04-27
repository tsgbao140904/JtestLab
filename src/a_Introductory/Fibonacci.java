package a_Introductory;

public class Fibonacci {
	public int fib(int n) {
		switch (n) {
			case 0: return 0;
			case 1: return 1;
			default: return fib(n - 1) + fib(n - 2); // Đúng : không cộng thêm 1 nữa, chỉ cộng 2 giá trị fib trước đó.
														// ⚠️ Sai: tự ý cộng thêm +1 → kết quả Fibonacci bị lệch. return (fib(n - 1) + fib(n - 2)) + 1;
		}
	}
}
