package LinkedList1;

import java.util.*;

public class LinkedListUse3 {
    public static Node<Integer> takeinput()
    {   Node<Integer> head=null;
       Node<Integer> tail=null;
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        while(data!=-1)
        {Node<Integer> newNode=new Node<>(data);
             if(head==null)
             {   head=newNode;
                 tail=newNode;}
             else
             {
                 tail.next=newNode;
                 tail=tail.next;
             }
            data=sc.nextInt();

        }
        return head;
    }

    public static Node<Integer> insertion(Node<Integer> head,int data, int pos)
    {Node<Integer> newNode=new Node<>(data);
        Node<Integer> temp=head;
        if(pos==0)
        {
            newNode.next=head;
            head=newNode;
        }
        else
        { int i=0;
            while(i<pos-1)
            { temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        return head;
    }
    public static Node<Integer> delete(Node<Integer> head,int pos)
    {  Node<Integer> temp=head;

        if(pos==0)
        head=head.next;
        else
        {  int i=0;
            while(i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            temp.next=(temp.next).next;

        }
        return head;
    }
    public static void print(Node<Integer> head)
    {  Node<Integer> temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }


    public static Node<Integer> append(Node<Integer> head, int n) {
        //Your code goes here
        Node<Integer> temp=head;
        if(head==null)
        {}
        else
        {   int i=0;
            while(temp.next!=null)
            {
                temp=temp.next;
                i++;
            }
            i++;
            System.out.println("\n"+i);
            int k=i-n;
            Node<Integer> temp2=head;
            temp.next=head;
            int j=0;
            while(j!=k-1)
            {
                temp2=temp2.next;
                j++;
            }
            head=temp2.next;
            temp2.next=null;
        }
        return head;
    }

    public static int length(Node<Integer> head)
    {  int count=0;
        Node<Integer> temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        //Your code goes here
        return count;
    }
    public static int findNode(Node<Integer> head, int n) {
        // Write your code here.

        int i=0;

        Node<Integer> temp=head;
        while(temp!=null)
        {
            if(n==temp.data)
                return i;
            i++;
            temp=temp.next;
        }

        return -1;
    }

    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1,Node<Integer> head2)
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


      public static void main(String[] args) {
        Node<Integer> head1=takeinput();
        print(head1);

        Node<Integer> head2=takeinput();
        print(head2);

      // head=insertion(head,80,0);// Node<Integer> temp=head;
      // System.out.println("After Intertion of 80 at position 0");
      //  print(head);
      //  head=delete(head,0);
      // System.out.println("\nAfter Deletion at position 0");
        //print(head);
        //head=append(head,3);
        //print(head);
        //System.out.println();
        //System.out.println("Length of LinkedList"+length(head));
        //System.out.println(findNode(head,80));
        Node<Integer> head=mergeTwoSortedLinkedLists(head1,head2);

       // System.out.println(head);
        print(head);

    }
}
