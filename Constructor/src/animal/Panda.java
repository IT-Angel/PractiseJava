package animal;

public class Panda {

    public Panda () {
logMessage();
    }

    public Panda (String name, byte age) {
this.name = name;
logMessage();
    }


    private String name;
    private byte age;

    private void logMessage() {
        System.out.println("The object Panda is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}

//@Override
//public void eat() {
//    System.out.println("Eat leaves");
//}



//@Override
//    public String toString() {
//        return "Panda{" +
//                "name='" + name + '\'' +
//                ", weight=" + weight +
//                ", type='" + type + '\'' +
//                ", colour='" + colour + '\'' +
//                '}';
//    }