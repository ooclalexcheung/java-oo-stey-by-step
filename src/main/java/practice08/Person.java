package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getId(){
        return this.id;
    }

    public String  introduce(){
        String intro = "My name is " + this.getName() + ". I am "+ this.getAge() + " years old.";
        return intro;
    }

    public String toString() {
        return id+"";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.getId() == person.getId();
    }
    @Override
    public int hashCode() {
        return this.id;
    }
}
