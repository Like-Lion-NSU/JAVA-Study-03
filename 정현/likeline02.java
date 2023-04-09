// 학생 클래스
class Student {
    private String name;       // 이름
    private int coin;          // 가지고 있는 돈

    public Student(String name, int coin) {
        this.name = name;
        this.coin = coin;
    }

    public void goSchool(go transportation) {
        System.out.println(name + "이(가) " + transportation.getName() + "타고 학교를 간다");
        transportation.use();
    }
}

// 대중교통
abstract class go {
    private String name;

    public go(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void gonumber();
    public abstract void people();
    public abstract void money();

    public abstract void use();
}

// 버스
class Bus extends go {
    public Bus() {
        super("버스");
    }
    public void gonumber() {
        System.out.println("1000원");
    }
    public void people() {
        System.out.println("승객은 5명");
    }
    public void use() {
        System.out.println("버스를 타고 이동합니다.");
    }
}

// 지하철
class Subway extends go {
    public Subway() {
        super("지하철");
    }

    public void use() {
        System.out.println("지하철을 타고 이동합니다.");
    }
}

// 택시
class Taxi extends go {
    public Taxi() {
        super("택시");
    }

    public void use() {
        System.out.println("택시를 타고 이동합니다.");
    }
}


public class likeline02 {
    public static void main(String[] args) {
        Student i = new Student("likeline", 15000);
        go bus = new Bus();
        go subway = new Subway();
        go taxi = new Taxi();

        i.goSchool(bus);
        i.goSchool(subway);
        i.goSchool(taxi);
    }
}
