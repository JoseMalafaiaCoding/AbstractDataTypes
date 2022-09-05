package list;

public class ListNode {
    private int position;
    private Object element;
    private ListNode next;
    
    public ListNode(int position, Object element){
        this.position = position;
        this.element = new Object();
        next = null;
    }
    
    @Override
    public int hashCode(){
        return position % 10;
    }
    
    public void setPosition(int position){
        this.position = position;
    }
    
    public int getPosition(){
        return position;
    }
    
    public void setElement(Object element){
        this.element = element;
    }
    
    public Object getElement(){
        return element;
    }
    
    public void setNext(ListNode next){
        this.next = next;
    }
    
    public ListNode getNext(){
        return next;
    }
    
}
