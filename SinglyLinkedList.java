class Node{
    int data;
    Node next;
    Node (int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node (int data1){
        this.data = data1;
        this.next = null;
    }
}




public class SinglyLinkedList {

    private static Node ConvertArr2LL (int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    // private static void Traverse (Node head){
    //     Node temp = head;
    //     while (temp!=null){
    //         System.out.println(temp.data);
    //         temp = temp.next;
    //     }

    // }
    
    public static void main(String[] args) {
        
    //     Node node1 = new Node(10);
    //     Node node2 = new Node(20);
    //     Node node3 = new Node(30);
    //     Node node4 = new Node(40);
    //     Node node5 = new Node(50);

    //     node1.next=node2;
    //     node2.next=node3;
    //     node3.next=node4;
    //     node4.next=node5;

    //     System.out.println("Node address");

    //     System.out.println(node1);
    //     System.out.println(node2);
    //     System.out.println(node3);  
    //     System.out.println(node4);  
    //     System.out.println(node5);

    //     Node ptr = node1;
    //     System.out.println("data");

    //     while(ptr!=null){
    //         System.out.println(ptr.data);
    //         ptr = ptr.next;
    //     }

    //     System.out.println("next address");

    //     ptr = node1;

    //     while(ptr!=null){
    //         System.out.println(ptr.next);
    //         ptr = ptr.next;
        // }

    

        int arr[] = {10,20,30,40,50};
        Node head = ConvertArr2LL(arr);
        System.out.println(head);
        

        
    }
    
}
