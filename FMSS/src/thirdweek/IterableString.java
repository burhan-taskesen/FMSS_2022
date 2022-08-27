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
        return new Iterator<Character>() {
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

    @Override
    public void forEach(Consumer<? super Character> action) {
        Iterable.super.forEach(action);
    }

    public static void main(String[] args) {
        IterableString characters = new IterableString("Merhaba");
        for (Character character : characters) {
            System.out.println(character);
        }
    }
}
