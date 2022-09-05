package abstractdatatypes;
import list.List;
import list.ListNode;

public class Main {
    public static void main(String []args){
        List lista1 = new List();
        lista1.insert(new ListNode(14,new Object()));
        lista1.insert(new ListNode(15,new Object()));
        lista1.insert(new ListNode(34,new Object()));
        lista1.insert(new ListNode(36,new Object()));
        lista1.insert(new ListNode(35,new Object()));
        lista1.insert(new ListNode(37,new Object()));
        lista1.insert(new ListNode(14,new Object()));
        System.out.println(lista1.toString());
        System.out.println(lista1.size());
        lista1.remove(34);
        System.out.println(lista1.toString());
        lista1.remove(37);
        System.out.println(lista1.toString());
        lista1.remove(14);
        System.out.println(lista1.toString());
        lista1.remove(14);
        System.out.println(lista1.toString());
        lista1.remove(15);
        System.out.println(lista1.toString());
        lista1.insert(new ListNode(37,new Object()));
        System.out.println(lista1.toString());
        lista1.remove(36);
        System.out.println(lista1.toString());
    }
}
