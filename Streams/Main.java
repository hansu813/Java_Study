package 스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * packageName    : 스트림
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 */
public class Main {

//  1-2. 컬렉션 스트림

    public static void main(String[] args) {
//      1. 스트림 생성
//      1-1. 배열 스트림
        System.out.println("== 배열 스트림 ==");
        String[] arr = new String[]{"a", "b", "c"};

        System.out.println("== fori ==");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("== foreach ==");
        for (String item : arr) {
            System.out.println(item);
        }

        System.out.println("== to Stream ==");
        Stream stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);

//      1-2. 컬렉션 스트림
        System.out.println("== 컬렉션 스트림 ==");
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println(list1);

        Stream stream2 = list1.stream();
//        stream2.forEach(System.out::println);
        stream2.forEach(num -> System.out.println("num : " + num));

//      1-3. 스트림 builder
        System.out.println("== Stream Builder ==");
        Stream streamBuilder = Stream.builder().add(1).add(2).add(3).build();
        streamBuilder.forEach(System.out::println);


//      1-4. 스트림 generate
        System.out.println("== Stream generate ==");
        Stream streamGenerate = Stream.generate(() -> "abc").limit(3);
        streamGenerate.forEach(System.out::println);

//      1-5. 스트림 iterate
        System.out.println("== Stream iterate ==");
        Stream streamIterate = Stream.iterate(10, n -> n * 2).limit(3);
        streamIterate.forEach(System.out::println);

//      1-6. 기본 타입 스트림
        System.out.println("== 기본타입 스트림 ==");
        IntStream intStream1 = IntStream.rangeClosed(1, 5);
        intStream1.forEach(System.out::println);

//      2. 스트림 중개 연산

//      2-1. Filtering
        System.out.println("== Filtering ==");
        IntStream intStream2 = IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0);
        intStream2.forEach(System.out::println);

//      2-2. Mapping
        System.out.println("== Mapping ==");
        IntStream intStream3 = IntStream.rangeClosed(1, 10).map(n -> n + 1);
        intStream3.forEach(n -> System.out.print(n + " "));
        System.out.println();

//      2-3. Sorting
        System.out.println("== Sorting ==");
        IntStream intStream4 = IntStream.builder().add(5).add(1).add(3).add(4).add(2).build();
        IntStream intStreamSort = intStream4.sorted();
        intStreamSort.forEach(System.out::println);

//      3. 최종연산

//      3-1. sum, average
        System.out.println("== sum, average ==");
        int sum = IntStream.range(1, 5).sum();
        System.out.println(sum);

        double average = IntStream.range(1, 5).average().getAsDouble();
        System.out.println(average);

//      3-2. Min, Max
        System.out.println("== Min, Max ==");
        int min = IntStream.range(1,10).min().getAsInt();
        int max = IntStream.range(1, 10).max().getAsInt();
        System.out.println("min = " + min +" max = " + max);

//      3-3. reduce
        System.out.println("== reduce ==");
        Stream<Integer> stream5 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)).stream();
        System.out.println(stream5.reduce((x, y) -> x + y).get());

//      3-4. forEach
        System.out.println("== forEach ==");
        IntStream.range(1, 10).filter(n -> n == 5).forEach(System.out::println);
    }
}
