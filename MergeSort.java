package LinkedList1;

import java.util.*;

public class MergeSort {
    public static void main(String[] args)
    {  LinkedListUse3 ob=new LinkedListUse3();
        Node<Integer> head=ob.takeinput();
        head=mergeSort(head,null);
        ob.print(head);

    }
    public static Node<Integer> mergeSort(Node<Integer> head ,Node<Integer> mid)
    {
        if(head!=null)
        {  mid=midPoint(head);
            mergeSort(head.next,mid);
            mergeSort(mid.next,null);
            head=merge(head,mid);
        }
        return head;

    }
    public static Node<Integer> midPoint(Node<Integer> head)
    {  Node<Integer> fast=head,slow=head;

        if(head==null)
            return null;
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;

        }
        //  System.out.println(slow);
        //Your code goes here
        return slow;
    }

    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2)
    {

        if(head1==null&&head2==null)
            return null;
        Node<Integer> t3,t1=head1,t2=head2;
        if(t1!=null && t2==null)
            return t1;
        if(t2!=null && t1==null)
            return t2;
        if(head1.data<head2.data)
        {
            t3=head1;
            t1=head1.next;
        }
        else
        {
            t3=head2;
            t2=head2.next;
        }
        while(t1!=null  &&  t2!=null)
        {
            if(t1.data<t2.data)
            {   t3.next=t1;
                t1=t1.next;
                t3=t3.next;
            }
            else
            {   t3.next=t2;
                t2=t2.next;
                t3=t3.next;
            }
        }
        if(t1!=null )
        { t3.next=t1;
        }
        if(t2!=null )
        { t3.next=t2;

        }
        Node<Integer> head=(head1.data<head2.data)?head1:head2;
        return head;
    }

}
