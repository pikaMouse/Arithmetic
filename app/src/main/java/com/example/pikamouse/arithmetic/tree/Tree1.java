package com.example.pikamouse.arithmetic.tree;


import java.util.ArrayList;
import java.util.List;

/**
 * Create by jiangfeng on 2019/3/9
 * Email: 58113937@qq.com
 *
 * 给定一个一维数组，例如【1，2，0，3，4】，按照层次顺序构造二叉树，第一层1个结点，第二层2个结点，第三层4个结点，以此类推
 * 输入构造二叉树后的中序遍历以及深度
 */
public class Tree1 {

    private static List<Node> nodes;


    public static void inOrder(Node root) { // 中序遍历
        if (root != null) {
            inOrder(root.left);
            if (root.data != 0) {
                System.out.print(root.data + " ");
            }
            inOrder(root.right);
        }
    }

    public static int getDepth(Node node) {  //深度
        if (node == null) {
            return 0;
        }
        int leftDepth = 0;
        int rightDepth = 0;
        leftDepth = getDepth(node.left);
        rightDepth = getDepth(node.right);
        return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
    }

    public static void main(String[] str) {
        int[] array = { 1,2,0,3,4 };//输入的数组
        Node root  = createBinaryTree(array);
        System.out.println("中序遍历：");
        inOrder(root);
        System.out.println();
        System.out.println("深度：");
        System.out.println( getDepth(root));
    }

    public static Node createBinaryTree(int[] arr) {
        int len = arr.length;
        nodes = new ArrayList<>();
        for (int i = 0; i < len; i ++) {
            Node node = new Node(arr[i]);
            nodes.add(node);
        }
        //一维数组构造一棵树最关键的一行代码
        int bound = len / 2 - 1;
        for(int i = 0; i < bound; i++) {
            nodes.get(i).left = nodes.get(i * 2 + 1);
            nodes.get(i).right = nodes.get(i * 2 + 2);
        }
        //最后一个父节点可能没有右子节点，所以要特殊处理
        nodes.get(bound).left = nodes.get(bound * 2 + 1);
        Node node = nodes.get(bound * 2 + 2);
        if (node != null) {
            nodes.get(bound).right = node;
        }
        return nodes.get(0);
    }

    public static class Node {

        int data; // 根节点数据
        Node left; // 左子树
        Node right; // 右子树

        public Node(int data) // 实例化二叉树类
        {
            this.data = data;
            left = null;
            right = null;
        }

    }


}