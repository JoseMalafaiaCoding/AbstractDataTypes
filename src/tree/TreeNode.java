package tree;

public class TreeNode {
    private int item;
    private TreeNode parent;
    private TreeNode leftChild;
    private TreeNode nextChild;
    
    public TreeNode(int item){
        this.item = item;
        parent = leftChild = nextChild = null;
    }
    
    //item getter()
    public int getItem() {
        return item;
    }
    
    //item setter()
    public void setItem(int item) {
        this.item = item;
    }
    
    //parent getter()
    public TreeNode getParent() {
        return parent;
    }
    //parent setter()
    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    //leftChild getter()
    public TreeNode getLeftChild() {
        return leftChild;
    }
    
    //leftChild setter()
    public void setLeftChild(TreeNode leftChild) {    
        this.leftChild = leftChild;
    }
    
    //nextChild getter()
    public TreeNode getNextChild() {
        return nextChild;
    }
    
    //nextChild setter()
    public void setNextChild(TreeNode nextChild) {
        this.nextChild = nextChild;
    }    
}
