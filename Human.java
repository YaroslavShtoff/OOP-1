public class Human {
    int yearOfBirth ;
    String name;
    String town;
    String jobTitle;

    public Human( int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
        this.name = name;
        if (name== null) {
            this.name = "Информация не указана";
        }
        this.town = town;
        if (town == null) {
            this.name = "Информация не указана";
        }
        this.jobTitle = jobTitle;
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }
    }

    void life() {
        System.out.println(" Привет! Меня зовут" + name + ". Я из города " + town + ". Я родился в "
                + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
