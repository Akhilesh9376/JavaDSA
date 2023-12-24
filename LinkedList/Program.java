package LinkedList;
import java.util.*;

public class Program {
    public static class Node {
        int data ;
        Node next ;

        // Creating the Constructor 
        public Node(int data ){
            this.data=data ;
            this.next=null ;
        }
    }
    // Creating the Static head and tail for the Node 
    public static Node head ;
    public static Node tail ;

    // Write the function for To Check Wheather the Linked List is Circular/Not
    public static boolean isCycle() {
        Node fast =head ;
        Node slow =head ;

        while(fast!=null && fast.next!=null) {
            slow =slow.next ;
            fast =fast.next.next ;

            if (slow==fast) {
                return true ;
            }
        }
        return false ;
    }

    // Program for the Removing the cycle linked list 
    /*
     * 1. Detect The Cycle 
     * a) slow =head ;
     * b) slow=+1s ;
     *    head=+1 ;
     *    while(slow==fast) {
     *     
     *     }
     */
    public static void removeCycle() {
        // Step 1:-  Detect Cycle 
        Node slow = head ;
        Node fast = head ;
        boolean cycle=false ;
        while(fast!=null && fast.next!=null) {
            slow =slow.next ;
            fast= fast.next.next ;

            if (slow==fast ) {
                cycle=true ;
                break ;
            }
        }
        if (cycle==false ) {
            return ;
        }
        // Step 2:- find Meeting point 
        slow=head ;
        Node prev=null ;
        while(slow!=fast ) {
            prev=fast ;
            slow=slow.next ;
            fast=fast.next ;
            
        }

        // Step 3:- Remove Cycle  prev.next=null 
        prev.next=null ;
    }

    // finding the mid of the linked list 
    public Node getMid(Node head){
        Node slow =head ;
        Node fast =head.next ;
        while(fast!=null && fast.next!=null) {
            slow=slow.next ;
            fast=fast.next ;
        }
        return slow ;
    }
    // Writing the function for the merge() 
    public Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1) ;
        Node temp=mergedLL ;

        while(head1!=null && head2!=null) {
            if (head1.data<=head2.data) {
                temp.next=head1 ;
                head1=head1.next ;
                
            }else{
                temp.next=head2 ;
                head2=head2.next ;
                
            }
            temp=temp.next ;
        }

        // Adding the remaining element from the left side 
        while(head1!=null) {
            temp.next=head1 ;
            head1=head1.next ;
            temp=temp.next ;
        }
        // Adding the remaining element from the right side 
        while(head2!=null) {
            temp.next=head2 ;
            head2=head2.next ;
            temp=temp.next ;
        }
        return mergedLL.next ;
    }
    // Merge Sort in Linked List 
    // Time Complexity is O(n)
    public Node mergeSort(Node head ) {
        // Base Case 
        if (head==null || head.next==null){
            return head ;
        }
         // Step 1:- Find Mid 
         Node mid=getMid(head) ;

         // Step 2:- left && right half ke liye mergeSort ko Call Karna Hai 
        Node rightHead=mid.next ;
        mid.next=null ;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        
         // Step 3:- Merge 
         return merge(newLeft,newRight);
    }

    public void zigZag() {
        // Step 1:- Find Mid 
        Node slow =head ;
        Node fast=head.next ;
        while(fast!=null && fast.next!=null) {
            slow=slow.next ;
            fast=fast.next.next ;
        }
        Node mid=slow ;
        // Step 2:- reverse 2nd Half 

        Node curr=mid.next ;
        // 1>>2>>3>>4
        mid.next=null ;

        Node prev=null ;
        Node next ;

        while(curr!=null) {
            next=curr.next;
            curr.next=prev ;
            prev=curr ;
            curr=next ;
        }
        Node left =head ;
        Node right=prev ;
        Node nextL;
        Node nextR ;


        // Step 3:- Zigzag Merge/Alternate Merge 
        while(left!=null && right!=null) {
            nextL=left.next ;
            left.next=right ;
            nextR=right.next;

            right.next=nextL;

            left = nextL;
            right= nextR ;
        }
    }
    public static void main (String[] args ) {
       //  head=new Node(1);
        // head.next=new Node(2) ;
        // head.next.next=new Node(3) ;
        
       //  head.next.next.next=head ;

       LinkedList ll=new LinkedList();
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addFirst(3);
       ll.addFirst(4);
       ll.addFirst(5);

       
        
       
    
       
    }
}
