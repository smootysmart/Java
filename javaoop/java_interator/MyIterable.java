package javaoop.java_interator;

import java.util.Iterator;

public class MyIterable implements Iterable<String> {

    private String[] elements;

    public MyIterable(String[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < elements.length && elements[currentIndex] != null;
        }

        @Override
        public String next() {
            return elements[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Alice"};
        MyIterable iterableClass = new MyIterable(names);

        for (String name : iterableClass) {
            System.out.println(name);
        }
    }
}

