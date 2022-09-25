import java.util.*;

class Node {
  Integer data;
  Node left, right;
  
  public Node(int data) {
    this.data = data;
    this.left = this.right = null;
  }
}

class LeftViewOfBinaryTree {
  Integer maxLevel = 0;
  void leftView(Node root, Integer level, List<Integer> result) {
    if (root == null) {
      return;
    }
    
    if (maxLevel < level) {
      result.add(root.data);
      maxLevel = level;
    }
    
    leftView(root.left, level + 1, result);
    leftView(root.right, level + 1, result);
  }
}

public class LVBinaryTree {
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.right.left = new Node(10);
    root.right.right = new Node(20);
    
    List<Integer> result = new ArrayList<>();
    LeftViewOfBinaryTree instance = new LeftViewOfBinaryTree();
    instance.leftView(root, 1, result);
    
    for(Integer integer: result) {
      System.out.print(integer + " ");
    }
    System.out.println("");
  }
}
