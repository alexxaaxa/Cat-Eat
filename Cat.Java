class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false; // Кот голоден при создании
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            System.out.println(name + " поел.");
            satiety = true;
        } else {
            System.out.println(name + " не может поесть, не хватает еды.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }
}
