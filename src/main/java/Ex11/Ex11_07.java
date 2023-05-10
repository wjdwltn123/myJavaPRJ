package Ex11;
class Car2 {
    private String color;
    private int speed;

    Car2(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public String GetColor() {
         return color;
    }
    public int GetSpeed() {
        return speed;
    }
}

public class Ex11_07 {
    public static void main(String[] args) {
        Car2 myCar1 = new Car2("빨강", 0);
        Car2 myCar2 = new Car2("파랑", 30);

        System.out.println("자동차1의 색상은"+ myCar1.GetSpeed() + "이며, 현재속도는 "+myCar1.GetColor()+"km입니다.");
        System.out.println("자동차2의 색상은"+ myCar2.GetSpeed() + "이며, 현재속도는 "+myCar2.GetColor()+"km입니다.");
    }
}
