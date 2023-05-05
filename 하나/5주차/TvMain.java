public class TvMain {

    public static void main(String[] args) {
         TV myTV = new TV("LG",2017,32);
         myTV.show();
    }
}
class TV{
    String name;
    int age;
    int inch;

    TV(String name, int age, int inch){
        this.name=name;
        this.age=age;
        this.inch=inch;
    }
    public void show(){
        System.out.println(this.name+"에서 만든 "+this.age+"년 "+this.inch+"인치");
    }
}