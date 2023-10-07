public class Main {
    public static void main(String[] args) {        
    KWSingleLinkedList<String> myList = new KWSingleLinkedList<>();
    myList.add("hello");    
    myList.add("hi");
    myList.add("poopy");

    myList.remove(2);
    for(int i = 0; i < myList.size(); i++){
        System.out.println(myList.get(i));
    }
    }
}
