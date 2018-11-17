package practice10;
import java.util.*;

public class Teacher extends Person {
    LinkedList<Klass> klass = null;
    private boolean noClass = false;

    public Teacher(int id, String name, int age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.noClass = true;
    }

    public LinkedList<Klass> getClasses() {
        return this.klass;
    }

    @Override
    public String introduce() {

        String intro = super.introduce() + " I am a Teacher. I teach ";
        if (noClass) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            for(int i=0; i<this.getClasses().size(); i++){
                if(i==this.getClasses().size()-1){
                    intro += this.klass.get(i).getNumber() + ".";
                }
                else {
                    intro += "Class " + this.klass.get(i).getNumber() + ", ";
                }
            }
            return  intro;
        }
    }

    public String introduceWith(Student s) {
        boolean Teaching = false;
        for (int i = 0; i < this.getClasses().size(); i++) {
            if (this.getClasses().get(i).getNumber() == s.getKlass().getNumber()) {
                Teaching = true;
            }
        }
        if (Teaching) {
            return super.introduce() + " I am a Teacher. I teach " + s.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + s.getName() + ".";
        }
    }

    public boolean isTeaching(Student s) {
        boolean Teaching = false;
        for (int i = 0; i < this.getClasses().size(); i++) {
            if (this.getClasses().get(i).getNumber() == s.getKlass().getNumber()) {
                Teaching = true;
            }
        }
        if (Teaching) {
            return true;
        } else {
            return false;
        }
    }
}

