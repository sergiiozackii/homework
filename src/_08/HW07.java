package _08;
//public class HW07{
//
//    // 1. Объявить массив с n-м количеством случайных чисел(явно инициализировать массив) и выбрать из него четные и нечетные числа.
//    public static void main(String[] args) {
//       int[] array = {2,5,8,9,4,3,6,7,9,2};
//       for (int number : array){
//           if (number % 2 == 0){
//           System.out.println("Число " + number + " четное");}
//           else {
//               System.out.println("Число " + number + " нечетное");
//           }
//       }
//    }
//}

    //  2. Объявить массив с n-м количеством случайных чисел (явно инициализировать массив) и выбрать из него простые числа.
//    public static void main(String[] args) {
//        int[] array = {2, 5, 8, 9, 4, 3, 6, 7, 9, 2};
//        for (int number : array) {
//            boolean isPrime = true;
//            for (int i = 2; i < number; i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(number + " is simple");
//            }
//        }
//    }
//}
    //  3. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран
//    public static void main(String[] args) {
//        int[] fibonacci = new int[20];
//        fibonacci[0] = fibonacci[1] = 1;
//        for (int i = 2; i < fibonacci.length; i++) {
//            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
//        }
//        for (int i = 0; i < fibonacci.length; i++) {
//            System.out.print(fibonacci[i] + ",");
//        }
//    }
//}

    // 4. Объявить массив с n-м количеством случайных чисел (явно инициализировать массив) и выбрать из него наибольшее и наименьшее число
//    public static void main(String[] args) {
//        int[] array = new int[]{21, 115, 58, 49, 74, 43, 36, 257, 89, 12};
//        int max = array[0];
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            max = Math.max(max, array[i]);
//            min = Math.min(min, array[i]);
//        }
//              System.out.println("Max number is: " + max + " and Min number is: " + min);
//        }
//    }

    // 5. Умножить две матрицы
//    public static void main(String[] args) {
//        int[][] matrixA = {{3, 8, 2}, {5, 7, 4}};
//        int[][] matrixB = {{11, 5, 17}, {3, 14, 21}};

//        int[][] multiResult = new int[matrixA.length][matrixB[0].length];

//        for (int i = 0; i < matrixA.length; i++) {
//            for (int j = 0; j < matrixB[i].length; j++) {
//                for (int k = 0; k < matrixB.length; k++)
//                    multiResult[i][j] += matrixA[i][k] * matrixB[k][j];
//            }
//        }
//        for (int i = 0; i < multiResult.length; i++) {
//            for (int j = 0; j < multiResult[0].length; j++) {
//                System.out.print(multiResult[i][j] + "");
//            }
//            System.out.println();
//        }
//    }
//}

    //  6. Задать массив с n чисел. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//    public static void main(String[] args) {
////        int numbers[] = {2564, 547896, 3587421, 589654782};
////
////        int longestNumber = 0;
////        int longestNumberLenght = Integer.MIN_VALUE;
////
////        int shortestNumber = 0;
////        int shortestNumberLenght = Integer.MAX_VALUE;
////
////        for (int current : numbers) {
////            int currentNumber = current;
////            int currentNumberLenght = 0;
////
////            while (current != 0) {
////                int currentDigit = current % 10;
////                current -= currentDigit;
////                current /= 10;
////                currentNumberLenght++;
////            }
////            if (currentNumberLenght >= longestNumberLenght) {
////                longestNumber = currentNumber;
////                longestNumberLenght = currentNumberLenght;
////            }
////            if (currentNumberLenght <= shortestNumberLenght) {
////                shortestNumber = currentNumber;
////                shortestNumberLenght = currentNumberLenght;
////            }
////        }
////        System.out.println("The longest number: " + longestNumber);
////        System.out.println("The shortest number: " + shortestNumber);
////    }
////}

    // 7. Задать массив с n чисел. Найти числа, состоящее только из различных цифр.

//    public static boolean isDigitsDifferent(String number) {
//        if (number.length() < 2) {
//            return false;
//        }
//        for (int i = 0; i < number.length() - 1; i++) {
//            for (int j = 1; j < number.length(); j++) {
//                if (number.charAt(i) == number.charAt(j)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//          public static void printNumberWithDiffDigits(String[]array) {
//              for (int i = 0; i < array.length; i++) {
//                  if (isDigitsDifferent(array[i])) {
//                      System.out.println(array[i]);
//                  }
//              }
//          }
//    public static void main(String[] args) {
//          String[] numbers = {"33", "42", "555", "73", "91"};
//          System.out.print("");
//          printNumberWithDiffDigits(numbers);
//      }
//
//}
    // 8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз
//    public static void main(String[] args) {
//        int k = 15;
//        int n = 1;
//
//        while (Math.pow(n, 2) < k) {
//            n++;
//        }
//        int currentNumber = 1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (currentNumber <= k) {
//                    System.out.print((currentNumber++) + "\t");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
