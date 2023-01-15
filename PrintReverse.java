package LinkedList1;

import java.util.*;

public class PrintReverse {
    public static void main(String[] args) {
        LinkedListUse3 ob=new LinkedListUse3();
        //ob.print(head);
        Node<Integer> head= ob.takeinput();
        ob.print(head);
        printReverse(head);
        ob.print(head);

    }
    public static void printReverse(Node<Integer> root) {
        //Your code goes here
        f(root);
    }
    public static  void f(Node<Integer> temp )
    {
        if(temp==null)
            return ;
        f(temp.next);
        System.out.print(temp.data+" ");
    }
}

