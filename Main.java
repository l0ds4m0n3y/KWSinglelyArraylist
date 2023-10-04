public class Main {
    public static void main(String[] args) {        
    KWSingleLinkedList<String> myList = new KWSingleLinkedList<>();
    myList.add("hello");    
    myList.add("hi");
    myList.add("hi");
    myList.add("hello");
    myList.add("hi");

    System.out.println(myList.lastIndexOf("hi"));
    }
}
