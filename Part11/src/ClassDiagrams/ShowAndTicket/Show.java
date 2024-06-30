package ClassDiagrams.ShowAndTicket;

import java.util.ArrayList;

public class Show {
    private String movie;
    private String time;
    private ArrayList<Ticket> tickets;
}

/*
Show
- movie: String
- time: String
<--------------
              *
Ticket
- seat: int
- code: int
 */
