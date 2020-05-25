package LinkedList;

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
    {
        // Your code here.
        Node slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        assert slow != null;
        return slow.data;
    }
}

public class Mid_Element_Of_LinkedList
{
    Node head;  // head of list
    public void addToTheLast(Node node)
    {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0)
        {
            int n = sc.nextInt();
            Mid_Element_Of_LinkedList list = new Mid_Element_Of_LinkedList();
            //int n=Integer.parseInt(br.readLine());
            int a1=sc.nextInt();
            Node head= new Node(a1);
            list.addToTheLast(head);
            for (int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                list.addToTheLast(new Node(a));
            }

            GFG gfgObj = new GFG();
            //list.head = new GFG().Middle(list.head);
            System.out.println(gfgObj.getMiddle(list.head));
            //list.printList();
            t--;
        }
    }
}
