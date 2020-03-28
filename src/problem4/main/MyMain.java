/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem2.main.Methods;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Methods mthds = new Methods();
        MyBinarySearchTree m = new MyBinarySearchTree();
        MyQueue q = new MyQueue();
        m.setRoot();

        //inserting into the tree
        for (int i = 0; i < 5; i++) {
            m.insert(m.getRoot());
        }

        //method to print preorder Successor of given Node
        q.preOrder(m.getRoot());
        q.queuePrint(q);
        System.out.print("Enter value of which you want to find preorder Successor : ");
        q.printSuccessor(sc.nextInt());

    }
}