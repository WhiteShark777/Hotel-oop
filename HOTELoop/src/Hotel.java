import java.util.ArrayList;
import java.util.List;

//encapsulation,inheritance
class Hotel {
    private List<Room> rooms;
    private List<Observer> observers;

    public Hotel() {
        rooms = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void bookRoom(int index) {
        Room room = rooms.get(index);
        room.bookRoom();
        notifyObservers("Room " + index + " has been booked.");
    }

    public void cancelBooking(int index) {
        Room room = rooms.get(index);
        room.cancelBooking();
        notifyObservers("Booking for room " + index + " has been cancelled.");
    }

    public void checkAvailability() {
        String message = "Room availability:\n";
        for (int i = 0; i < rooms.size(); i++) {
            message += "Room " + i + ": " + (rooms.get(i).isBooked() ? "Booked" : "Available") + "\n";
        }
        notifyObservers(message);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
