public class Main {
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        System.out.println(myCalendar.book(10, 20)); // Output: true
        System.out.println(myCalendar.book(15, 25)); // Output: false
        System.out.println(myCalendar.book(20, 30)); // Output: true
    }
}
