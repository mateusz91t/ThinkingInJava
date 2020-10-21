package com.matt.seqselector;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object obj) {
        if (next < items.length)
            items[next++] = obj;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object getCurrent() {
            return items[i];
        }

        @Override
        public void goNext() {
            if (i < items.length)
                i++;
        }

        public Sequence getSeq(int size){
            return Sequence.this;
        }
    }

    public Selector getSelector (){
        return new SequenceSelector();
    }
}