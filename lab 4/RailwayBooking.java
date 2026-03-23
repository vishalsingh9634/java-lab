class RailwayBooking {
    private int availableSeats;

    RailwayBooking(int seats) {
        this.availableSeats = seats;
    }

    synchronized void bookTicket(String user, int seatsRequested) {
        System.out.println(user + seatsRequested);

        if (availableSeats >= seatsRequested) {
            System.out.println(user);
            availableSeats -= seatsRequested;
            System.out.println(availableSeats);
        } else {
            System.out.println( user );
        }
    }
}

class UserThread extends Thread {
    RailwayBooking booking;
    String user;
    int seats;

    UserThread(RailwayBooking booking, String user, int seats) {
        this.booking = booking;
        this.user = user;
        this.seats = seats;
    }

    public void run() {
        booking.bookTicket(user, seats);
    }

    public static void main(String[] args) {
        RailwayBooking booking = new RailwayBooking(5);

        UserThread u1 = new UserThread(booking, "User1", 2);
        UserThread u2 = new UserThread(booking, "User2", 3);
        UserThread u3 = new UserThread(booking, "User3", 2);

        u1.start();
        u2.start();
        u3.start();
    }
}