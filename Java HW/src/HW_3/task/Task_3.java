package HW_3.task;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.List;
public class Task_3 {

    public static void minMaxValue(){

        List<Integer> arr = List.of(5,3,15,12);
        int min = arr.get(0);
        int max = arr.get(0);
        double avg = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)>=max){
                max = arr.get(i);
            } else if (arr.get(i)<min) {
                min = arr.get(i);
            }
            avg += arr.get(i);
        }
        avg /= arr.size();

        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);

    }

}
