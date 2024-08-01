import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TodoListFrame().setVisible(true));
    }
}

class TodoListFrame extends JFrame {
    private DefaultListModel<String> listModel;
    private JList<String> todoList;
    private JTextField inputField;
    private JButton addButton;
    private JButton removeButton;

    public TodoListFrame() {
        setTitle("To-Do List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the list model and the list
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        add(new JScrollPane(todoList), BorderLayout.CENTER);

        // Create a panel for the input field and buttons
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        inputField = new JTextField(20);
        panel.add(inputField);

        addButton = new JButton("Add");
        panel.add(addButton);

        removeButton = new JButton("Remove");
        panel.add(removeButton);

        add(panel, BorderLayout.SOUTH);

        // Set up event handlers
        setupEventHandlers();
    }

    private void setupEventHandlers() {
        // Add button event handler
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        // Remove button event handler
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeTask();
            }
        });
    }

    private void addTask() {
        String task = inputField.getText().trim();
        if (!task.isEmpty()) {
            listModel.addElement(task); // Add the task to the list model
            inputField.setText("");      // Clear the input field
        }
    }

    private void removeTask() {
        int selectedIndex = todoList.getSelectedIndex();
        if (selectedIndex != -1) {
            listModel.remove(selectedIndex); // Remove the selected task
        }
    }
}
