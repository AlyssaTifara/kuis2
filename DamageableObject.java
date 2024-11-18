abstract class DamageableObject extends GameObject {
    int MaxHealth, Health;

    public DamageableObject(String name, int posX, int posY, int maxHealth) {
        super(name, posX, posY);
        this.MaxHealth = maxHealth;
        this.Health = maxHealth;
    }

    public boolean IsDead() {
        return Health <= 0;
    }

    public void TakeDamage(int damage) {
        Health -= damage;
        System.out.println(Name + " took " + damage + " damage. Remaining health: " + Health);
        if (IsDead()) {
            OnKilled();
        }
    }

    public abstract void OnKilled();
}