package com.example.week2daily5testassignment;

import java.util.Arrays;

public class CustomArrayList <T> {

    private int i=0;
    private Object obj[];
    private T t;

    public static void main(String[] args) {

        CustomArrayList<Integer> integerArrayList=new CustomArrayList<>();
        CustomArrayList<String> stringArrayList=new CustomArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);

        stringArrayList.add("Ricky");
        stringArrayList.add("Nafis");
        stringArrayList.add("Joel");
        stringArrayList.add("Albert");
        stringArrayList.add("Brandon");
        stringArrayList.add("Michel");
        stringArrayList.add("Frank");
        stringArrayList.add("Josh");



        System.out.println(integerArrayList+"  "+stringArrayList);
    }

    public CustomArrayList(){

        obj=new Object[5];

    }

    public void add(T t){

        this.t=t;
        if(i==obj.length-1){

            obj= Arrays.copyOf(obj, obj.length+(obj.length*2));
            System.out.println(obj.length);
        }
        obj[i]=this.t;
        i++;
    }
    public Object get(int i){

        if(obj[i]!=null){

            return obj[i];
        }
        else{
            throw new ArrayIndexOutOfBoundsException("index:"+i);
        }
    }

    public String toString(){

        String temp="";
        for(Object ob:obj){

            if(ob!=null){

                    temp=temp+ob+',';

            }
        }

        String temp1=temp.substring(0, temp.length()-1);

        return "["+temp1+"]";

    }
}
