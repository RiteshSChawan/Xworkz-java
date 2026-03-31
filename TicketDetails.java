public class TicketDetails {  // Encapsulation

    private int ticketId;
    private String eventName;
    private String venue;
    private String date;
    private String seatNumber;
    private String price;
    private String bookedBy;

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    public int getTicketId() {
        return this.ticketId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getEventName() {
        return this.eventName;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getVenue() {
        return this.venue;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return this.date;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String getSeatNumber() {
        return this.seatNumber;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getPrice() {
        return this.price;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }
    public String getBookedBy() {
        return this.bookedBy;
    }

}
