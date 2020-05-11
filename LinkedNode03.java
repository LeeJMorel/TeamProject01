//Linked node problem 3 -- taken from Chapter 16 slide 19

public class LinkedNode03 {
   public static void main(String[] args) {
      ListNode listHead1 = null;
      listHead1 = new ListNode(10);
      listHead1.next = new ListNode(20);
      System.out.println("data1: " + "[" + listHead1.data + ", " + (listHead1.next).data + "]");
      ListNode listHead2 = null;
      listHead2 = new ListNode(30);
      listHead2.next = new ListNode(40);
      System.out.println("data2: " + "[" + listHead2.data + ", " + (listHead2.next).data + "]");
      System.out.println();
   
   //Move node with 30 between 10 node and 20 node; don't lose 40 node.
      ListNode temp = listHead1.next; //save reference to 20 node
      listHead1.next = listHead2; //10 node now references 30 node 
      listHead2 = (listHead1.next).next; //listHead2 now references 40 node
      (listHead1.next).next = temp; //30 node now references 20 node
      System.out.println("New data1: " + "[" + listHead1.data + ", " + (listHead1.next).data 
                           + ", " + ((listHead1.next).next).data + "]");
      System.out.println("New data2: " + "[" + listHead2.data + "]");
   }
}