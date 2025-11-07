public class PacifistLeader extends Leader{

    public PacifistLeader(String name, String country, int yearInPower) {
        super(name, country, yearInPower);
    }


    public void giveSpeech() {
        System.out.println( name + " is giving a peaceful speech with no malice");
    }
    @Override
    public void printDetails() {
        System.out.println("\nName: " + name +
                            "\nCountry: " + country +
                            "\nYears in Leadership: " + yearInPower);
    }

}
