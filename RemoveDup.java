package LinkedList1;

import java.util.*;

public class RemoveDup {
    public static void main(String[] args)
    {
       LinkedListUse3 ob=new LinkedListUse3();
       //ob.print(head);
       Node<Integer> head= ob.takeinput();
       ob.print(head);
       System.out.println();
      head= removeDuplicates(head);
      ob.print(head);

    }
     /*for this output the answer is wrong if you use == for checking
     1
     1 1 1 1 1 9 9 9 9 9 9 99999999 99999999 -1
     */




    public static Node<Integer> removeDuplicates(Node<Integer> head)
        {
            //Your code goes here
            if(head ==null)
                return head;

            Node<Integer> temp=head;
            while(temp.next!=null)
            {

                if(temp.data.equals(temp.next.data))
                {
                    temp.next=temp.next.next;
                }
                else
                    temp=temp.next;
            }
            return head;

        }

    }

