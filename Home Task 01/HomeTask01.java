import java.util.ArrayList;
import java.util.List;

class HomeTask01 {
    public static void main(String[] args) {

        Person john = new Person("Иван", 30, "Мужчина", "женат");
        john.callPerson();

        Pet barsik = new Pet("Барсик", 2, "Бурма");
        john.setPet(barsik);
        john.callPet("Кис-Кис");

    }
}

class Person {
    private String name;
    private int age;
    private String gender;
    private Pet pet;
    private String personStatus;

    public Person(String name, int age, String gender, String personStatus) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.personStatus = personStatus;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet(String call) {
        if (pet != null) {
            pet.respondToCall(call);
        } else {
            System.out.println("У меня нет домашнего животного");
        }
    }

    public void callPerson() {
        System.out.println("Человека зовут: " + name + ", ему/ей " + age + " лет и он/она - " + gender + " и он/она "
                + personStatus);
    }

}

class Pet {
    private String name;
    private int age;
    private String breed;

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void respondToCall(String call) {
        System.out.println(name + " отвечает на " + name + " " + call);
    }

    public class Relationship {
        private Person person;
        private List<Person> parents = new ArrayList<>();
        private List<Person> children = new ArrayList<>();
        private List<Person> brothers = new ArrayList<>();
        private List<Person> sisters = new ArrayList<>();

        public Relationship(Person person) {
            this.person = person;
        }

        public void addParent(Person parent) {
            parents.add(parent);
        }

        public void addChild(Person child) {
            children.add(child);
        }

        public void addBrother(Person brother) {
            brothers.add(brother);
        }

        public void addSister(Person sister) {
            sisters.add(sister);
        }

        public Person getPerson() {
            return person;
        }

        public List<Person> getParents() {
            return parents;
        }

        public List<Person> getChildren() {
            return children;
        }

        public List<Person> getBrothers() {
            return brothers;
        }

        public List<Person> getSisters() {
            return sisters;
        }
    }
}