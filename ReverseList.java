package LinkedList2;

import LinkedList1.LinkedListUse3;
import LinkedList1.Node;

public class ReverseList {
    public static void main(String[] args) {
        LinkedListUse3 ob=new LinkedListUse3();
        Node<Integer> head=ob.takeinput();
        ob.print(head);

        System.out.println();
      //  head=reverse(head);
       head=reversalIteration(head);
        ob.print(head);



    }
    //REVERSAL USING RECURSION
    public static Node<Integer> reverse(Node<Integer> head) {
        if (head == null || head.next == null)
        {

            return head;
        }
        Node<Integer> finalNode = reverse(head.next);
        Node<Integer> temp=head.next;
        temp.next = head;
        head.next = null;
        return finalNode;
    }
    //REVERSAL BY ITERATION
    public static Node<Integer> reversalIteration(Node<Integer> head)
    {
        Node<Integer> finalhead=head;

        while(finalhead.next!=null)
        {
            finalhead=finalhead.next;

        }
       // System.out.println(finalhead.data);

        Node<Integer> temp= head;
        finalhead.next=temp;
        head=head.next;
        temp.next=null;

     

        while(head!=finalhead)
        {    Node<Integer> newNode=head;
            head=head.next;
            newNode.next=temp;
            finalhead.next=newNode;
            temp=finalhead.next;
        }
        return finalhead;
    }
}

