package LABA4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LOL3 extends JFrame
{
    JTextArea textArea = new JTextArea(15,15);
    JScrollPane Scroll = new JScrollPane(textArea);
    JButton button = new JButton("Add some Text");
    public LOL3()
    { super("Example");
        setSize(350,350);
        setLayout(new FlowLayout());
        add(textArea);
        add(Scroll);
        setVisible(true);
        add(button);
        Scroll.setViewportView(textArea);
        button.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent
                                                ae)

            {

                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                textArea.append(txt);
            }
        });
    }

    public static void main(String[]args)
    {
        new LOL3().setVisible(true);

    }
}
