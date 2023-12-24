package LinkedList;

public class LinkedList {
    public static class Node{
        int data ;
        Node next ;
        
        public Node(int data ) {
            this.data=data ;
            this.next=null ;
        }
    }
    public static Node head ;
    public static Node tail ;
    public static int size ;
    
    /*
     * Add in Linked List 
     * add First 
     * 
     * 
     * Create new Node 
     * new Node's next =head 
     * head =new Node  
     */

    public void addFirst(int data) {
        // step 1 create new node 
        Node newNode = new Node(data) ;
        if (head ==null ) {
            head=tail=newNode ;
            return ;
        }
        size++ ;
        // Step 2 

        newNode.next=head ; // linked to the new node to the previous one 

        //step 3 head = newNode 
        head = newNode ;

        // Time Complexity in adding the element is O(1)
    } 

    // Creating the last Node in the LinkedList 
    /*
     * create a node (new Node )
     * tail.next =newNode
     * tail=newNode 
     */

    public void addLast(int data )  {
        Node newNode=new Node(data) ;

        if (head==null ) {
            head=tail=newNode ;
            return ;
        }
        size++ ;
        tail.next=newNode ;
        tail=newNode ;

        // time complexity is O(1)

    }
    public void printNode() {
        if (head==null) {
            System.out.println("null") ;
            return ;
        }
        Node temp=head ;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next ;
        }

        // Time Complexity is O(n) 

    }

    /*
     * Adding Element in the Middle of the LinkedList 
     */
    public void addMiddle(int idx,int data ) {
        if (idx==0) {
            addFirst(data);
            return ;
        }
        size++ ;
        Node newNode=new Node(data);
        Node temp=head ;
        int i=0 ;
        while(i<idx-1) {
            temp=temp.next ;
            i++ ;
        } 
        // i==idx-1 ; temp -->>  prev ;
        newNode.next=temp.next ;
        temp.next=newNode ;
    }

    // Remove Element in the Linked List 
    public int removeFirst() {
        if (size==0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE ;
        }else if(size==1) {
            int val = head.data ;
            head=tail=null ;
            size=0 ;
            return val ;
        }
        
        int val=head.data ;
        head=head.next ;
        size-- ;
        return val ;
    }

    // Remove Last 
    public int removeLast() {
        if (size==0) {
            System.out.println("Linked List is Empty");
            return Integer.MAX_VALUE ;
        }else if (size==1 ) {
            int val=head.data ;
            head=tail=null ;
            size=0 ;
            return val ;
        }

        Node prev = head ;
        for (int i=0;i<size-2;i++) {
            prev=prev.next ;
        }
        int val=prev.next.data ;
        prev.next=null ;
        tail=prev ;
        size-- ;
        return val ;
    }

    // Search a key in the loop 
    public int iteSearch(int key ) {// time complexity is O(n) 

        Node temp=head  ;
        int i=0 ;
        while (temp!=null) {
            if (temp.data==key) { // key found 
                return i ;
            }
            temp=temp.next ;
            i++ ;
        }
        return -1 ;  // key Not Found 
    }
    // Search for a Key in a Linked List .Return the position where it is found ,
    // if not found return -1 .Use Recursion 
    public int helper(Node head,int key) { // time complexity is O(1)
        if (head==null) {
            return -1 ;
        }
        if (head.data==key) {
            return 0 ;
        }

        int idx=helper(head.next, key) ;
        if (idx==-1) {
            return -1 ;
        }
        return idx+1 ;
    }
    public int recSearch(int key ) {
            return helper(head,key);
    }

    // Reverse a Linked List 
    public void reverseOfLinkedList() {
        Node prev = null ;
        Node curr = tail=head ;
        Node next ;

        while(curr!=null) {
            next=curr.next ;
            curr.next=prev ;
            prev=curr ;
            curr=next ;
        }

        head = prev ;

    }

     /*
    Find & Remove Nth Node from End 
    */
    public void deleteNthFromEnd(int n) {
        // calculate size 
        int sz=0 ;
        Node temp = head ;
        while(temp!=null) {
            temp=temp.next ;
            sz++ ;
        }

        // deleting the first element from start and nth element from the end 

        if (n==sz) {
            head=head.next ;

        }

        // moving to the element which is one element before the delete element 
        // sz-n 
        int i=1 ;
        Node prev=head ;
        while(i<(sz-n)) {
            prev=prev.next ;
            i++ ;
        }
        prev.next=prev.next.next ;
        return ;
    }
    // Finding the Mid By Using slow-fast Approach 
    public Node findMid(Node head ) {
        Node slow =head ;
        Node fast =head ;

        while(fast!=null && fast.next!=null) {
            slow =slow.next ;  // move by 1 step 
            fast =fast.next.next ;// move by 2 step

        }
        // Slow is my mid Node 
        return slow ;
    } 
    public boolean checkPallindrome() {
        // corner case 
        if (head==null || head.next==null) {
            return true ;
        }
        //Step 1:- To Find Mid 
        Node midNode=findMid(head);

        //Step 2:- reverse 2nd Half 
        Node prev=null ;
        Node curr=midNode ;
        Node next ;

        while(curr!=null) {
            next=curr.next ;
            curr.next=prev ;
            prev=curr ;
            curr= next ;
        }

        Node right=prev ; // right half head 
        Node left=head ;

        // Step 3:- check left half and right half 
        while (right!=null ) {
            if (left.data!=right.data) {
                return false ;
            }
            left =left.next ;
            right=right.next ;
        }
        return true ;
    }

    public static void main (String[] args) {
        /*
        LinkedList ll= new LinkedList() ;
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(5);
        System.out.println(ll.checkPallindrome());
         */
        int[] nums={1,2,1,3,3,4};
        
    }
}
