//Linked node problem 1 -- taken from Chapter 16 slide 17

public class LinkedNode01 {
   public static void main(String[] args) {
      ListNode listHead = new ListNode(10);
      listHead.next = new ListNode(20);
      System.out.println("data: " + "[" + listHead.data + ", " + (listHead.next).data + "]");

//Add the new node to the end of the list.
//       (listHead.next).next = new ListNode(30, (listHead.next).next);
//       System.out.println("data: " + "[" + listHead.data + ", " 
//                         + (listHead.next).data + ", " + ((listHead.next).next).data + "]");      
   }
}