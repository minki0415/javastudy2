package stream.serialization;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = -150325240254436183L;
    String name;
    String job;
//    transient String job;

    public Person(){};

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name +", " + job;
    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person p1 = new Person("안재용", "대표이사");
        Person p2 = new Person("김철수", "상무이사");

        try(FileOutputStream fos = new FileOutputStream("serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(p1);
            oos.writeObject(p2);
        }catch (IOException e) {
            e.printStackTrace();
        }
        try(FileInputStream fis = new FileInputStream("serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();
            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
