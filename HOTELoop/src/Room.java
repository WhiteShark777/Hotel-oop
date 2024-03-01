// Интерфейс Room для полиморфизма
interface Room {
    void bookRoom();

    void cancelBooking();

    boolean isBooked();
}
