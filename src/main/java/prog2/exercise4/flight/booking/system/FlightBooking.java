package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;

public class FlightBooking {
    

private String flightCompany = "Flights-of-Fancy";
private String flightID;
private String passengerFullName;
private LocalDate departureDate;
private LocalDate returnDate;
private int childPassengers;
private int adultPassengers;
private int totalPassengers;
private double totalTicketPrice ;
private String ticketNumber;
private String ticketNumber1;
private String ticketNumber2;
private String ticketNumber3;
private int date;
public enum BookingClass {
     FIRST, BUSSINESS, ECONOMY
}
public enum TripType {
    ONE_WAY,RETURN
}
public enum TripSource {
    NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS
}
public enum TripDestination {
    NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS
}
public enum SourceAirport {
    NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT,PARIS_CHARLES_DE_GAULLE_AIRPORT
}
public enum DestinationAirport {
    NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT,PARIS_CHARLES_DE_GAULLE_AIRPORT
}
private BookingClass bookingClass;
private TripType tripType;
private TripSource tripSource;
private TripDestination tripDestination;
private SourceAirport sourceAirport;
private DestinationAirport destinationAirport;
private double bookingClassCharge;
private double basePrice = 300;
private double taxes;
private double serviceFees; 
private double departingTicketPrice;
private double returnTicketPrice;


public FlightBooking(String passengerFullName, LocalDate departureDate, LocalDate returnDate, int childPassengers, int adultPassengers) {
    this.passengerFullName = passengerFullName;
    this.departureDate = departureDate;
    this.returnDate = returnDate;
    this.childPassengers = childPassengers;
    this.adultPassengers = adultPassengers;
    this.totalPassengers = childPassengers + adultPassengers;
    
}


public String getFlightCompany() {
    return flightCompany;
}

public String getFlightID() {
    return flightID;
}

public String getPassengerFullName() {
    return passengerFullName;
}

public void setPassengerFullName(String passengerFullName) {
    this.passengerFullName = passengerFullName;
}

public TripSource getTripSource() {
    return tripSource;
}

public SourceAirport getSourceAirport() {
    return sourceAirport;
}

public TripDestination getTripDestination() {
    return tripDestination;
}

public DestinationAirport getDestinationAirport() {
    return destinationAirport;
}

public LocalDate getDepartureDate() {
    return departureDate;
}


public LocalDate getReturnDate() {
    return returnDate;
}

public int getChildPassengers() {
    return childPassengers;
}

public void setChildPassengers(int childPassengers) {
    this.childPassengers = childPassengers;
    
}

public int getAdultPassengers() {
    return adultPassengers;
}

public void setAdultPassengers(int adultPassengers) {
    this.adultPassengers = adultPassengers;
    
}

public int getTotalPassengers() {
    totalPassengers = childPassengers + adultPassengers;
    return totalPassengers;
}



public void setTotalPassengers(int childPassengers,int adultPassengers){
    this.totalPassengers = childPassengers + adultPassengers;
}


public void setFlightID(){
    this.flightID = "FOF0345IN" ;
}
//创建新方法

public void setBookingClass(String numOfBookingClass)
{
    switch(numOfBookingClass)
    {
        case "1" : bookingClass = BookingClass.FIRST;
                this.ticketNumber2 = "F";
                bookingClassCharge = 250;
                 break;
        case "2" : bookingClass = BookingClass.BUSSINESS;
                this.ticketNumber2 = "B";
                bookingClassCharge = 150;
                 break;
        case "3" : bookingClass = BookingClass.ECONOMY;
                this.ticketNumber2 = "E";
                bookingClassCharge = 50;
                 break;
    }
}

public void setTripType(String numOfTripType){
    switch(numOfTripType){
        case "1" :tripType = TripType.ONE_WAY;
                    this.ticketNumber1 = "11";
                break;
        case "2" :tripType = TripType.RETURN;
                    this.ticketNumber1 = "22";
                break;
    }
}
//including setting source airport
public void setTripSource(String numOfTripSource){
    switch(numOfTripSource){
        case "1" :tripSource = TripSource.NANJING;
                sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
        case "2" :tripSource = TripSource.BEIJING;
                sourceAirport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
        case "3" :tripSource = TripSource.OULU;
                sourceAirport = SourceAirport.OULU_AIRPORT;
                break;
        case "4" :tripSource = TripSource.HELSINKI;
                sourceAirport = SourceAirport.HELSINKI_AIRPORT;
                break;
    }
}
//including setting destination airport
public void setTripDestination(String numOfTripSource ,String numOfTripDestination){
    switch(numOfTripDestination){
        case "1" :tripDestination = TripDestination.NANJING;
                destinationAirport = DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                switch(numOfTripSource){
                    case "1" :ticketNumber3 = "DOM";
                              break;
                    case "2" :ticketNumber3 = "DOM";
                            break;
                    case "3" :ticketNumber3 = "INT";
                            break;
                    case "4" :ticketNumber3 = "INT";
                            break;          
                }
                break;
        case "2" :tripDestination = TripDestination.BEIJING;
                destinationAirport = DestinationAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                switch(numOfTripSource){
                    case "1" :ticketNumber3 = "DOM";
                                break;
                    case "2" :ticketNumber3 = "DOM";
                                break;
                    case "3" :ticketNumber3 = "INT";
                                break;
                    case "4" :ticketNumber3 = "INT";
                                break;     
                }
                break;
        case "3" :tripDestination = TripDestination.OULU;
                destinationAirport = DestinationAirport.OULU_AIRPORT;
                switch(numOfTripSource){
                    case "1" :ticketNumber3 = "INT";
                                break;
                    case "2" :ticketNumber3 = "INT";
                                 break;
                    case "3" :ticketNumber3 = "DOM";
                                break;
                    case "4" :ticketNumber3 = "DOM";
                                 break;     
                }
                break;
        case "4" :tripDestination = TripDestination.HELSINKI;
                destinationAirport = DestinationAirport.HELSINKI_AIRPORT;
                switch(numOfTripSource){
                    case "1" :ticketNumber3 = "INT";
                                break;
                    case "2" :ticketNumber3 = "INT";
                                break;  
                    case "3" :ticketNumber3 = "DOM";
                                 break; 
                    case "4" :ticketNumber3 = "DOM";
                                break;         
                }
                break;
    }
}

//比较，设定日期
public void setDepartureDate(LocalDate departureDate) {
   this.departureDate = departureDate ;
}
public void setReturnDate(LocalDate returnDate){
    LocalDate expect = departureDate.plusDays(2);
    if(returnDate.isBefore(expect)){
        this.returnDate = expect;
        date = 0;
    }
    else {this.returnDate = returnDate;
        date = 1;
    }
}

//学一下substring
public void setTicketNumber(){
    this.ticketNumber = ticketNumber1 + ticketNumber2 + "ASDF" + ticketNumber3;
}
public String getTicketNumber(){
    //为什么直接return ticketNumber不行
    return this.ticketNumber = ticketNumber1 + ticketNumber2 + "ASDF" + ticketNumber3;
}

public void setDepartingTicketPrice(int childPassengers,int adultPassengers){
    switch(ticketNumber3){
        case "DOM" : taxes = 0.1 * 300;
                    serviceFees = 0.05 * 300;
                    break;
        case "INT" : taxes = 0.15 * 300; 
                    serviceFees = 0.1 * 300;
                    break;          
    }

    departingTicketPrice = (basePrice + taxes + serviceFees)*(childPassengers + adultPassengers) + bookingClassCharge ;
}

public void setReturnTicketPrice(){
    returnTicketPrice = departingTicketPrice;
}

public void setTotalTicketPrice(){
    totalTicketPrice = returnTicketPrice + departingTicketPrice;
}
public double getTotalTicketPrice(){
     
     return totalTicketPrice;
}
public String toString()
{   
    return
    "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
    flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
    "Ticket Number: " + ticketNumber + "\n" + 
    "From " + tripSource + " to " + tripDestination + "\n" +
    "Date of departure: " + departureDate + "\n" +
    "Date of return: " + returnDate + "\n" +
    "Total passengers: " + totalPassengers + "\n" +
    "Total ticket price in Euros: " + totalTicketPrice;
}
}
