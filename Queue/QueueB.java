package Queue;

public class QueueB {
    static class Node {
        int data ;
        Node next ;

        Node(int data ) {
            this.data=data ;
            this.next=null ;
        }
    }
    // class for the Node 
    static class nQueue {
        static Node head = null ;
        static Node tail = null ;

        public static boolean isEmpty() {
            return head==null && tail==null; 
        }

        // add 
        public static void add(int data ) {
            Node newNode =new Node(data) ;
            if(head==null) {
                head=tail=newNode ;
                return ;
            }
            // adding the newElement 
            tail.next=newNode ;
            tail=newNode ;
        }

        // remove element 
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue ");
                return -1 ;
            }
            int front =head.data ;
            if (head==tail) {
                tail=head=null ;
            }else {
                head=head.next ;
            }
            
            return front ;
        }

        // peek
        public static int peek () {
            if(isEmpty()) {
                System.out.println("empty queue ");
                return -1 ;
            }
            return head.data ;
        }
    }
    static class Queue {
        static int[] arr ;
        static int size ;
        static int rear ;
        

        Queue(int n) {
            arr=new int[n];
            size=n ;
            rear = -1 ;
        }

        // Checking for the empty 
        public static boolean isEmpty() {
            return rear==-1 ;
        }

        // add 
        public static void add(int data ) {
            if (rear==size-1) {
                System.out.println("Queue is Full");
                return ;
            }
            rear=rear+1 ;
            arr[rear]= data ;
        }
        public static int remove () {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1 ;
            }
            int front =arr[0] ;
            for(int i=0;i<rear;i++) {
                arr[i]=arr[i+1] ;
            }
            rear = rear -1 ;
            return front ;
        }
        // peek 
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty ");
                return -1 ;
            }
            return arr[0];
        }
    }

    static class CircularQueue {
        static int[] arr ;
        static int size ;
        static int rear ;
        static int front ;

        CircularQueue(int n) {
            arr=new int[n] ;
            size=n ;
            rear = -1 ;
            front = -1 ;
        }

        // Function for empty 
        public static boolean isEmpty() {
            return rear==-1 && front ==-1 ;
        }

        // function for full array 
        public static boolean isFull() {
            return (rear+1)%size== front ;
        }

        // Add 
        public static void add (int data ) {
            if(isFull()) {
                System.out.println("Queue is Full ");
                return ;
            }
            // add first element 
            if (front==-1 ) {
                front = 0 ;
            }
            rear=(rear+1)%size ;
            arr[rear]=data ;
        }

        // remove element from the array 
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1 ;
            }

            int result=arr[front] ;
            
            // lst element deleted 
            if (rear==front ) {
                rear=front=-1 ;
            }else {
                front= (front+1) %size ;
            }
            return result ;
        }

        public static int peek () {
            if (isEmpty()) {
                return -1 ;
            }
            return arr[front] ;
        }
    }
    public static void main (String[] args) {
        nQueue q=new nQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove() ;
        q.add(10);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
