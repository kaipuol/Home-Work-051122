//Элементы массива, упорядоченные соответствующим образом.
//Сначала чётные элементы массива в том порядке, как они встречаются в массиве,
//затем нечётные элементы массива в том порядке, как они встречаются в массиве.

public class SortingArray {
    public static void main(String[] args) {
        int[] myArray = {10, 3, 22, 75, 12};
        for (int i = 0; i < myArray.length; i++) {
            int j = 0, c=0;
            while (j != myArray.length) {
                if (myArray[j] % 2 == 0) {
                    i=i+1;
                    c = myArray[i-1];
                    myArray[i-1] = myArray[j];
                    myArray[j] = c;
                }
                j++;
            }
            for (i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }
        }
    }
}

