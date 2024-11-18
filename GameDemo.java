public class GameDemo {
    public static void main(String[] args) {
        Player player = new Player("Hero", 10, 20, 100, 3);
        Monster monster = new Monster("Goblin", 5, 15, 50, 2, "Green");

        // Display initial status
        System.out.println(player.Name + " encounters " + monster.Name);

        // Monster attacks player
        monster.TakeDamage(20);
        player.TakeDamage(50);

        // Player attacks monster
        monster.TakeDamage(30);
        monster.TakeDamage(50); // This should kill the monster

        // Player takes damage and loses lives
        player.TakeDamage(120); // Should respawn or be removed if out of lives
    }
}
