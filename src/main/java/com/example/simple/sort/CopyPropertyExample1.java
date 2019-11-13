package com.example.simple.sort;

import com.example.simple.sort.pojo.Person2;
import org.springframework.beans.BeanUtils;

public class CopyPropertyExample1 {
    public static void main(String[] args){
//        Person2 person = new Person2();
//        person.setAge(12);
//        person.setName("testName");
//        Person2 person3 = new Person2();
//        BeanUtils.copyProperties(person,person3,"age","name");
//        //BeanUtils.copyProperties(person,person3,new String[]{"age","name"});
//        //BeanUtils.copyProperties(person,person3);
//        System.out.println(person3.getAge()+" "+person3.getName());

        Person2 person2 = new Person2();
        person2.setNum(1001L);
        String numstr = person2.getNum().toString();
        System.out.println(person2.getNum().longValue());


    }
}
