package se.iths.martin.lambdaandstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo implements Runnable {

    public static void main(String[] args) {
        Runnable demo = new StreamDemo();
        demo.run();
    }

    public void run() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i + 1);
        }
        arrayList.stream().filter(tal -> tal % 2 == 0).forEach(System.out::println);

        System.out.println(arrayList.stream().filter(tal -> tal % 2 == 0).count());

        //Returnera svaret som en lista.
        List<Integer> list= arrayList.stream().filter(tal -> tal % 2 == 0).collect(Collectors.toList());

        Optional<Integer> optional = arrayList.stream().filter(tal -> tal % 2 == 0)
                .max((o1, o2) -> o1.compareTo(o2));

        if( optional.isPresent() )
            System.out.println(optional.get());

    }
}
