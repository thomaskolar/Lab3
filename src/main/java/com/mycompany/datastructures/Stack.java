
package com.mycompany.datastructures;


public class Stack {
    private int[] values;
    private int index;

    public Stack(int size) {
        values = new int[size];
    }
    
    public void push(int value)
    {
        if(index == values.length)
        {
            int[] nvalues = new int[values.length * 2];
            System.arraycopy(values,0,nvalues,0,values.length);
            values = nvalues;
        }
        values[index] = value;
        index++;
    }
    
    public int pop(){
        if(index == 0)
        {
            throw new StackException("stack is empty");
        }
        index--;
        return values[index];
    }
    
    public boolean isEmpty(){
        return index == 0;
    }
}
