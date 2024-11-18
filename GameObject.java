class GameObject {
    String Name;
    int PosX, PosY;

    public GameObject(String name, int posX, int posY) {
        this.Name = name;
        this.PosX = posX;
        this.PosY = posY;
    }

    public void Despawn() {
        System.out.println(Name + " has been removed from the game.");
    }
}