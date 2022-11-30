import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) throws InterruptedException {
        int N = 1000000;
        int[] myArray = new int[N];
        for (int i = 0; i < N; i++) {
            myArray[i] = (int) (1+ Math.random() * N);
        }
        long start = System.nanoTime();
        //Arrays.sort(myArray);
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[j] > myArray[j+1]) {
                    isSorted = false;
                    temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
        Thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        for (int values : myArray) {
            System.out.println(values + " ");
        }
        System.out.println("Прошло времени, мс: " + elapsed / 1000000);
    }
}



