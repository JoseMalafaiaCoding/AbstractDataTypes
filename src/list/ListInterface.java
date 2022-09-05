package list;

public interface ListInterface {
    //returns the element of a given position
    public Object get(int position);
    //insert a new node to the list at a calculated position
    public void insert(ListNode node);
    //remove the first ocurrence of any element
    public void remove(int position);
    //replace an element at a given position with another element
    public void replace(int position, ListNode node);
    //returns the size of the list
    public int size();
    //tests weather the list is empty or not
    public boolean isEmpty();
}
