/*
 * Programmer Name: Marcus Brown
 * Class Name: ChangeStack
 * Date: 8/04/2023
 * Course CIS2353
 * Purpose Statement: Produce an application that implements a stack like data structure using a linked chain of nodes.
 */

public class Test{

    public static void main(String[] args) {
        ChangeStack stack = new ChangeStack();

        // stack.peekTop();
        System.out.println();

         stack.push(36);
         stack.push(2);
         stack.push(1);
         stack.push(22);
         stack.push(72);
         stack.push(19);
         stack.displayStack();
         stack.pop();
         System.out.println(" ");

         stack.displayStack();

         stack.increaseValues(2, 30);
         System.out.println();
         stack.displayStack();

         System.out.println();
         stack.decreaseValues(2, 30);
         stack.displayStack();

         System.out.println();
         System.out.println(stack.peekTop());

    }
    
}
