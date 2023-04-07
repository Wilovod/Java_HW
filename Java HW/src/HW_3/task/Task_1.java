package HW_3.task;

// Реализовать алгоритм сортировки слиянием


public class Task_1 {

    public static int[] sortArray(int[] arrayA){
        if(arrayA.length<2){
            return arrayA;
        }
        int[] arrayB = new int[arrayA.length/2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2 );
        int[] arrayC = new int[arrayA.length/2];
        System.arraycopy(arrayA,arrayA.length/2,arrayC,0,arrayA.length-arrayA.length/2);
        sort(arrayB);
        sort(arrayC);
        return mergeArray(arrayB,arrayC);
    }
    public static int[] mergeArray(int[] firstArray, int[] secondArray){
        int a = firstArray.length + secondArray.length;
        int [] thirdArray =new int[a];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < thirdArray.length; i++) {
            if (positionA == firstArray.length){
                thirdArray[i] = secondArray[positionB];
                positionB++;
            } else if (positionB == secondArray.length) {
                thirdArray[i] = firstArray[positionA];
                positionA++;
            } else if (firstArray[positionA] < secondArray[positionB]) {
                thirdArray[i] = firstArray[positionA];
                positionA++;
            } else {
                thirdArray[i] = secondArray[positionB];
                positionB++;
            }
        }
        return thirdArray;
    }
    private static void sort(int[] arrayX){
        int buffer = 0;
        for (int j = 0; j < arrayX.length-1; j++) {
            if (arrayX[j] > arrayX[j+1]) {
                buffer = arrayX[j+1];
                arrayX[j+1] = arrayX[j];
                arrayX[j] = buffer;
            }
        }
    }
}
