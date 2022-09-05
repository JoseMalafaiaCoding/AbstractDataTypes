package list;

public class List implements ListInterface{
    private ListNode head;
    private ListNode tail;
    private int size;
    public List(int position, Object element){
        head = tail = new ListNode(position, element);
        size = 0;
    }
    
    @Override
    public Object get(int position){
        ListNode iterator = head;
        if(iterator.getPosition() == position){
            return iterator.getElement();
        }else{
            return 0;
        }
    }
    
    @Override
    public void insert(ListNode node){
        ListNode iterator = head;
        size++;
    }
    
    @Override
    public void remove(int position){
        ListNode iterator = head;
        if (iterator.getPosition() == position) {
            iterator = null;
        }
        size--;
    }
    
    @Override
    public void replace(int position, ListNode node){
        ListNode iterator = head;
        if (iterator.getPosition() == position) {
            iterator = node;
        }
    }
    
    @Override
    public int size(){
        return size;
    }
    
    @Override
    public boolean isEmpty(){
        return head == null;
    }
    
}
