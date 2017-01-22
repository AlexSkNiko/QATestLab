package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class MagElf implements Mag {
    public double upgrade(){
        output = "Elvis mag is upgrading their soldier";
        System.out.println(output);
        return -2;
    }
    public double degrade(){
        tempMagicValue = magicValue;
        output = "Elvis mag is degrading opposite soldier (-" + 10*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 10*tempMagicValue;
    }
    private int magElfProperty;
    private double magElfLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public MagElf(){
        magElfProperty = (new Random()).nextInt(2);
        if (magElfProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.magElfProperty;
    }
    public void setProperty(int prop){
        this.magElfProperty = prop;
    }
    public double getLife(){
        return this.magElfLife;
    }
    public void setLife(double lifeLevel){
        this.magElfLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
