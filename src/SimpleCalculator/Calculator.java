package SimpleCalculator;

import javax.swing.*;

public class Calculator extends JFrame{
    private JTextField textField1;
    private JButton computeResultButton;
    private JComboBox cb;
    private JTextField textField2;
    private javax.swing.JPanel JPanel;
    private JTextField result;

    public Calculator() {
        computeResultButton.addActionListener(e ->  {
            if(textField1.getText().equals("") || textField2.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Make sure all fields are filled");
                return;
            }
            double num1, num2;
            try {
                num1 = Double.parseDouble(textField1.getText());
                num2 = Double.parseDouble(textField2.getText());
            } catch (Exception a){
                JOptionPane.showMessageDialog(this, "Input must be numerical value");
                return;
            }

            if(cb.getSelectedIndex() == 0){
                int opt = JOptionPane.showConfirmDialog(this, "No operation! Would you like to set it to Addition?");
                if(opt == 0){
                    cb.setSelectedIndex(1);
                } else if (opt == 1){
                    JOptionPane.showMessageDialog(this, "Then choose! Duhhh");
                    return;
                } else {
                    return;
                }
            }

            if(cb.getSelectedIndex() == 1) {
                double sum = num1 + num2;
                result.setText(String.valueOf(sum));
            }if(cb.getSelectedIndex() == 2) {
                double difference = num1 - num2;
                result.setText(String.valueOf(difference));
            }if(cb.getSelectedIndex() == 3) {
                double product = num1 * num2;
                result.setText(String.valueOf(product));
            }if(cb.getSelectedIndex() == 4) {
                if(num2 == 0){
                    JOptionPane.showMessageDialog(this, "Divisor should be nonzero");
                    return;
                }
                double quotient = num1 / num2;
                result.setText(String.valueOf(quotient));
            }
        });
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setContentPane(calculator.JPanel);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculator.setSize(500, 325);
        calculator.setTitle("Simple Calculator");
        calculator.setVisible(true);
    }
}
