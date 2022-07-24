interface AbstractPerson{
    public EnumGender getGender();
    public default void speak(EnumGender enumGender){
        switch(enumGender){
            case MAN:
                System.out.println("I'm a man");
                break;

            case WOMAN:
                System.out.println("I'm a woman");
                break;
        }
    }
}
