package bird;

public class Duck extends Bird implements BirdAction{


    @Override
    public String getVoice() {
        return "Quack-quack";
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }
}
