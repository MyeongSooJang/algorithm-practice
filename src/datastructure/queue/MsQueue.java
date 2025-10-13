package datastructure.queue;

import java.util.Stack;

public class MsQueue {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int value) {
        if(!stack2.isEmpty()){
            while(!stack2.isEmpty()){
                int component = stack2.pop();
                stack.push(component);
            }
        }
        stack.push(value);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack.isEmpty()) {
                int component = stack.pop();
                stack2.push(component);
            }
        }
        return stack2.pop();
    }

    public void print(){
//        for(int i : stack2){
//            System.out.print(i+" ");
//        }
        for(int i = stack2.size()-1; i>=0; i-- ){
            System.out.print(stack2.get(i) + " ");
        }
        for(int i = 0; i <= stack.size()-1; i++ ){
            System.out.print(stack.get(i)+ " ");
        }
    }
}
