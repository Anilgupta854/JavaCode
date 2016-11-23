package Basic;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTestGeneric {
	public static void main(String[] args) {

		Double[] doubleElement = {2.1, 4.5, 8.9, 4.3, 3.3};
		Integer[] integerElement = {2, 4, 6, 8, 1, 3};
		Character[] charElement = {'a', 'r', 't', 'i','q'};
		
		Stack<Double> doubleStack = new Stack<Double>();
		Stack<Integer> integerStack = new Stack<Integer>();
		Stack<Character> CharacterStack = new Stack<Character>();
		
		pushDouble("DoubleStackeElement", doubleStack, doubleElement);
		popDoubleElement("DoubleStack", doubleStack);
		
		pushDouble( "integerStack", integerStack, integerElement );
		popDoubleElement( "integerStack", integerStack );

	pushDouble("CharacterStackElement", CharacterStack, charElement);
		popDoubleElement("CharacterStack", CharacterStack);
	}
 
	private static<T> void pushDouble(String name , Stack<T> stack, T[] elements) {
		
		System.out.printf("Pushing Element into %s\n", name);
		
		for(T element:elements){

			System.out.println( element);
			
			stack.push(element);
			
		}
		
	}

	private static <T> void popDoubleElement(String name, Stack<T> stack) {
		
		try{
			System.out.println();
			System.out.printf("Poping Element from %s\n", name);
			
			while(true){
				T popvalue;
				
				popvalue =stack.pop();
				
				System.out.printf("%s, ", popvalue);
		}
			
		}
		
		catch(EmptyStackException e){
			System.out.println();
			System.out.println("---------- Stack is Empty------------ ");
		}
			
		}

}
