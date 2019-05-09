abstract class Plant
{
    protected Plant(string color)
    {
        Color = color;
        this.WaterAmount = 0.0d;

    }

    public double WaterAmount { get; set; }
    public double Absorbation { get; set; }
    public string Color { get; set; }

}