import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class MoviePanel extends JFrame {

    /** Main movie panel */
    private JPanel moviePanel;

    /** Labels for movie, title, price, and number of tickets*/
    private JLabel movieLabel, titleLabel, priceLabel, numTicketsLabel;

    /** Checkboxes for ticket type */
    private JCheckBox regularCheckBox, studentCheckBox;

    /** Buttons for submit, details, and closing panel*/
    private JButton submitButton, detailsButton, closeButton;

    /** TextField to gain Ticket input from user */
    private JTextField numTicketsField;

    /** ComboBox to choose Movies */
    public JComboBox<String> movieComboBox;

    /** Standard ticket prices */
    private int regularPrice = 8, studentPrice = 6;

    /** Total price of tickets selected */
    private int totalPrice = 0;

    /** Selection of Movies in the theatre */
    Movie movie0 = new Movie("Shrek the Third","Family", 93, 0, LocalDate.of(2007,5,18));
    Movie movie1 = new Movie("Pirates of the Caribbean: At World's End", "Action/Adventure", 168,0,LocalDate.of(2007,5,24));
    Movie movie2 = new Movie("Spider-Man 3", "Action/Adventure", 140,0,LocalDate.of(2007,5,4));

    /** Movie panel with features to select a movie, buy tickets, and show movie details */
    public MoviePanel() {
        setTitle("Movie Theatre Selection");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create movie panel
        moviePanel = new JPanel();
        moviePanel.setPreferredSize(new Dimension(500, 300));
        moviePanel.setLayout(new FlowLayout());

        movieLabel = new JLabel("Select the Movie:");

        // Array of movie names for Combobox
        String[] movies = {movie0.getName(), movie1.getName(), movie2.getName()};
        movieComboBox = new JComboBox<>(movies);

        // Ticket type checkbox
        titleLabel = new JLabel("Select your Ticket Type:");

        regularCheckBox = new JCheckBox("Regular ($" + regularPrice + ")");
        studentCheckBox = new JCheckBox("Discounted Student Price ($" + studentPrice + ")");

        // Retrieving number of tickets to buy
        numTicketsLabel = new JLabel("Number of Tickets:");
        numTicketsField = new JTextField(5);

        priceLabel = new JLabel("Total Price: $0");

        // calls method to buy a ticket
        buyTickets();

        // calls method to show movie details
        movieDetails();

        // closes panel
        closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Adding all components to panel
        moviePanel.add(movieLabel);
        moviePanel.add(movieComboBox);
        moviePanel.add(titleLabel);
        moviePanel.add(regularCheckBox);
        moviePanel.add(studentCheckBox);
        moviePanel.add(numTicketsLabel);
        moviePanel.add(numTicketsField);
        moviePanel.add(priceLabel);
        moviePanel.add(submitButton);
        moviePanel.add(detailsButton);

        add(closeButton, BorderLayout.SOUTH);
        add(moviePanel);

        pack();
        setVisible(true);
    } // constructor MoviePanel

    /**
     *  Shows movie details given a button
     */
    public void movieDetails() {
        // Create movie details button
        detailsButton = new JButton("View Movie Details");
        detailsButton.addActionListener(new ActionListener() {
            // Set action for button
            public void actionPerformed(ActionEvent e) {
                // Receive chosen dropdown movie title
                String movieName = (String) movieComboBox.getSelectedItem();
                String message = "";

                // Comparing selected movie to movie objects
                if(movieName.equals(movie0.getName())) {
                    message += movie0.toString();
                    addIcon(0);

                } else if(movieName.equals(movie1.getName())) {
                    message += movie1.toString();
                    addIcon(1);
                } else {
                    message += movie2.toString();
                    addIcon(2);
                }

                // Creates new panel with results of Movie details
                StandardPanel ticketOrderPanel = new StandardPanel("Movie Details", message);
            }
        });

    } // method movieDetails

    /**
     * Displays tickets chosen by user & total price
     *
     * @return string of ticket purchases
     */
    public String purchaseDetails() {
        return String.format("""
                        For %s: %d tickets
                        For %s: %d tickets
                        For %s: %d tickets
                        Total Price: $%d""",
                movie0.getName(), movie0.getTickets(),
                movie1.getName(), movie1.getTickets(),
                movie2.getName(), movie2.getTickets(), totalPrice);
    } // method purchaseDetails

    /**
     * Calculates price of purchase
     *
     * @param numTickets, tickets selected by user
     * @param price, price of selected ticket type
     * @return price of all tickets
     */
    public int totalPrice(int numTickets, int price) {
        return numTickets * price;
    } // method price

    /**
     * Buys a tickets with a button press
     * Updates total price and ticket amounts selected by user
     */
    public void buyTickets() {
        // create submit button, starts buying ticket process
        submitButton = new JButton("Buy Tickets");
        submitButton.addActionListener(new ActionListener() {
            // set action for button
            public void actionPerformed(ActionEvent e) {
                // get number of tickets
                int numTickets = Integer.parseInt(numTicketsField.getText());

                // determine the price via ticket type
                if (regularCheckBox.isSelected()) {
                    totalPrice += totalPrice(numTickets, regularPrice);
                }

                if (studentCheckBox.isSelected()) {
                    totalPrice += totalPrice(numTickets, studentPrice);
                }

                // get movieName selected to compare to objects
                String movieName = (String) movieComboBox.getSelectedItem();

                // Updates tickets bought only if a checkbox is selected beforehand
                if(regularCheckBox.isSelected() || studentCheckBox.isSelected()) {
                    // set ticket count for each movie
                    if (movieName.equals(movie0.getName())) {
                        movie0.setTickets(numTickets);
                    } else if (movieName.equals(movie1.getName())) {
                        movie1.setTickets(numTickets);
                    } else {
                        movie2.setTickets(numTickets);
                    }
                }

                // Display of total price
                priceLabel.setText("Total Price: $" + totalPrice);

                StandardPanel movieDetails = new StandardPanel("Ticket Details", purchaseDetails());

            }
        });
    } // method selectTickers

    /**
     * Retrieve photos from file and add to Panel
     * @param i, number assigned to photo
     */
    public void addIcon(int i) {
        // Load the image
        ImageIcon image = new ImageIcon("movie" + i + ".png");

        // Create a label to hold the image
        JLabel imageLabel = new JLabel(image);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);

        // Add the image label to the panel
        moviePanel.add(imageLabel, BorderLayout.PAGE_END);

        // Add the panel to the frame
        add(moviePanel);
    } // method addIcon

} // class MoviePanel