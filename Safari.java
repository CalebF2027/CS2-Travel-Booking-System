public class Safari {
    private static double processingFeePerDay = 45;

    private String travelerName;
    private String destination;
    private int durationInDays;
    private boolean stayInHotels;
    private double tourRating;
    private double totalPackageCost;

   public Safari() {
    travelerName = "Unknown";
    destination = "Kenya";
    durationInDays = 10;
    stayInHotels = true;
    tourRating = 4.95;
    totalPackageCost = 2300.00;
   }

   public Safari(String travelerName, String destination, int durationInDays, boolean stayInHotels) {
    this.travelerName = travelerName;
    this.destination = destination;
    this.durationInDays = durationInDays;
    this.stayInHotels = stayInHotels;

    this.totalPackageCost = this.durationInDays * this.processingFeePerDay;
   }

   public String getTravelerName() {
    return travelerName;
   }
   public String getDestination() {
    return destination;
   }
   public int getDurationInDays() {
    return durationInDays;
   }
   public boolean getStayInHotels() {
    return stayInHotels;
   }
   public double getTourRating() {
    return tourRating;
   }
   public double getTotalPackageCost() {
    return totalPackageCost;
   }
   public void setTravelerName(String travelerName) {
    this.travelerName = travelerName;
    }

    public void setDestination(String destination) {
    this.destination = destination; 
    }

    public void setDurationInDays(int durationInDays) {
    this.durationInDays = durationInDays;
    }
    public void setStayInHotels(boolean stayInHotels) {
        this.stayInHotels = stayInHotels;
    }
    public void setTourRating(double tourRating) {
        this.tourRating = tourRating;
    }
    public void setTotalPackageCost() {
        this.totalPackageCost = durationInDays * processingFeePerDay;
    }
public String toString() {
  String itinerary = "-----------------------------------------\n" +
                     "       African Safari        \n" +
                     "-----------------------------------------\n" +
                     "GUEST NAME:    " + travelerName + "\n" +
                     "DESTINATION:   " + destination + "\n" +
                     "STAY DURATION: " + durationInDays + " Days\n" +
                     "STAY IN HOTELS: " + stayInHotels + " Stay in hotels\n" +
                     "LUXURY RATING: " + tourRating + " / 5.0 ⭐️\n" +
                     "-----------------------------------------\n" +
                     "TOTAL COST:  $" + totalPackageCost + ".00\n" +
                     "-----------------------------------------\n" +
                     "  Thank you for booking with Wanderlust! \n";
  return itinerary;  
}
    
}