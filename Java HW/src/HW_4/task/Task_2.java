package HW_4.task;

import java.util.LinkedList;

public class Task_2 {

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int n) {
        list.addLast(n);
        return list;
    }

    public static int dequeue(LinkedList<Integer> list) {
        return list.pollFirst();
    }

    public static int first(LinkedList<Integer> list) {
        return list.peekFirst();
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        for (int i = 0; i <10; i++) {
            enqueue(linkList, i);
        }

        System.out.println(linkList);
        System.out.println(enqueue(linkList, 10));
        System.out.println(linkList);


        System.out.println(dequeue(linkList));
        System.out.println(linkList);


        System.out.println(first(linkList));
        System.out.println(linkList);
    }


}
