package qa;

import java.util.*;

public class MapPlay {
    public static void main(String[] args) {
        mapPlayTest();
    }

    public static void mapPlayTest() {

        //создать список сотрудников
        Map<String, String> kesha = new HashMap<>();
        kesha.put("Имя", "Кеша");
        kesha.put("Возраст", "26");
        kesha.put("Должность", "Middle java dev");
        kesha.put("Зарплата", "150000 руб");

        Map<String, String> vitya = new HashMap<>();
        vitya.put("Имя", "Витя");
        vitya.put("Возраст", "28");
        vitya.put("Должность", "Senior java automation QA");
        vitya.put("Зарплата", "2000$");

        Map<String, String> alesha = new HashMap<>();
        alesha.put("Имя", "Алеша");
        alesha.put("Возраст", "31");
        alesha.put("Должность", "junior functional tester");
        alesha.put("Зарплата", "50000 руб");

        Map<String, String> dima = new HashMap<>();
        dima.put("Имя", "Дима");
        dima.put("Возраст", "35");
        dima.put("Должность", "dev-ops");
        dima.put("Зарплата", "1500$");

//преобразовать мапку типа стринг-стринг в лист
        List<Map<String, String>> employlist = new ArrayList<Map<String, String>>();
        employlist.add(0, kesha);
        employlist.add(1, vitya);
        employlist.add(2, alesha);
        employlist.add(3, dima);

// Task: вывести имена всех сотрудников, младше 30.

        int keshaAge = Integer.parseInt(kesha.get("Возраст"));
        if (keshaAge < 30)
            System.out.println("Имя сотрудника до 30:" + kesha.get("Имя"));
        int vityaAge = Integer.parseInt(vitya.get("Возраст"));
        if (vityaAge < 30)
            System.out.println("Имя сотрудника до 30:" + vitya.get("Имя"));
        int aleshaAge = Integer.parseInt(alesha.get("Возраст"));
        if (aleshaAge < 30)
            System.out.println("Имя сотрудника до 30:" + alesha.get("Имя"));
        int dimaAge = Integer.parseInt(dima.get("Возраст"));
        if (dimaAge < 30)
            System.out.println("Имя сотрудника до 30:" + dima.get("Имя"));


//  вывести имена всех сотрудников, получающих зарплату в рублях.

        String rubzp = "руб";

        String keshaZp = kesha.get("Зарплата");
        if (keshaZp.contains(rubzp)) {
            System.out.println("Имя сотрудника с рублевой зп:" + kesha.get("Имя"));
        }
        String vityaZp = vitya.get("Зарплата");
        if (vityaZp.contains(rubzp)) {
            System.out.println("Имя сотрудника с рублевой зп:" + vitya.get("Имя"));
        }
        String aleshaZp = alesha.get("Зарплата");
        if (aleshaZp.contains(rubzp)) {
            System.out.println("Имя сотрудника с рублевой зп:" + alesha.get("Имя"));
        }
        String dimaZp = dima.get("Зарплата");
        if (dimaZp.contains(rubzp)) {
            System.out.println("Имя сотрудника с рублевой зп:" + dima.get("Имя"));
        }


        //вывести средний возраст сотрудников

        int keshaAgeInt = Integer.parseInt(kesha.get("Возраст"));
        int vityaAgeInt = Integer.parseInt(vitya.get("Возраст"));
        int aleshaAgeInt = Integer.parseInt(alesha.get("Возраст"));
        int dimaAgeInt = Integer.parseInt(dima.get("Возраст"));
        double averageAge = (keshaAgeInt + vityaAgeInt + aleshaAgeInt + dimaAgeInt) / 4;
        System.out.println("Средний возраст сотрудника: " + averageAge);

    }
}
