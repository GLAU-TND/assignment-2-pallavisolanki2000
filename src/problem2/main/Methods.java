package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
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

    public void verify_A(TreeNode root) {

        m.preOrder();
        System.out.println("First element of pre Order traversal : " + pre.getFront().getNode().getData());
        m.postOrder();
        System.out.println("Last Element of post order traversal : " + post.getEnd().getNode().getData());

    }

    public boolean verify_B(TreeNode root) {

        pre.queuePrint(pre);
        post.queuePrint(post);
        int size = pre.getSize(pre);

        int ctr = 0;
        int predata = 0;
        int postdata = 0;

        if (size % 2 == 1) {
            //last element of this while loop is middle element of pre-order traversal queue
            while (ctr < size / 2 && pre.getTmp() != null) {
                pre.setTmp(pre.getTmp().getNext());
                ctr++;
            }
            ctr = 0;
            try {
                assert pre.getTmp() != null;
                predata = pre.getTmp().getNode().getData();
            } catch (NullPointerException ignore) {
            }
            while (ctr < size / 2 && post.getTmp() != null) {
                post.setTmp(post.getTmp().getNext());
                ctr++;
            }
            try {
                assert post.getTmp() != null;
                postdata = post.getTmp().getNode().getData();
            } catch (NullPointerException ignore) {
            }
            System.out.println(predata + "pre data");
            System.out.println(postdata + "post data");
            return predata == postdata;
        } else {
            System.out.println("Number of elements in tree are even");
            return false;
        }

    }

}
