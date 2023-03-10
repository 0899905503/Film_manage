public class Film{
    public static void main(String Args[]){
        Manufacturer mavel = new Manufacturer("Mavel", "UK");
        Manufacturer dc = new Manufacturer("DC", "UK");
        dc.toString();
        mavel.toString();
        Date theflash = new Date(3, 5, 2023);
        Date batman = new Date(4, 5, 2024);
        Date thor = new Date(5, 5, 2025);
        batman.toString();
        theflash.toString();
        thor.toString();
        Movie Theflash = new Movie("The Flash", 2023,dc,90000,theflash);
        Theflash.DisPlay();
        Movie Batman = new Movie("Batman", 2024, mavel , 85000, batman);
        Batman.DisPlay();
        Movie Thor = new Movie("Thor", 2024, mavel , 86000, thor);
        Thor.DisPlay();
        // compare ticket price
        System.out.println("Ticket Price Batman cheaper than ticket price the flash : "+Batman.CompareTicketPrice(Thor));
        // Check
        Date gocinema = new Date(4, 5, 2024);
        gocinema.toString();
        Gotothecinema a = new Gotothecinema(gocinema);
        System.out.println("will you have a voucher 15% off ! :"+a.Check(batman));    
    }
}