import java.time.LocalDate;

public interface IMovie {
     String getName();
     void setName(String name);
     String getGenre();
     void setGenre(String genre);
     int getMinutes();
     void setMinutes(int minutes);
     int getTickets();
     void setTickets(int tickets);
     void setReleaseDate(LocalDate releaseDate);
     LocalDate getReleaseDate();
     void buyTickets(int Tickets);
}
