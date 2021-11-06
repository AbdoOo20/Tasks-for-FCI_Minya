package javaapplication;
public class Ball implements Tossable
{   
    private String brandName;
    public Ball(String name)
    {
        this.brandName = name;
    }
    public String getBrandName()
    {
        return brandName;
    }
    public void bounce(){}
    @Override
    public void toss() 
    {
        System.out.println("Ball");
    }
}
