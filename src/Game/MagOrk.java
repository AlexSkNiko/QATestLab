package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class MagOrk implements Mag {
    public double upgrade(){
        output = "Orks mag is upgrading their soldier";
        System.out.println(output);
        return -2;
    }
    public double degrade(){
        output = "Orks mag is degrading opposite soldier ";
        System.out.println(output);
        return -1;
    }
    private int magOrkProperty;
    private double magOrkLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public MagOrk(){
        magOrkProperty = (new Random()).nextInt(2);
        if (magOrkProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.magOrkProperty;
    }
    public void setProperty(int prop){
        this.magOrkProperty = prop;
    }
    public double getLife(){
        return this.magOrkLife;
    }
    public void setLife(double lifeLevel){
        this.magOrkLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
