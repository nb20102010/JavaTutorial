package Demo;

public class Demo2 {
	
	public static void main(String[] args) {
//		int a = 12;
//		if(a > 18) {
//			System.out.println("a > 18");
//		} else if(a > 10 && a <= 18) {
//			System.out.println("a > 10 && a <= 18");
//		} else {
//			System.out.println("a <= 10");
//		}
		
		char c = 'a';
		
		switch (c) {
		case 'a':
			System.out.println("今天星期一，猴子穿新衣");
			break;
		case 'b':
			System.out.println("今天星期二，猴子当小二");
			break;
		case 'c':
			System.out.println("今天星期三，猴子爬雪山");
			break;

		default:
			System.out.println("不知道星期几");
			break;
		}
	}
}
