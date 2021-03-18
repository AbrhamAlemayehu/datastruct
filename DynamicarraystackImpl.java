package pro2;

public class DynamicarraystackImpl {

	public static void main(String[] args) {
		
		Dynamicarstack stack = new Dynamicarstack();
		stack.push(0);
		stack.show();
		stack.push(6);
		stack.show();
		stack.push(8);
		stack.show();
		stack.push(11);
		stack.show();
		stack.push(18);
		stack.show();
		
        stack.peek();
        stack.show();
        stack.pop();
		stack.show();

		 stack.pop();
		stack.show();
                stack.pop();
		stack.show();
                stack.pop();
		stack.show();
        
	}

}