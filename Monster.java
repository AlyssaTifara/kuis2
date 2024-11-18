class Monster extends DamageableObject {
    int ThreatLevel;
    String Color;

    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.ThreatLevel = threatLevel;
        this.Color = color;
    }

    @Override
    public void OnKilled() {
        System.out.println(Name + " (Threat Level: " + ThreatLevel + ") has been slain!");
        Despawn();
    }

    public String MakeNoise() {
        return Name + " growls menacingly!";
    }
}