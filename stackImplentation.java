import java.io.*;

import java.util.*;

public class stackImplentation {

  public static class CustomStack {
    int[] data;
    int tos;

    public CustomStack(int cap) {
      data = new int[cap];
      tos = -1;
    }

    int size() {
      return tos + 1;
    }

    void display() {
      for (int i = tos; i >= 0; i--) {
        System.out.print(data[i] + " ");
      }
      System.out.println();
    }

    void push(int val) {
      if (tos == data.length - 1) {
        System.out.println("Stack overflow");
      } else {
        tos++;
        data[tos] = val;
      }
    }

    int pop() {
      if (tos == -1) {
        System.out.println("Stack underflow");
        return -1;
      } else {
        int val = data[tos];
        tos--;
        return val;
      }
    }

    int top() {
      if (tos == -1) {
        System.out.println("Stack underflow");
        return -1;
      } else {
        return data[tos];
      }
    }

  }

  public static void print(){
   System.out.println("1. Push"); 
   System.out.println("2. Pop");
   System.out.println("3. isFull");
   System.out.println("4. isEmpty");
   System.out.println("5. Display");
   System.out.println("6. Peek");
  }
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    CustomStack st = new CustomStack() ;
    while(true){
      int n= sc.nextInt();
      print(); 
      if(n==1){
       st.push(sc.nextInt());
      }else if(n==2){
        st.pop();
      }else if(n==3){
        if(st.size()==data.length){
          System.out.println("The stack is full");
        }else{
          System.out.println("There a Plenty of space left in the stack");
        }
      }else if(n==4){
        if(st.size()==0){
          System.out.println("The stack is empty");
        }else{
          System.out.println("No it aint");
        }
      }else if(n==5){
        st.disply();
      }else if(n==6){
        System.out.println(st.top());
      }else{
        System.out.println("Please enter a vaild entry");
      }
    }
  }
}