package Game;

/**
 * Created by Alex on 18.01.2017.
 */
public interface Fighter {
    public double fight();
    public int getProperty();
    public void setProperty(int prop);
    public double getLife();
    public void setLife(double lifeLevel);
    public void setMagicValue(double magic);
    public String getOutput();
}
