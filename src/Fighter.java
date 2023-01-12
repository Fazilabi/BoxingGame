public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge>= 0 && dodge<=100){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }
        this.dodge = dodge;
    }

    int hit(Fighter rakip) {
        System.out.println(this.name + " --> " + rakip.name + " " + this.damage + " damaged.");
        if(rakip.isDodge()){
            System.out.println(rakip.name + " bloked damage");
        }

        if (rakip.health - this.damage<0){
            return 0;
        }
        return rakip.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber<= this.dodge;
    }
}
