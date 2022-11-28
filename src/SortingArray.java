//Элементы массива, упорядоченные соответствующим образом.
//Сначала чётные элементы массива в том порядке, как они встречаются в массиве,
//затем нечётные элементы массива в том порядке, как они встречаются в массиве.

public class SortingArray {
    public static void main(String[] args) {
        int[] myArray = {10, 3, 22, 75, 12};
        for (int i = 0; i < myArray.length; i++) {
            int temp;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[j] % 2 == 0) {
                    i++;
                    temp = myArray[i - 1];
                    myArray[i - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
            for (i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }
        }
    }
}

