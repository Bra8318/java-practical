public class stack{
     int maxSize;
     int TOP;
    int[] stackList;

    public stack (int size){
        maxSize = size;
        stackList = new int[maxSize];
        TOP = -1;
    }
    public void push(int value){
        if (TOP == maxSize-1){
            System.out.println("Stack Overflow "+ value);
        }
        else{
            TOP++;
            stackList[TOP] = value;
        }
    }
    public int pop(){
        if (TOP == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int value = stackList[TOP];
            TOP--;
            return value;
        }
    }

    public static void main(String args[]){
        stack s = new stack(4);
        s.push(389);
        s.push(154);
        s.push(15);
        s.push(29);
        s.push(10);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}

