public class Indvidual {
    private String fullname;
    private Integer ageGroup;

    public Indvidual(String fullname, Integer ageGroup) {
        this.fullname = fullname;
        this.ageGroup = ageGroup;
    }

    @Override
    public String toString() {
        return "Age Group: " + this.ageGroup + " " + this.fullname;
    }
}
