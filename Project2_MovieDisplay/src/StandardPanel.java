import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StandardPanel extends JFrame {

    /**
     * Standard for a panel of String output
     *
     * @param name, String title of Panel
     * @param ticketDetails, String contents of Panel
     */
    public StandardPanel(String name, String ticketDetails) {
        // Set Default panel
        setTitle(name);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 200);
        setLocationRelativeTo(null);

        // Creates JPanel
        JPanel panel = new JPanel(new GridLayout(1, 1));
        panel.setPreferredSize(new Dimension(500, 300));

        // Creates TextArea for the Panel
        JTextArea textArea = new JTextArea(ticketDetails);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        panel.add(scrollPane);

        // Button to close Panel
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        add(panel, BorderLayout.CENTER);
        add(closeButton, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    } // object StandardPanel

} // class StandardPanel