import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("task1");
        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        task1(nums);
        System.out.println();

        System.out.println("task2");
        List<Integer> nums2 = new ArrayList<>(List.of(6,1,2,33,77,3,4,5,60,3,7,2,7,8,9));
        task2(nums);
        System.out.println();

        System.out.println("task3");
        List<String> strings = new ArrayList<>(List.of("apple", "foot", "table", "head", "apple", "foot"));
        task3(strings);
        System.out.println();

        System.out.println("task4");
        List<String> strings2 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "четыре", "четыре", "четыре", "четыре"));
        task4(strings2);
        System.out.println();


    }

    public static void  task1(List<Integer> list) {
        for (Integer integer : list) {
            if (integer %2 == 1) {
                System.out.print(integer + " ");
            }
        }
    }

    public static void task2(List<Integer> list) {

        Collections.sort(list);
        Set<Integer> alreadyPrintedNums = new HashSet<>();

        for (Integer integer : list) {
            if (!alreadyPrintedNums.contains(integer)) {
                if (integer %2 == 0) {
                System.out.print(integer + " ");
            }
            alreadyPrintedNums.add(integer);
        }
    }
    }

    public static void task3(List<String> list) {

        Set<String> uniqueWords = new HashSet<>(list);
        System.out.println(uniqueWords);
    }

    public static void task4(List<String> list) {

        Map<String, Integer> wordsToQuantity = new HashMap<>();

        for (String s : list) {
            if (wordsToQuantity.containsKey(s)) {
                wordsToQuantity.put(s, wordsToQuantity.get(s) +1);
            }else {
                wordsToQuantity.put(s,1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : wordsToQuantity.entrySet()) {

            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }

    }
}
