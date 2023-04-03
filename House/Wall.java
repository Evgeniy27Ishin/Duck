//Стена
public class Wall
{
    public String name;
    private String material;
        
    public Wall(String material)
    {
        this.name = "Стена сделана из " + material;
    }
        
    public void setName(String name)
    {
        this.name = name;
    }
        
    public String toString()
    {
        return this.name;
    }
}