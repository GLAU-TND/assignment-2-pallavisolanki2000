package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

public class Methods {
    private MyBinarySearchTree m;

    private MyQueue pre, post;

    public Methods() {
        m = new MyBinarySearchTree();
        pre = new MyQueue();
        post = new MyQueue();
    }

    public MyQueue getPre() {
        return pre;
    }

    public void setPre(MyQueue pre) {
        this.pre = pre;
    }

    public MyQueue getPost() {
        return post;
    }

    public void setPost(MyQueue post) {
        this.post = post;
    }

    public MyBinarySearchTree getM() {
        return m;
    }

    public void setM(MyBinarySearchTree m) {
        this.m = m;
    }

}
