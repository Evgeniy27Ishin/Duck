class ConcreteCreator extends Creator
{
    public Product FactoryMethod()
    {
        return new ConcreteProduct();
    }
}