package springdemo.coach;

public class LiteralValuesCoach implements Coach {
    private String name;
    private String email;
    private String something;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        System.out.println("name is set.");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("email is set.");
        this.email = email;
    }

    public void setSomething(String something) {
        System.out.println("something is set.");
        this.something = something;
    }

    public String getSomething() {
        return this.something;
    }

    @Override
    public void getWorkout() {

    }

    @Override
    public String getDailyFortune() {
        return "Fortune Dummy (not real fortune service)";
    }
}
