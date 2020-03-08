package com.epam.collections;

@SuppressWarnings("rawtypes")
public class App extends Arraylist
{

    @SuppressWarnings("unchecked")
public static void main( String[] args )
    {
        Arraylist<Integer> list=new Arraylist();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);
        list.addElement(6);
        list.addElement(7);
        list.addElement(8);
        list.addElement(9);
        list.addElement(0);
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        logger.info(list.getElement(6));
        list.delete(4);
        list.print();
    }
}