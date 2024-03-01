// Класс Receptionist для паттерна "Наблюдатель"
class Receptionist implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Receptionist received message: " + message);
    }
}
