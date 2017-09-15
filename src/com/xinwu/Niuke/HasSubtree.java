package com.xinwu.Niuke;

/**
 * 题目：输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 思路：参考剑指offer
 1、首先设置标志位result = false，因为一旦匹配成功result就设为true，
 剩下的代码不会执行，如果匹配不成功，默认返回false
 2、递归思想，如果根节点相同则递归调用DoesTree1HaveTree2（），
 如果根节点不相同，则判断tree1的左子树和tree2是否相同，
 再判断右子树和tree2是否相同
 3、注意null的条件，HasSubTree中，如果两棵树都不为空才进行判断，
 DoesTree1HasTree2中，如果Tree2为空，则说明第二棵树遍历完了，即匹配成功，
 tree1为空有两种情况（1）如果tree1为空&&tree2不为空说明不匹配，
 （2）如果tree1为空，tree2为空，说明匹配。
 * Created by User on 2017/9/15.
 */
public class HasSubtree {
    public static void main(String[] args) {

    }
    public static boolean solution(TreeNode tree1,TreeNode tree2) {
        boolean result = false;
        if (tree1 != null && tree2 != null) {
            if (tree1.val == tree2.val) {
                result = DoesTree1HasTree2(tree1,tree2);
            }
            if (!result) {
                result = DoesTree1HasTree2(tree1.left,tree2);
            }
            if (!result) {
                result = DoesTree1HasTree2(tree1.right,tree2);
            }
        }
        return result;
    }

    public static boolean DoesTree1HasTree2(TreeNode tree1,TreeNode tree2) {
        if (tree1 == null && tree2!= null) {
            return false;
        }
        if (tree2 == null) {
            return true;
        }
        if (tree1.val != tree2.val) {
            return false;
        }
        return DoesTree1HasTree2(tree1.left,tree2.left) && DoesTree1HasTree2(tree1.right,tree2.right);
    }
}
