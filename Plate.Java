class Plate {
    private int food;

    public Plate(int food) {
        this.food = Math.max(food, 0); // Предотвращаем отрицательное количество еды
    }

    public void info() {
        System.out.println("Тарелка: " + food);
    }

    public boolean decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += Math.max(amount, 0); // Предотвращаем добавление отрицательного количества еды
    }

    public int getFood() {
        return food;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 5), new Cat("Murzik", 8)};
        Plate plate = new Plate(10);

        System.out.println("Информация о тарелке:");
        plate.info();

        // Кормим котов
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("\nИнформация о сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + ": " + (cat.isSatiety() ? "сыт" : "голоден"));
        }

        // Добавляем еду в тарелку
        plate.addFood(5);
        System.out.println("\nДобавили еды в тарелку:");
        plate.info();
    }
}