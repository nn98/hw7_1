package hw7_1;

import java.util.Scanner;

public class MyArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1: 김윤서");

		MyArrayStack stack=new MyArrayStack(5);
		Scanner s=new Scanner(System.in);
		int t;
		do {
			System.out.println("1:삽입 2:삭제 3:조회 4:합계 5:종료");
			t=s.nextInt();
			switch(t) {
			case 1://1 선택시 사용자로부터 정수값을 하나 입력받아 스택에 삽입(push)
				System.out.println("삽입할 정수값 입력:");
				int p=s.nextInt();
				stack.push(p);
				break;
			case 2://2 선택시 스택에서 삭제(pop)하여 리턴된 값을 출력
				System.out.println("pop: "+stack.pop());
				break;
			case 3://3 선택시 스택에서 조회(peek)하여 리턴된 값을 출력
				System.out.println("peek: "+stack.peek());
				break;
			case 4://4 선택시 스택이 텅 빌때(isEmpty)까지 모두 삭제(pop)하여 합을 출력
				int sum=0;
				while(!stack.isEmpty()) sum+=stack.pop();
				System.out.println("sum: "+sum);
				break;
			default:
				System.out.println("입력 오류.");
			}

		}while(t!=5);
		System.out.println("종료.");
	}

}
