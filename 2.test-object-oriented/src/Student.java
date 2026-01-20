public class Student {
    int energy;
    public Student(){
        this.energy = 50;
    }

    void sleep(){
        this.energy += 50;
        if (this.energy >= 100) {
            this.energy = 100;
        }
        System.out.println("寝ました。エネルギーが"+energy+"になりました。");
    if (this.energy == 100) {
            System.out.println("フルパワー！");
        }
    }
    

    void study(){
        this.energy -= 30;
        if (this.energy <= 0) {
            this.energy = 0;
        }
        System.out.println("勉強しました。エネルギーが"+energy+"になりました。");
    if (this.energy == 0) {
            System.out.println("寝てください。");
        }
    }
}
