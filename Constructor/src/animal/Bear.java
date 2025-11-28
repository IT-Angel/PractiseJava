package animal;

public class Bear {
    protected String name;

    protected double weight;

    protected String type;

    protected String colour;


  public void eat() {
      System.out.println("bear is eating");
  }

  protected void sleep() {
      System.out.println("bear is sleeping");
  }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
