package LABA4;
import java.awt.*;
import javax.swing.*;
public class LOL extends JFrame
{

    JTextField jta = new JTextField(10);

    Font fnt = new Font("Times new roman",Font.BOLD,20);
    LOL()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(550,200);
        add(jta);
        jta.setForeground(Color.BLACK);
        jta.setFont(fnt);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new LOL();
    }
}
