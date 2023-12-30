package qa;


import java.util.*;
import java.util.stream.Collectors;

public class ListStreamApi {
    public static void main(String[] args) {


        Person kirill = new Person("Кирилл", 26, "Middle java dev", "150000 руб");
        Person vitaly = new Person("Виталий", 28, "Senior java automation QA", "2000$");

        Person alexander = new Person("Александр", 31, "junior functional tester", "50000 руб");
        Person dementy = new Person("Дементий", 35, "dev-ops", "1500$");

        List<Person> personList = new ArrayList<>(
                Arrays.asList(new Person[]{kirill, vitaly, alexander, dementy}));

        //отобрать людей до 30
      List<Person> zoomers = personList.stream()
                .filter((Person person) -> {
                    return person.getAge() < 30;
                }).collect(Collectors.toList());
        System.out.println(zoomers);

        //отобрать людей с рублевой зп
     String rubzp = "руб";
        List<Person> roubzpworkers = personList.stream()
                .filter((Person person) -> {
                    return person.getZp().contains(rubzp);
                }).collect(Collectors.toList());



    }
}


//   System.out.println(employees.get("Зарплата"));  //работает +++ выводит все зарплаты
// System.out.println(employees.get("Зарплата").iterator().next());  // +++ выводит первую зарплату
// int age = employees.values().size(); // 16 - 16 ключей
