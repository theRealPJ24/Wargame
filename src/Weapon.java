import java.util.ArrayList;

public class Weapon {
    private String name;
    private double damage;
    private int turn;
    private City target;
    private Defense target_defense;
    private double positionX;
    private double positionY;

//    private int cost;

//    private ArrayList<String> weaponInfo = new ArrayList<String>();
//    private ArrayList<int[]> weaponDamage = new ArrayList<int[]>();
// Declares a weapons name damage as well as turn delay
    public Weapon(String name, String damage, String turnDelay){
//        weaponInfo.add("ICBM");
//        weaponDamage.add(new int[]{9000, 8});

        this.name = name;
        this.damage = Integer.parseInt(damage);
        this.turn = Integer.parseInt(turnDelay);
//        cost = weaponDamage.get(id)[1];
    }
    // Calls name
    public String getName(){
        return name;
    }
// Gets damage
    public double getDamage(){
        return damage;
    }
//Gets turn for weapons
    public int getTurn(){
        return turn;
    }

//    public int getCost(){
//        return cost;
//    }

    public void takeTurn(){
        turn -= 1;
        if (turn == 0){
            this.execute(target);

        }
    }
    public void setTarget(City city){
        this.target = city;
    }
//    public void setTarget(Defense defense){
//        this.target_defense = defense;
//    }


    public void execute(City city){
        city.hit(damage);
    }

    public void defense(int str){
        if (str == 100){
            turn = -1;
        }
        damage = (1-str/100.0) * damage;

    }

    public double[] getPositions(){
        return new double[]{positionX, positionY};
    }
}

