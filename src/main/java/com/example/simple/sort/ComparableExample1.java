package com.example.simple.sort;

import com.example.simple.sort.pojo.Person;
import org.apache.logging.log4j.util.PropertySource;

import java.util.*;

public class ComparableExample1 {
    public static void main(String[] args){
        //https://www.cnblogs.com/larrydpk/p/11668113.html
        //Arrays.sort对String进行排序
        String[] strings = {"c","1","f","b"};
        Arrays.sort(strings);
        for(String str : strings){
            System.out.println(str);
        }
        System.out.println(Arrays.equals(strings,new String[]{"1","b","c","f"}));
        //Arrays.parallelSort() 多线程排序
        int[] nums = {3,2,3,1,22,8,10,0};
        Arrays.parallelSort(nums);
        for(int num : nums){
            System.out.println(num);
        }
        //对于没有实现Comparable的类也可以使用，但需要提供Comparator来指定比较策略
        Person[] people = new Person[]{new Person("Larray",2),new Person("David",8),new Person("Davidc",1)};
        Arrays.sort(people, Comparator.comparingInt(Person::getAge));
        for(Person person:people){
            System.out.println(person.getName()+" "+person.getAge());
        }
        List<String> names = new ArrayList<>();
        names.add("Larry");
        names.add("Harry");
        names.add("James");
        names.add("David");
//        Collections.sort(names);
        names.sort(Comparator.naturalOrder());
        names.sort(Comparator.reverseOrder());  //倒序
        for(String name:names){
            System.out.println(name);
        }
        names.stream().sorted(Comparator.naturalOrder());

        List<String> lists = new ArrayList<>(Arrays.asList(new String[]{"a","b","c"}));
        lists.add("d");
        for(String list:lists){
            System.out.println(list);
        }
    }
}
