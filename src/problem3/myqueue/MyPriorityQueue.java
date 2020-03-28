/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node tmp, front, end;
    private int i = 0;

    public void enqueue(Node newNode) {

        if (front == null || newNode.getS().getRollno() < front.getS().getRollno()) {
            newNode.setNext(front);
            front = newNode;
        } else {
            tmp = front;

            while (tmp.getNext() != null && tmp.getNext().getS().getRollno() < newNode.getS().getRollno()) {
                tmp = tmp.getNext();
            }
            newNode.setNext(tmp.getNext());
            tmp.setNext(newNode);
        }
    }

}
