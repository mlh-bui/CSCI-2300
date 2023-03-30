import java.time.LocalDate;

public class Movie implements IMovie {
    /** Movie name */
    private String name;

    /** Movie genre */
    private String genre;

    /** Movie minutes as an Integer */
    private int minutes;

    /** Count of Movie Tickets */
    private int tickets;

    /** Movie release date*/
    private LocalDate releaseDate;

    /** Standard Constructor */
    public Movie(String n, String g, int m, int t, LocalDate r) {
        this.name = n;
        this.genre = g;
        this.minutes = m;
        this.tickets = t;
        this.releaseDate = r;
    }

    /** Setters & Getters for Movie */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Method to add tickets to the counter (instance variables)
     *
     * @param tickets, as an int
     */
    public void buyTickets(int tickets) {
        this.tickets += tickets;
    }


    /**
     * Standard representation of a Movie's components
     *
     * @return String, Movie's instance variables
     */
    public String toString() {
        return String.format("Movie name: %s\n" +
                "Release Date: %tB %<te, %<tY\n" +
                "Running Time: %d minutes\n" +
                "Genre: %s", getName(), getReleaseDate(), getMinutes(), getGenre());
    }

} // class Movie
