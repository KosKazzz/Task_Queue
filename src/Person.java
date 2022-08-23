public class Person {
    private String name;
    private String surname;
    private int countOfTickets;

    public Person() {
    }

    public Person(String name, String surname, int countOfTickets) {
        this.name = name;
        this.surname = surname;
        this.countOfTickets = countOfTickets;
    }

    public void addTicket(int tickets) {
        this.countOfTickets += tickets;
    }

    public void spendTicket(int tickets) {
        this.countOfTickets -= tickets;
    }

    public int haveTickets() {
        return countOfTickets;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
}
