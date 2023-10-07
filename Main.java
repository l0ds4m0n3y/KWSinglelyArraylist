public class Main {
    public static void main(String[] args) {        
        KWSingleLinkedList<String> myList = new KWSingleLinkedList<>();
        myList.add("hello");    // 0
        myList.add("hi");   //1
        myList.add("poopy"); //2


        myList.add2(3, "cagaste");
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
