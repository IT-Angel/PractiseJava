package animal;

public class BrownBear extends Bear {
    @Override
    public int hashCode() { //31 and 17
        int result =17;
        result = 31 * result + this.getName().hashCode();
        result = 31 * result + this.getColour().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Бурый медведь {" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof BrownBear)) return false;
//        BrownBear brownBear = (BrownBear) obj;
//        return brownBear.getName().equals(this.getName()) && brownBear.getColour().equals(this.getColour());
//    }
}
