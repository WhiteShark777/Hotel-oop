// encapsulation,inheritance
class StandardRoom implements Room {
    private boolean isBooked;

    @Override
    public void bookRoom() {
        isBooked = true;
    }

    @Override
    public void cancelBooking() {
        isBooked = false;
    }

    @Override
    public boolean isBooked() {
        return isBooked;
    }
}
