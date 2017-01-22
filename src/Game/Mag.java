package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
public interface Mag {
    public double upgrade();
    public double degrade();
    public int getProperty();
    public void setProperty(int prop);
    public double getLife();
    public void setLife(double lifeLevel);
    public void setMagicValue(double magic);
    public String getOutput();
}
