package tree;

public interface TreeInterface {
    //returns the root node of the tree
    public TreeNode ret_Root();
    //returns the parent of given node
    public TreeNode parent(TreeNode v);
    //returns the data stored in parent of given node
    public String print_Parent(TreeNode v);
    //returns a list of childrens of a given node, including the node it self
    /*public List children(TreeNode v);*/
    //print the data stored in each children of the given node
    public String print_Children(TreeNode v);
    //tests if the given node is internal
    public boolean isInternal(TreeNode v);
    //tests if the given node is external
    public boolean isExternal(TreeNode v);
    //returns the number of nodes in the tree
    public int size();
    //tests if the tree is empty
    public boolean isEmpty();
    //returns the number of acestors from the given node
    public int dept(TreeNode v);
    //returns the height of the given node
    public int height(TreeNode v);
    //returns a list of nodes in preorder
    /*public List preorder();*/
    //returns a list of nodes in postorder
    /*public List postorder();*/
    //returns a collection of the tree nodes
    /*public List listNodes();*/
    //replaces the element of a given node with e
    public void replace(TreeNode v, Object e);
}
