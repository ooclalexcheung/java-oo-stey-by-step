package practice11;
import java.util.*;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    public  Klass getKlass(){
        return this.klass;
    }

    public void setClass(Klass klass){
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(this.klass.getLeader()!=null){
            return super.introduce() + " I am a Student. I am Leader of " + this.getKlass().getDisplayName() + ".";
        }
        else{
            return super.introduce() + " I am a Student. I am at " + this.getKlass().getDisplayName() + ".";
        }
    }

}
