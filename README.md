# Assignment 6 - Pizza Place
## Assignment Self Assessment:
#### Reflection
[//]: <> (share your thoughts on the assignment, things you learnt and would like to remember when you look back at this assignment)


#### Self Assessment
-[ ] The program runs with no errors.
-[ ] Created a GUI application.
-[ ] Logic is sound.
-[ ] Proper usage of Git and GitHub (frequent commits, explanatory commit messages)
-[ ] **6 Extra Credit**: Singleton Pattern and History Keeping
-[ ] **10 Extra Credit**: Kitchen View with the Observer Design Pattern.
-[ ] **2 Extra Credit**: Identify those mistakes

**Your Grade:**  /20

**Notes:**

**How long did it take you to complete this assignment?**

______________________________________________________________________

## Lab Goals:
1. Get practice with using the Java GUI methods.
2. Get practice designing and architecting an Object-Oriented application.

## Discussion:
Create a `JFrame`-based GUI application that allows a person to construct an order for pizza. After selecting the options and elements for the pizza, the user clicks the Order button and the program displays the order and costs in a `JTextArea` within a `JScrollPane`. For simplicity you can assume that the user only enters an order for one pizza (Though you might want to design the classes to allow for more). Some of the technical focus here will be on the details of some of the additional `JComponents` that are commonly used for form-based input: `JCheckBox`, `JRadioButton`, and `JComboBox`. Use the Font Viewer and other example programs from the text for the new `JComponents` that we have not yet used.

### Components:
* Create a JRadioButton set for the type of crust {Thin, Regular, Deep-dish}
* Create a JComboBox for the size: {Small, Medium, Large, Super} The base cost is $8.00, $12.00, $16.00, $20.00.
* Create a set of at least 6 Toppings using JCheckBox You can make totally humorous toppings if you wish. (What would monster pizza have for ingredients?) Each topping costs an additional $1.00.
* Each of these previous items should be in a JPanel and have a Titled border.
* Include an additional JPanel with a JTextArea which will display the order as text similar to a receipt.
* Add a final JPanel with 3 JButtons Order, Clear, and Quit.
    * Quit performs in the usual fashion. However, use a JOptionPane.ConfirmMessegeDialog to ask the user if they are sure they want to quit.
    * The clear button will wipe the form (all components) so it is ready for a new order.
    * When the Order button is pressed the order is compiled from the settings of the various GUI components and displayed as text in the JTextArea. This should be nicely formatted to look like a typical cash register receipt. Note that the tax rate is 7% (.07). :

![Example receipt](https://it2045c.github.io/Labs/Assignments/6.Pizza_Place/assets/receipt.png)

Note that the items in bold on the example should appear on the receipt as well as the divider lines. The other items will be replaced with the actual order. An order must have a Crust and Size choice and at least one ingredient. An order may have every ingredient option. Sub-total is the sum of the choices prior to calculating the tax. Tax is 7% of the order sub-totol. Total is the sum of the sub-total and the tax.
    * Layout: place the button panel at the bottom. Put the JTextArea panel immediately above it. I leave the layout of the rest of the panels to you with the caveat that you must not stack them vertically in one column. Please experiment with the Layout a bit here. Strive for something that is pleasing to the eye and reflects basic UI design for usability.

## Final Result:
You will be submitting a git repository with the following naming
convention, `6-pizza-place-<your-github-username>`, (i.e., `6-pizza-place-Ygilany`). The repository contains:
1. one Java Project with the following files:

2. a modified README.md file that includes your self-assessment

----

## Instructions
Watch the demo videos as they explain how to design and build this.

For **6 Points of Extra Credit**, Look into the *Singleton* design patterns. (You’ll find a ton of resources and examples online). Implement the pattern on the Pizza Store class. And implement a feature to keep track of all the placed orders.

For **10 Points of Extra Credit**, Create another Frame Application for the Kitchen view. The kitchen will need to know what the ingredients of each placed Pizza order. and how long has it been since each order was placed. The Kitchen View should be updated as soon as an order is placed. You should use the *Observer* Design pattern to subscribe the kitchen view to the pizza store class.

As I was reviewing this week's videos, I found a few missing things and few mistakes in the UML representation. For

Thoroughly test your application making sure that everything works correctly. Try for a nice looking layout.


## Grading
1. The program runs with no errors.
2. Created a GUI application.
3. Logic is sound.
4. Proper usage of Git and GitHub (frequent commits, explanatory commit messages)
5. **6 Extra Credit**: Singleton Pattern and History Keeping
6. **10 Extra Credit**: Kitchen View with the Observer Design Pattern.
7. **2 Extra Credit**: Identify those mistakes