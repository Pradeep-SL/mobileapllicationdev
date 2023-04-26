package MobileAppDev;

import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MobileAppDeveloper {
    private String name;
    private int yearsOfExperience;
    private List<String> skills;

    public MobileAppDeveloper(String name, int yearsOfExperience, List<String> skills) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.skills = skills;
    }

    public void developApp() {
        // Code for developing app using Core Java
        JFrame frame = new JFrame("My App");
        JButton button = new JButton("Click me");
        JLabel label = new JLabel("Hello, world!");
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        }

    public void testApp() {
        // Code for testing app

        JFrame frame = new JFrame("My App");
        JButton button = new JButton("Click me");
        JLabel label = new JLabel("Hello, world!");
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        
        button.doClick();
        if (!label.getText().equals("Button clicked")) {
            throw new AssertionError("Label text should be 'Button clicked'");
    }
    }

    public static void main(String[] args) {
        List<String> requiredSkills = Arrays.asList("Core Java", "Kotlin", "Swings");
        MobileAppDeveloper developer = new MobileAppDeveloper("John Doe", 5, requiredSkills);
       

    }
    
}

