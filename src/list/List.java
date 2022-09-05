package list;

public class List implements ListInterface {

    private ListNode head;
    private ListNode tail;
    private int size;

    public List(int position, Object element) {
        head = tail = new ListNode(position, element);
        size = 1;
    }

    public List() {
        head = tail = null;
        size = 0;
    }

    @Override
    public Object get(int position) {
        ListNode iterator = head;
        if (iterator.getPosition() == position) {
            return iterator.getElement();
        } else {
            return 0;
        }
    }

    @Override
    public void insert(ListNode node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            ListNode iterator = head;
            if (node.getPosition() < iterator.getPosition()) {
                node.setNext(iterator);
                head = node;
            } else {
                while ((iterator.getNext() != null) && (node.getPosition() > iterator.getNext().getPosition())) {
                    iterator = iterator.getNext();
                }
                node.setNext(iterator.getNext());
                iterator.setNext(node);

                if (iterator == tail) {
                    tail = node;
                }
            }
        }
        size++;
    }

    @Override
    public void remove(int position) {
        if (!isEmpty()) {
            if (size == 1) {
                head = tail = null;
            } else {
                if (head.getPosition() == position) {
                    head = head.getNext();
                } else {
                    ListNode iterator = head;

                    while ((iterator.getNext() != null) && (iterator.getNext().getPosition() != position)){
                        iterator = iterator.getNext();
                    }
                    if (iterator != tail) {
                        if (iterator.getNext() == tail) {
                            tail = iterator;
                        }
                        iterator.setNext(iterator.getNext().getNext());
                    }
                }
            }
        }
        size--;
    }

    @Override
    public void replace(int position, ListNode node) {
        ListNode iterator = head;
        if (iterator.getPosition() == position) {
            iterator = node;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Lista vazia...";
        } else {
            ListNode iterator = head;
            String metadata = "";
            while (iterator != null) {
                metadata += iterator.getPosition() + "\n";
                iterator = iterator.getNext();
            }
            return metadata;
        }
    }
}
