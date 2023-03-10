public class Gotothecinema {
    private Date gocinema;
    public Gotothecinema(Date gocinema){
        this.gocinema=gocinema;
    }
    public Date getgocinema() {
        return gocinema;
    }
    public void setgocinemae(Date gocinema) {
        this.gocinema = gocinema;
    }  
        public boolean Check(Date Other){
        return this.gocinema == Other;    
    }
    //#########VOUCHER#############
    // public double Voucher(Movie ticketPrice){
    //     return this.Voucher(ticketPrice)*(1-15/100);
    // }
}
