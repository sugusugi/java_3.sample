public class Person{
    private EnumGender gender;

    public Person(EnumGender enumGender){
        this.gender = enumGender;
    }

    enum EnumGender{
        MAN , WOMAN
    };

    public static void main(String[] args){
        Person man = new Person(EnumGender.MAN);
        Person woman = new Person(EnumGender.WOMAN);
        man.speak();
        woman.speak();
    }

    public void speak(){
        switch(gender){
            case MAN:
                System.out.println("I'm a man");
                break;

            case WOMAN:
                System.out.println("I'm a woman");
                break;
        }
    }
}
