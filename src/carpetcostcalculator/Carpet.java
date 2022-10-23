package carpetcostcalculator;


public class Carpet {
    private double carpetpost;



    public Carpet(double cost){
        if(cost<0){
            this.carpetpost=0.0;
        }else{
            this.carpetpost=cost;
        }

    }
    public double getCost(){
        return this.carpetpost;
    }

}
