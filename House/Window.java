//����
public class Window
{
    public String name;
    private String material;
        
    public Window(String material)
    {
        this.name = "���� ������� �� " + material;
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