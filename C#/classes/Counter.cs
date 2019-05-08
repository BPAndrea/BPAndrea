class Counter
{
    public int Value { get; set; }
    public int InitialValue { get; set; }
    public Counter()
    {
        this.Value = 0;
        this.InitialValue = 0;
    }
    public Counter(int Value)
    {
        this.Value = Value;
        this.InitialValue = Value;
    }

    public void Add(int number)
    {
        this.Value += number;
    }

    public void Add()
    {
        this.Value++;
    }
    public int Get()
    {
        return this.Value;
    }

    public void Reset()
    {
        this.Value = this.InitialValue;
    }
}