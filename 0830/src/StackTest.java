import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		
		System.out.println(stack.pop()); //마지막에 있는게 제일 먼저나옴 
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
