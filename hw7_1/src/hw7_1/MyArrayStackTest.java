package hw7_1;

import java.util.Scanner;

public class MyArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1: ������");

		MyArrayStack stack=new MyArrayStack(5);
		Scanner s=new Scanner(System.in);
		int t;
		do {
			System.out.println("1:���� 2:���� 3:��ȸ 4:�հ� 5:����");
			t=s.nextInt();
			switch(t) {
			case 1://1 ���ý� ����ڷκ��� �������� �ϳ� �Է¹޾� ���ÿ� ����(push)
				System.out.println("������ ������ �Է�:");
				int p=s.nextInt();
				stack.push(p);
				break;
			case 2://2 ���ý� ���ÿ��� ����(pop)�Ͽ� ���ϵ� ���� ���
				System.out.println("pop: "+stack.pop());
				break;
			case 3://3 ���ý� ���ÿ��� ��ȸ(peek)�Ͽ� ���ϵ� ���� ���
				System.out.println("peek: "+stack.peek());
				break;
			case 4://4 ���ý� ������ �� ����(isEmpty)���� ��� ����(pop)�Ͽ� ���� ���
				int sum=0;
				while(!stack.isEmpty()) sum+=stack.pop();
				System.out.println("sum: "+sum);
				break;
			default:
				System.out.println("�Է� ����.");
			}

		}while(t!=5);
		System.out.println("����.");
	}

}
