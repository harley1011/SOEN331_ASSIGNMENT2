
public class Test {
	public static void main(String[] args) {
		Stack stack = new Stack(0);			
		stack.push("All");
		stack.push("your");
		stack.push("base");
		stack.push("are");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
}