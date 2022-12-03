class Student {
    private int id;
    private String name;
    private int zip;


    public Student() {
        id = 8;
        name = "John";
        zip = 19090;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }


    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Zip: " + zip + "\n";
    }
}

public class StudentsAreObjectsNow {
    public static void main(String[] args) {
        Student s0 = new Student();
        System.out.println(s0);
        Student s1 = new Student();
        s1.setId(312);
        s1.setName("Patrick");
        s1.setZip(28787);
        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getId());
        System.out.println("Zip code: " + s1.getZip());

    }
}