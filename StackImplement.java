import java.util.Iterator;
import java.util.Stack;
public class StackImplement{
    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push("hbxuydsg");
        stack.push(154);
        stack.push(15);
        stack.push("vhj");
        stack.push(1.0);
    
       // stack.show();
    //System.out.println("Stack is"+ stack);
    Iterator iterator = stack.iterator();  
while(iterator.hasNext())  
{  
Object values = iterator.next();  
System.out.println(values);   
} 
    }
    }