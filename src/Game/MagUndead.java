package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class MagUndead implements Mag {
    public double upgrade(){
        output = "Undeads mag is degrading opposite strong";
        System.out.println(output);
        return -3;
    }
    public double degrade(){
        tempMagicValue = magicValue;
        output = "Undeads mag is degrading opposite soldier (-" + 5*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 5*tempMagicValue;
    }
    private int magUndeadProperty;
    private double magUndeadLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public MagUndead(){
        magUndeadProperty = (new Random()).nextInt(2);
        if (magUndeadProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.magUndeadProperty;
    }
    public void setProperty(int prop){
        this.magUndeadProperty = prop;
    }
    public double getLife(){
        return this.magUndeadLife;
    }
    public void setLife(double lifeLevel){
        this.magUndeadLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
