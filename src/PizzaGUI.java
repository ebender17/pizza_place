import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PizzaGUI extends JFrame {
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
    private JLabel pizzaLabel;
    private JTextArea receiptTextArea;
    private ArrayList<JCheckBox> ingredientCheckboxes;
    private ArrayList<JRadioButton> crustsRadioButtons;
    private ButtonGroup crustGroup;
    private JComboBox sizeCombo;
    private ArrayList<Crust> availableCrusts;
    private ArrayList<Size> availableSizes;
    private ArrayList<Ingredient> availableIngredients;

    PizzaPlace pizzaPlace = PizzaPlace.getInstance("Pizza Place", "123-123-1234");




    public PizzaGUI(String title, ArrayList<Crust> crusts, ArrayList<Size> sizes, ArrayList<Ingredient> ingredients) throws HeadlessException {
        super(title);
        pizzaLabel.setText(title);
        availableCrusts = crusts;
        availableSizes = sizes;
        availableIngredients = ingredients;

        //create checkboxes using the ingredients
        ingredientCheckboxes = new ArrayList<>();
        for (Ingredient i : ingredients
        ) {
            JCheckBox newObj = new JCheckBox(i.toString());
            newObj.putClientProperty("value", i);
            ingredientCheckboxes.add(newObj);

        }

        //create radio buttons using the crusts
        crustsRadioButtons = new ArrayList<>();
        for (Crust c : crusts
        ) {
            JRadioButton newObj = new JRadioButton(c.toString());
            newObj.putClientProperty("value", c);
            crustsRadioButtons.add(newObj);

        }
        crustGroup = new ButtonGroup();

        //create a combo box using the sizes
        sizeCombo = new JComboBox(sizes.toArray());

        //updateUI
        updateUI();

        add(mainPanel);
        setSize(800, 600);
        setVisible(true);
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

        orderButton.addActionListener((ActionEvent e) -> {
            //Create Order
            Order order = new Order();

            //Get User Selections
            ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
            for (JCheckBox item : ingredientCheckboxes) {
                if (item.isSelected()) {
                    selectedIngredients.add((Ingredient) item.getClientProperty("value"));
                }
            }

            Crust selectedCrust = null;
            for (JRadioButton item : crustsRadioButtons) {
                if (item.isSelected()) {
                    selectedCrust = (Crust) item.getClientProperty("value");
                }
            }


            Size selectedSize = (Size) sizeCombo.getSelectedItem();
            // Create Pizza
            Pizza pizza = new Pizza(selectedCrust, selectedSize, selectedIngredients);

            //Add pizza to the Order
            order.addPizza(pizza);

            //Display the receipt
            String receipt = order.getRecipt();
            receiptTextArea.setText(receipt);

            //add order to the pizzaPlace History
            pizzaPlace.placeOrder(order);


        });

        clearButton.addActionListener((ActionEvent e)-> {
            receiptTextArea.setText("");
            for (JCheckBox item : ingredientCheckboxes) {
                item.setSelected(false);
            }
            for (JRadioButton item : crustsRadioButtons) {
                crustGroup.clearSelection();
            }
        });
    }

    private void updateUI() {
        GridLayout toppingsPanelLayout = new GridLayout(ingredientCheckboxes.size(), 1);
        toppingsPanel.setLayout(toppingsPanelLayout);
        for (JCheckBox item : ingredientCheckboxes) {
            toppingsPanel.add(item);
        }
        GridLayout crustsPanelLayout = new GridLayout(crustsRadioButtons.size(), 1);
        crustPanel.setLayout(crustsPanelLayout);
        for (JRadioButton item : crustsRadioButtons) {
            crustPanel.add(item);
            crustGroup.add(item);
        }

        GridLayout sizesPanelLayout = new GridLayout(1, 1);
        sizePanel.setLayout(sizesPanelLayout);
        sizePanel.add(sizeCombo);
    }


}
