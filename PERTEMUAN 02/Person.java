// NOMOR 2

public class Person {
    String name;
    int age;
    boolean isMale;

    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge (){
        return age;
    }
    public void setGender (boolean isMale){
        this.isMale = isMale;
    }
    public String getGender(){
        if ( isMale == true){
            return "laki-laki" ;
        
        }else {
            return "perempuan";
        }
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("wina");
        person1.setAge(20);
        person1.setGender(false);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
    }
}
