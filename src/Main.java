import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        List<Person> listOfParticipants = new ArrayList<>();
        Person personOne = new Person("Vasya", "Pupckin", 1);
        Person personTwo = new Person("Kolya", "Superman", 2);
        Person personThree = new Person("Dima", "Ivanov", 3);
        Person personFour = new Person("Olya", "Smirnova", 4);
        Person personFive = new Person("John", "Smith", 8);
        listOfParticipants.add(personOne);
        listOfParticipants.add(personTwo);
        listOfParticipants.add(personThree);
        listOfParticipants.add(personFour);
        listOfParticipants.add(personFive);
        return listOfParticipants;
    }

    public static void main(String[] args) {
        Queue<Person> queueForTheAttraction = new LinkedList<>(generateClients());
        int count = 0;
        while (!queueForTheAttraction.isEmpty()) {
            Person personOnAttraction = queueForTheAttraction.poll();
            if (personOnAttraction != null && personOnAttraction.haveTickets() != 0) {
                personOnAttraction.spendTicket(1);
                count++;
                System.out.println(count + ". " + personOnAttraction.getName() + " " + personOnAttraction.getSurname() + " прокатился на аттракционе!");
                if (personOnAttraction.haveTickets() != 0) {
                    queueForTheAttraction.offer(personOnAttraction);
                }
            }
        }
    }
}
