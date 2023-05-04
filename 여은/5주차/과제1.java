public class TV {
    public static void main(String[] args) {
        TVE myTV = new TVE("LG",2017,32);
        myTV.show();
    }
}
class TVE {
    private String brand;
    private int year;

    private int size;

    TVE(String brand, int year, int size) {
        this.brand=brand;
        this.year=year;
        this.size=size;
    }

    public void show(){
        System.out.println(brand+"에서 만든 "+ year +"년형 " + size + "인치 TV");
    }
}
