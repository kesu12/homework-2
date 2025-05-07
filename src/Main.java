public class Main {
    public static void main(String[] args) {
        int[] arr = {45, 78, -15, 12, 34, 6, 90, 7, -2, -45};
        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);



        String even = "";
        String odd = "";

        for (int num : arr) {
            if (num % 2 == 0) {
                even += (" ") + num;
            } else {
                odd += (" ") + num;
            }
        }

        System.out.println("Четные числа:" + even);
        System.out.println("Нечетные числа:" + odd);

        String maxNumbers = "";
        String minNumbers = "";
        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;

        for (int num : arr) {
            String strNum = Integer.toString(num);
            int currentLength = strNum.length();

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxNumbers = strNum;
            } else if (currentLength == maxLength) {
                maxNumbers += ", " + strNum;
            }

            if (currentLength < minLength) {
                minLength = currentLength;
                minNumbers = strNum;
            } else if (currentLength == minLength) {
                minNumbers += ", " + strNum;
            }
        }

        System.out.println("Самое длинное число: " + maxNumbers);
        System.out.println("Самое короткое число: " + minNumbers);

    }
}