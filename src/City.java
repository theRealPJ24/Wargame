public class City {
    private String name;
    private int civ;
    private int max;
    private boolean status = true;
    private double positionX;
    private double positionY;
    //Checks name of city and civilian count
    public City(String name, int civ, double x, double y){
        this.name = name;
        this.civ = civ;
        max = civ;
        positionX = x;
        positionY = y;
    }
    // Checks how much health is taken from a hit
    public void hit(double damage){
        civ -= damage/100 * max;
        checkStatus();
    }
    public int getCiv(){
        return civ;
    }

    // Checks to see if city is alive
    public void checkStatus(){
        if (civ <= 0){
            status = false;
        }
    }
    public boolean getStatus(){
        return status;
    }

    public double[] getPositions(){
        return new double[]{positionX, positionY};
    }

    public void show(int j){
        StdDraw.text(positionX, positionY, j+" " + name);
    }

}
