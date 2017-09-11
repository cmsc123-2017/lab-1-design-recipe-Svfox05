class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final double EXCESS_FARE = 0.5;
  final int BASE_FARE = 7;
  final int DISCOUNT_FARE = 6;
  
  public static double excessDistance(double distance) {
  if (distance <= BASE_KM) {
    return 0;
  } else {
    return distance - BASE_KM;
  }
}
  

  public static double computeFare(int passengersPassengers, double fare, double distance) {
  return passengers * (fare + (excessDistance(distance) * EXCESS_FARE)) ;
}
  
  public static double totalFare(int totalPassengers, int discountPassengers, double distance) {
  return computeFare(total - discount, FARE_BASE, distance)
    + computeFare(discount, FARE_DISCOUNT, distance);
}
   public static int assertEquals(int x, int y) {
   if (x == y) {
      return true;
   } else {
      return false;
   }
}
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  
  double fareChange(double payment, int totalPassengers, int discountPassengers, double distance) {
    return payment - totalFare(totalPassengers, discountPassengers, distance);
  }
}

  
