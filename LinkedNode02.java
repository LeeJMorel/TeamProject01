//Linked node problem 2 -- maps to Chapter 16, slide 18

public class LinkedNode02 {
   public static void main(String[] args) {
      ListNode listHead = new ListNode(10);
      listHead.next = new ListNode(20);
      System.out.println("data: " + "[" + listHead.data + ", " + (listHead.next).data + "]");
      
//Insert the new node at the front of the list      
//      listHead = new ListNode(30, listHead);
//      System.out.println("data: " + "[" + listHead.data + ", " 
//                         + (listHead.next).data + ", " + ((listHead.next).next).data + "]");
   }
}