//�����
public class Roof
{
	public String name;
	private String material;
	
	public Roof(String material)
	{
        this.material = material;
	    this.name = "����� ������� �� " + material;
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