package thirdweek;

import java.util.Iterator;
import java.util.function.Consumer;

public class IterableString implements Iterable<Character> {
    String value_;
    int iterator;

    IterableString(String value){
        value_ = value;
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return iterator<value_.length()-1;
            }

            @Override
            public Character next() {
                return value_.charAt(iterator++);
            }
        };
    }

    public static void main(String[] args) {
        IterableString characters = new IterableString("Merhaba");
        for (Character character : characters) {
            System.out.println(character);
        }
    }
}
