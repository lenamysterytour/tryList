package qa;

public class Person {


    private String name;
    private int age;
    private String job;
    private String zp;

    public Person(String name, int age, String job, String zp){
        super();
        this.name= name;
        this.age= age;
        this.job = job;
        this.zp = zp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }

    @Override
    public String toString(){
        return name;
    }

}
