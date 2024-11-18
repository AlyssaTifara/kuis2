class Player extends DamageableObject {
    int Score;
    int LivesRemaining;

    public Player(String name, int posX, int posY, int maxHealth, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.LivesRemaining = livesRemaining;
        this.Score = 0;
    }

    @Override
    public void OnKilled() {
        LivesRemaining--;
        System.out.println(Name + " has been killed! Lives remaining: " + LivesRemaining);
        if (LivesRemaining > 0) {
            Health = MaxHealth;
            System.out.println(Name + " has respawned with full health.");
        } else {
            System.out.println(Name + " is out of lives!");
            Despawn();
        }
    }
}