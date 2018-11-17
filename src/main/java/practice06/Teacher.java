package practice06;

public class Teacher extends Person{
    private int klass;
    private boolean noClass = false;

    public Teacher(String name, int age, int klass){
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age ){
        super(name, age);
        this.noClass = true;
    }

    public  int getKlass(){
        return this.klass;
    }

    @Override
    public String introduce() {
        if(noClass){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        else{
            return super.introduce() + " I am a Teacher. I teach Class "+ this.klass +".";
        }

    }
}




