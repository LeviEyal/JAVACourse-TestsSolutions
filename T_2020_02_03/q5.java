package src.T_2020_02_03;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/
//sourch: https://leetcode.com/problems/symmetric-tree/solution/

public class q5 {

    public static void main(String[] args) {
    }

    public static boolean isSymmetric(BTNode root) {
        return isMirror(root, root);
    }
    public static boolean isMirror(BTNode t1, BTNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.getData() == t2.getData())
            && isMirror(t1.getRight(), t2.getLeft())
            && isMirror(t1.getLeft(), t2.getRight());
    }
}