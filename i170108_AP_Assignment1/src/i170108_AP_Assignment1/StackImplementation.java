package i170108_AP_Assignment1;
//Using the MyStack class.
public class StackImplementation{
	public static void main(String [] args){
		Stack stack = new Stack(5); //create stack of size = 5
		try{
			stack.push(10); //push num=10
			stack.push(12); //push num=12
			stack.push(14); //push num=14

			System.out.println("Top Element : " + stack.pop());

			stack.push(16); //push num=16
			stack.push(18); //push num=18
			
			stack.display(); //display stack.
			System.out.println("Size = "+stack.size); //get size
			
			stack.pop();          //remove topmost element
			stack.display(); //display stack.
			stack.pop();          //remove topmost element
			stack.display(); //display stack.
			stack.pop();          //remove topmost element
			stack.display(); //display stack.
			stack.pop();          //remove topmost element
			stack.display(); //display stack.
			stack.pop();          //remove topmost element
			stack.display(); //display stack.
			
			System.out.println("Size = "+stack.size); //get size
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}