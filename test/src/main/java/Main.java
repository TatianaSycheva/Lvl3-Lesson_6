public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findLastFourCopyAfter(input));

    }

    public static int[] findLastFourCopyAfter(int[] arr) throws RuntimeException {
        for (int i = (arr.length - 1); i > -1; i--) {
            if (arr[i] == 4) {
                i++;
                int[] newArr = new int[arr.length - i];
                for (int j = 0; j < newArr.length; j++) {
                    newArr[j] = arr[i + j];
                }
                return newArr;
            }
        }
        throw new RuntimeException();
    }

    public static boolean checkSequence(int[] arr) {
        int countOne = 0, countFour = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOne++;
            } else if (arr[i] == 4) {
                countFour++;
            } else {
                return false;
            }
        }
        if (countOne > 0 && countFour > 0) {
            return true;
        }
        return false;
    }

}
