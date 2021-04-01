import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test {

    public static void main(String[] args) {

        JButton redButton = new JButton();
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {   
                System.out.println("red");
            }
        });

        JButton blueButton = new JButton();
        blueButton.addActionListener( e -> System.out.println("blue"));
    }
    
}
