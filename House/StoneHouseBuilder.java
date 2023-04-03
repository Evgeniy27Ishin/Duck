public class StoneHouseBuilder extends HouseBuilder
{
    int numWalls = 5;
    int numWindows = 20;
    String windowMaterial = "��������� ������";
    String wallMaterial = "�����, 0.5 ����� ��������";
    String interiorWallMaterial = "������, 0.25 ����� ��������";
    String roofMaterial = "��������";
        
    public StoneHouseBuilder()
    {
        this.builderName = "��������� ��������� ����";
        setHouseType(HouseType.STONE);
    }
        
    public HouseBuilder addWalls()
    {
        for (int i = 0; i < numWalls-1; i++)
        {
            house.addWall(new Wall(wallMaterial));
        }
        house.addWall(new InteriorWall(interiorWallMaterial));

        return this;
    }
     public HouseBuilder addRoof()
    {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }
    public HouseBuilder addWindows()
    {
        for (int i = 0; i < numWindows-1; i++)
        {
            house.addWindow(new Window(windowMaterial));
        }
        return this;
    }
    public House build()
    {
        System.out.println("������� �� ��������");
        return house;
    }
}