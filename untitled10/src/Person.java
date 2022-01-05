public class Person {

    private int cid;

    private String name;

    private int age;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    public Person(int cid, String name, int age) {
        this.cid = cid;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
