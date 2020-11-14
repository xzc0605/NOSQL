import java.util.ArrayList;
import java.util.List;
//import javax.swing.tree.TreeNode;




public class AllPath {


    public List<String> binaryTreePaths(TreeNode root){
        List<String> paths = new ArrayList<>();
        if(root==null){
            return paths;
        }

        List<String> leftPaths = binaryTreePaths(root.getLeft());
        List<String> rightPaths = binaryTreePaths(root.getRight());

        for(String path:leftPaths){
            paths.add(root.getVal()+"->"+path);
        }

        for(String path:rightPaths){
            paths.add(root.getVal()+"->"+path);
        }

        if(paths.size()==0){
            paths.add(""+root.getVal());
        }

        return paths;
    }

}
