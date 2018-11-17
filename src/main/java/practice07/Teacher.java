package practice07;

public class Teacher extends Person{
    private Klass klass;
    private boolean noClass = false;

    public Teacher(String name, int age, Klass klass){
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age ){
        super(name, age);
        this.noClass = true;
    }

    public  Klass getKlass(){
        return this.klass;
    }

    @Override
    public String introduce() {
        if(noClass){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        else{
            return super.introduce() + " I am a Teacher. I teach Class "+ this.klass.getNumber() +".";
        }
    }

    public String introduceWith(Student s){
        if(this.getKlass().getNumber()==s.getKlass().getNumber()){
            return super.introduce() + " I am a Teacher. I teach " + s.getName() + ".";
        }
        else{
            return super.introduce() + " I am a Teacher. I don't teach "+s.getName()+".";
        }
    }

}
