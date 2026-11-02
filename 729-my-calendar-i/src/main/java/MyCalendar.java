import java.util.TreeSet;

class MyCalendar {

    class Booking implements Comparable<Booking> {
        int start;
        int end;

        public Booking(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Booking other) {
            if (this.start != other.start) {
                return this.start - other.start;
            }
            return this.end - other.end;
        }
    }

    private TreeSet<Booking> bookings;

    public MyCalendar() {
        bookings = new TreeSet<>();
    }

    public boolean book(int start, int end) {
        Booking booking = new Booking(start, end);
        Booking floor = bookings.floor(booking);
        Booking ceiling = bookings.ceiling(booking);
        if (floor != null && floor.end > start ) {
            return false;
        }
        if (ceiling != null && ceiling.start < end) {
            return false;
        }
        bookings.add(booking);
        return true;
    }
}
