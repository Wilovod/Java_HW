package HW_3.task;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_2 {

    public static void getSortedList(){
        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <6; i++) {
            list.add(rd.nextInt(1,10));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
                if(list.get(i) % 2 == 0) list.remove(i);
            }
        System.out.println(list);
        }
}
