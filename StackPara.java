
import java.util.Scanner;
import java.util.Stack;

public class StackPara {

    void stackDemo() {
        Stack<Character> stack = new Stack<>();

        stack.push('R');
        stack.push('O');
        stack.push('Y');
        stack.push('A');
        stack.push('L');

        System.out.println(stack.pop());//L 
        System.out.println(stack.pop());//A 
        System.out.println(stack.pop());//Y 
        System.out.println(stack.pop());//O 
        System.out.println(stack.pop());//R 
        System.out.println(stack.pop());//L 

    }

    public static void main(String[] args) {
        Scanner scr  = new Scanner(System.in); 
        Stack<Character> stack = new Stack<>();

        System.out.println("Enter String : ");
        String para  = scr.next();// [ { [  (  ) ] } ]


        for(int i=0;i<para.length();i++){
            char x = para.charAt(i); //[
            
            if(x == '[' || x == '{' || x == '('){
                stack.push(x);
            }
        }
        //stack string 
        
        System.out.println(stack);





    }
}


//Stack 
