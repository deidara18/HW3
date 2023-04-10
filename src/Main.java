public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        for (Integer item : linkedList) {
            System.out.println(item);
        }
        LinkedList<String> linkedString = new LinkedList<>();
        linkedString.add("\n" +
                "Monday");
        linkedString.add("Tuesday");
        linkedString.add("Wednesday");
        linkedString.add("Thursday");
        linkedString.add("Friday");
        linkedString.add("Saturday");
        linkedString.add("Sunday");


        for (String item : linkedString) {
            System.out.println(item);
        }
    }
}