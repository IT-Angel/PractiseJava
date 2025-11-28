package bird;

public abstract class Bird {

    private String name;
    private Byte age;



    public abstract String getVoice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
}
