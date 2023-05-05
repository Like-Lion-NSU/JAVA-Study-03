import java.util.ArrayList;

public class PuppyMain {
    public static void main(String[] args) {
   ArrayList<Puppy> pp = new ArrayList<Puppy>();
   pp.add(new Puppy("꼬미",9,"14-352-36"));
    for(Puppy dog:pp){
        dog.puppyInfo();
    }
    }
}
class Puppy{
   String name;
   int age;
   String chipNo;

    Puppy(String name, int age, String chipNo){
        this.name=name;
        this.age=age;
        this.chipNo=chipNo;
    }
    public void puppyInfo(){
        System.out.println(name+"("+age+")>> "+chipNo);
    }

}