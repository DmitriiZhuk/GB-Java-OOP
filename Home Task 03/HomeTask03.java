import java.util.ArrayList;
import java.util.List;

class HomeTask03 {
    public static void main(String[] args) {

        Person john = new Person("Иван", 30, Gender.MALE, MaritalStatus.MARRIED);
        john.printPerson();

        Pet barsik = new Pet("Барсик", 2, "Бурма");
        john.setPet(barsik);
        john.callPet("Кис-Кис");
    }
}

class Person {
    private final String name;
    private final int age;
    private final Gender gender;
    private final MaritalStatus status;
    private Pet pet;

    public Person(String name, int age, Gender gender, MaritalStatus status) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.status = status;
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

    public void printPerson() {
        System.out.println("Человека зовут: " + name + ", возраст: " + age + ", пол: " + gender + ", статус: " + status);
    }
}

enum Gender {
    MALE, FEMALE
}

enum MaritalStatus {
    SINGLE, MARRIED, DIVORCED
}


class Pet {
    private final String name;
    private final int age;
    private final String breed;

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void respondToCall(String call) {
        System.out.println(name + " отвечает на " + call);
    }
}

class Relationship {
    private final Person person;
    private final List<Person> parents = new ArrayList<>();
    private final List<Person> children = new ArrayList<>();
    private final List<Person> brothers = new ArrayList<>();
    private final List<Person> sisters = new ArrayList<>();

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
}
