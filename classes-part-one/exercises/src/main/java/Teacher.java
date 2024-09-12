public class Teacher {
    private String firstName;
    private String lastName;
    private int yearsTeaching;

    private void setFirstName(String aFirstName){
        this.firstName = aFirstName;
    }

    private void setLastName(String aLastName){
        this.lastName = aLastName;
    }

    private void setYearsTeaching(int aYearsTeaching){
        this.yearsTeaching = aYearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private int getYearsTeaching() {
        return yearsTeaching;
    }

}
