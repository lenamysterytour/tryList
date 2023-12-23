package qa;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.TreeMultimap;

import java.util.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Try {
    public static void main(String[] args) {


        Multimap<String, String> employees = LinkedHashMultimap.create();
        employees.put("Имя", "Кирилл");
        employees.put("Имя", "Виталий");
        employees.put("Имя", "Александр");
        employees.put("Имя", "Дементий");
        employees.put("Возраст", "26");
        employees.put("Возраст", "28");
        employees.put("Возраст", "31");
        employees.put("Возраст", "35");
        employees.put("Должность","Middle java dev");
        employees.put("Должность","Senior java automation QA");
        employees.put("Должность","junior functional tester");
        employees.put("Должность","dev-ops");
        employees.put("Зарплата", "150000 руб");
        employees.put("Зарплата", "2000$");
        employees.put("Зарплата", "50000 руб");
        employees.put("Зарплата", "1500$");

      //  employees.put("Возраст", "26");
    //    employees.put("Должность", "Middle java dev");
    //    employees.put("Зарплата", "150000 руб");
       // System.out.println(employees);
      //  Set Keyset = employees.keySet();
//        System.out.println(employees.values());
        //        System.out.println(employees.get("Зарплата"));  //работает +++


     //   System.out.println(employees.get("Зарплата"));  //работает +++ выводит все зарплаты
//        System.out.println(employees.values().iterator().next().indexOf(1));
   //     System.out.println(employees.get("Зарплата").iterator());
        // System.out.println(employees.get("Зарплата").iterator().next());  // +++ выводит первую зарплату
        System.out.println(employees.get("Зарплата").iterator().toString());
        //       Collections.
//        Set ValueSet = employees.values();
  //      Iterator keyIterator = employees.keys().iterator();
    //    while (keyIterator.hasNext())
      //  {String key = (String) keyIterator.next();
        //    System.out.println(key);


      //      List values = employees.get(key);
        }
    //   for(Object value: employees.values())
      // { if(value.hashCode() >10)
        //   System.out.println(value);
        //}
        //employees.put("Имя", "Виталий");
//  employees.put("Возраст", "28");
        //   employees.put("Должность", "Senior java automation QA");
        //   employees.put("Зарплата", "2000$");
        //  System.out.println(employees);
        //     employees.put("Имя", "Александр");
        //     employees.put("Возраст", "31");
        //     employees.put("Должность", "junior functional tester");
        //     employees.put("Зарплата", "50000 руб");
        //    employees.put("Имя", "Дементий");
        //     employees.put("Возраст", "35");
        //    employees.put("Должность", "dev-ops");
        //     employees.put("Зарплата", "1500$");
        //     System.out.println(employees);

        //   List<Map.Entry<String, String>> employeez = new ArrayList<>(employees.entrySet());
        // System.out.println(employeez);

//Person person = new Person();
        //      List<Person> people = new ArrayList<>();
        //    people.add(person("Кирил",3,"middle","35373"))
    }
