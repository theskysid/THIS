package Z_GFG.Bank.Learningg.iterabledemo;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

class OddNumberList implements Iterable<Integer> {
    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            //i have ttoo understand how the core logic is runnning i could not get it

            private int index = 0;

            public boolean hasNext() {
                while (index < numbers.size()) {
                    if (numbers.get(index) % 2 != 0) {
                        return true;
                    }
                    index++; // Skip even numbers
                }
                return false;
            }

            public Integer next() {
                return numbers.get(index++);
            }
        };
    }
}
