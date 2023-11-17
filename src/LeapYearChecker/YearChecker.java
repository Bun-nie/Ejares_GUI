package LeapYearChecker;

import javax.swing.*;

public class YearChecker extends JFrame {

    private JTextField tfYear;
    private JButton btnCheckYear;
    private javax.swing.JPanel JPanel;

    public YearChecker() {
        btnCheckYear.addActionListener(e ->  {
            if(tfYear.getText().equals("") || tfYear.getText().equals("")){
                JOptionPane.showMessageDialog(this, "No input. Please provide a year.");
                return;
            }
            int year;
            try {
                year = Integer.parseInt(tfYear.getText());
            } catch (Exception a){
                JOptionPane.showMessageDialog(this, "Not a valid input!");
                return;
            }
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                JOptionPane.showMessageDialog(this, "Leap year");
            } else {
                JOptionPane.showMessageDialog(this, "Not a leap year");
            }
        });
    }

    public static void main(String[] args) {
        YearChecker app = new YearChecker();
        app.setContentPane(app.JPanel);
        app.setSize(325, 150);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}

