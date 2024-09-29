public class LinkedList{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
    }

    public void addMiddle(int data, int idx){
        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        int i=0;
        Node temp=head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        Node prev=head;
        for(int i=0; i<=size-2; i++){
            prev=prev.next;
        }

        prev.next=null;
        tail=prev;
        size--;
        return tail.data;
    }

    public int IterativeSearch(int key){
        Node temp = head;
        int idx=0;
        while(temp != null){
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    public void print(){
        Node temp = head;
        if(head==null){
            System.out.println("LL is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        
    }

    public static void main(String args[]){
        LinkedList LL = new LinkedList();
        LL.addFirst(2);
        LL.addFirst(1);
        LL.addLast(3);
        LL.addLast(4);
        LL.print();
        LL.addMiddle(9,3);
        LL.print();
        System.out.println(LL.size);
        LL.removeFirst();
        LL.removeLast();
        System.out.println(LL.IterativeSearch(2));
        LL.print();
    }
}