 public class Movie{
        private String movieName;
        private int year;
        private Manufacturer manufacturerName;
        private int ticketPrice;
        private Date date;
        public Movie(String movieName ,int year,Manufacturer manufacturerName,int ticketPrice,Date date){
         this.movieName= movieName;    
         this.year=year;
         this.manufacturerName =manufacturerName;
         this.ticketPrice =ticketPrice;
         this.date =date;     
        }
        public String getMovieName() {
            return movieName;
        }
        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }
        public Manufacturer getmanufacturerName() {
            return manufacturerName;
        }
        public void setManufacturer(Manufacturer manufacturerName) {
            this.manufacturerName = manufacturerName;
        }
        public Date getDate() {
            return date;
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public int getTicketPrice() {
            return ticketPrice;
        }
        public void setTicketPrice(int ticketPrice) {
            this.ticketPrice = ticketPrice;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public void DisPlay(){
            System.out.println("Movie Name : "+movieName+" // Year : "+year+" // Manufacturer Name : "+manufacturerName+" // Ticket Price : "+ticketPrice+" // Date : "+date);
         }
         //#############COMPARE TICKET PRICE #############
         public boolean CompareTicketPrice(Movie Other){
          return this.ticketPrice < Other.ticketPrice;
         }
    }
