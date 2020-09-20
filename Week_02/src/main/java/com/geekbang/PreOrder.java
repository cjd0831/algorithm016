package com.geekbang;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {

  /**
   * 解法一：递归
   *
   * @param root
   * @return
   */
  public List<Integer> preorderForRecursion(Node root) {
    List<Integer> res = new ArrayList<>();
    pre(root, res);
    return res;
  }

  public void pre(Node root, List<Integer> res) {
    if (root == null) {
      return;
    }
    res.add(root.val);
    for (Node child : root.children) {
      pre(child, res);
    }
  }

  /**
   * 解法二：迭代法
   *
   * @param root
   * @return
   */
  public List<Integer> preorderFor(Node root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      Node cur = stack.pop();
      res.add(cur.val);
      int i = cur.children.size() - 1;
      while (i >= 0) {
        if (cur.children.get(i) != null) {
          stack.push(cur.children.get(i));
        }
        i--;
      }
    }
    return res;
  }
}
