public class Main {
    public static void main(String[] args) {        
        KWSingleLinkedList<String> myList = new KWSingleLinkedList<>();
        myList.add("zero");
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");


        myList.remove(3);
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
