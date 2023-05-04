import java.util.ArrayList;

class Puppy {
    String name;
    int age;
    String chipNo;

    public Puppy(String name, int age, String chipNo) {
        this.name = name;
        this.age = age;
        this.chipNo = chipNo;
    }

    public void puppylnfo() {
        System.out.println(name + "(" + age + ") >> " + chipNo);
    }
}

public class PuppyMain {
    public static void main(String[] args) {
        ArrayList<Puppy> pp = new ArrayList<>();
        pp.add(new Puppy("꼬미", 9, "23-120-1"));
        pp.add(new Puppy("초코", 4, "23-100-5"));
        pp.add(new Puppy("루루", 2, "23-120-7"));

        for (Puppy dog : pp) {
            dog.puppylnfo();
        }
    }
}
