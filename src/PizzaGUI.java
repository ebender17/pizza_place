import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PizzaGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel labelPanel;
    private JPanel receiptPanel;
    private JPanel optionsPanel;
    private JPanel btnPanel;
    private JButton quitButton;
    private JButton clearButton;
    private JButton orderButton;
    private JPanel crustPanel;
    private JPanel sizePanel;
    private JPanel toppingsPanel;
    private JTextField receiptTextField;
    private JLabel pizzaLabel;

    public PizzaGUI(String title) throws HeadlessException {
        super(title);

        add(mainPanel);
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
