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
			System.out.println("��������һ�����Ӵ�����");
			break;
		case 'b':
			System.out.println("�������ڶ������ӵ�С��");
			break;
		case 'c':
			System.out.println("������������������ѩɽ");
			break;

		default:
			System.out.println("��֪�����ڼ�");
			break;
		}
	}
}
