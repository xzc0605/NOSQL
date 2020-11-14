
public class Subtree {
    private int minSum;
    private TreeNode minRoot;

    public TreeNode findSubtree(TreeNode root){
        minSum=Integer.MAX_VALUE;
        minRoot=null;
        getSum(root);
        return minRoot;
    }

    private int getSum(TreeNode root){
        if(root==null){
            return 0;
        }

        int sum=getSum(root.getLeft())+getSum(root.getRight())+root.getVal();

        if(sum<minSum){
            minSum=sum;
            minRoot=root;
        }
        return sum;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));

        Subtree minSubtree=new Subtree();
        System.out.println(minSubtree.findSubtree(root).getVal());
    }







}
