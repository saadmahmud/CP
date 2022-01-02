import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
 
    Node head;
 
    public Main() {
        head = new Node();
    }
 
    class Node {
        int data;
        Node next;
 
        public Node() {
            data = -1;
            next = null;
        }
 
        public Node(int _data) {
            data = _data;
            next = null;
        }
    }
 
    public void reverseCurList() {
 
    }
 
    public void printLinkList() {
        Node nextNode = head.next;
 
        while (nextNode.next != null) {
            System.out.print(nextNode.data + " ");
            nextNode = nextNode.next;
        }
 
        System.out.println(nextNode.data);
    }
 
    public void insertAtTail(int data) {
        // if head . next is null, insert new node next to head
 
        Node curNode = head;
 
        while (curNode.next != null) {
            curNode = curNode.next;
        }
 
        Node a = new Node(data);
        curNode.next = a;
    }
 
    public void deleteAtTail() {
        Node curNode = head;
        Node prevNode = null;
 
        while (curNode.next != null) {
            prevNode = curNode;
            curNode = curNode.next;
        }
        prevNode.next = null;
    }
 
    public void insertAtHead(int data) {
        Node curNext = head.next;
 
        Node a = new Node(data);
        head.next = a;
        a.next = curNext;
    }
 
    public void deleteAtHead() {
        head.next = head.next.next;
    }
 
    public boolean insertAtPosition(int pos, int data) {
        pos++;
        if (pos < 1) {
            return false;
        }
 
        Node newNode = new Node(data);
 
        Node curNode = head;
        Node prevNode = null;
 
        for (int i = 0; i < pos; i++) {
 
            if (curNode.next == null)
                return false;
 
            prevNode = curNode;
            curNode = curNode.next;
        }
 
        // if pos is 3, curNode is now 3rd node, after for loop ends
        // I will insert newNode before curNode.
 
        prevNode.next = newNode;
        newNode.next = curNode;
 
        return true;
    }
 
    public boolean deleteAtPosition(int pos) {
 
        if (pos < 1) {
            return false;
        }
 
        Node curNode = head;
        Node prevNode = null;
 
        for (int i = 0; i < pos; i++) {
 
            if (curNode.next == null)
                return false;
 
            prevNode = curNode;
            curNode = curNode.next;
        }
 
        // if pos is 3, curNode is now 3rd node, after for loop ends
        // I will insert newNode before curNode.
 
        prevNode.next = curNode.next;
 
        return true;
    }
 
    public void findAt(int pos) {
        pos++;
        if (pos < 1)
            return;
 
        Node curNode = head.next;
 
        for (int i = 0; i < pos - 1; i++) {
            curNode = curNode.next;
        }
 
        System.out.println(curNode.data);
    }
 
    public static void main(String[] args) {
 
        Main l = new Main();
 
        l.insertAtTail(1);
        l.printLinkList();
 
        l.insertAtHead(2);
        l.insertAtTail(100);
        l.printLinkList();
 
        l.deleteAtHead();
        l.printLinkList();
 
        l.deleteAtTail();
        l.printLinkList();
 
        l.findAt(0);
 
        l.insertAtPosition(0, 65);
        l.printLinkList();
 
        l.insertAtPosition(0, 114);
        l.printLinkList();
 
        l.insertAtPosition(1, -87);
        l.printLinkList();
 
        l.insertAtTail(15);
 
        l.findAt(3);
        l.findAt(4);
 
        // l.insertAtTail(1);
        // l.insertAtTail(2);
        // l.insertAtTail(3);
        // l.insertAtTail(4);
        // l.insertAtTail(5);
        // l.insertAtTail(6);
 
        // l.insertAtPosition(5, 7);
        // l.printLinkList();
 
        // l.deleteAtTail();
        // l.printLinkList();
 
        // l.deleteAtHead();
        // l.printLinkList();
 
        // l.deleteAtPosition(4);
        // l.printLinkList();
 
        // l.insertAtPosition(0, -2);
        // l.printLinkList();
 
        // l.findAt(3);
    }
}
