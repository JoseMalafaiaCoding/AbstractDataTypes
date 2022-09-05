package tree;
//tree's control structure
public class Tree implements TreeInterface{
    private int size;
    private TreeNode root;
    
    public Tree(){
        size = 0;
        root = null;
    }
    
    public void insertRoot(){
        
    }
    
    //
    public void insert(){
    
    }
    
    @Override
    public TreeNode ret_Root(){
        return root;
    }
    
    @Override
    public TreeNode parent(TreeNode v){
        return new TreeNode(1);
    }
    
    @Override
    public String print_Parent(TreeNode v){
        return v.toString();
    }
    
    //@Override
    /*public List children(TreeNode v){
        return new List();
    }*/
    
    @Override
    public String print_Children(TreeNode v){
        return v.toString();
    }
    
    @Override
    public boolean isInternal(TreeNode v){
        return false;
    }
    
    @Override
    public boolean isExternal(TreeNode v){
        return false;
    }
    
    @Override
    public int size(){
        return size;
    }
    
    @Override
    public boolean isEmpty(){
        return size == 0;
    }
    
    @Override
    public int dept(TreeNode v){
        return 0;
    }
    
    @Override
    public int height(TreeNode v){
        return 0;
    }
    
    //@Override
    /*public List preorder(){
        
    }*/
    
    //@Override
    /*public List postorder(){
        
    }*/
    
    //@Override
    /*public List listNodes(){
    
    }*/
    
    @Override
    public void replace(TreeNode v, Object e){
        
    }
    
}
