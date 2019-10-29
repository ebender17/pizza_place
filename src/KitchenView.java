import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.util.ArrayList;

public class KitchenView extends JFrame implements Subscriber {
    private JPanel mainPanel;
    private JPanel orderPanel;
    private JTextArea ordersTextArea;
    private JScrollPane ordersScroll;
    private JPanel quitPanel;
    private JButton quitButton;


    PizzaPlace pizzaPlace = PizzaPlace.getInstance("Kitchen View", "123-123-1234");

    public KitchenView(String title) {
        super(title);

        add(mainPanel);
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        quitButton.addActionListener((ActionEvent e) -> {
            int selectedOption = JOptionPane.showConfirmDialog(
                    null,
                    "Are you sure you want to quit?",
                    "Choose",
                    JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                System.exit(0);

            }
        });
    }

    private void updateOrdersArea() {
        ArrayList<Order> allOrders = pizzaPlace.getOrders();
        ordersTextArea.setText("");
        for (Order order : allOrders) {
            ordersTextArea.append(order.getView() + "\n");

        }


    }

    @Override
    public void update() {
        updateOrdersArea();

    }
}
