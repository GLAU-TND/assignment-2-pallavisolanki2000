/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree m = new MyBinarySearchTree();
        MyQueue queue = new MyQueue();
        m.setRoot();
        System.out.println("root set : " + m.getRoot().getData());


    }
}