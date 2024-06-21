package mounith;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Converter extends Frame implements ActionListener, ItemListener {
    TextField t;
    TextField t1;
    int r;
    Choice i1;
    Button b1;

    Converter() {
        // Set background color to green
        this.setBackground(Color.GREEN);

        Button b = new Button("Convert");
        add(b);
        b.setBounds(800, 400, 200, 20);
        b1 = new Button("Reset");
        add(b1);
        b1.setBounds(800, 450, 200, 20);
        t = new TextField("");
        add(t);
        t.setBounds(500, 450, 200, 20);
        Choice i = new Choice();
        i.setBounds(500, 400, 200, 50);
        i.add("India");
        add(i);
        t1 = new TextField("Conversion");
        t1.setBounds(1100, 450, 200, 50);
        add(t1);
        i1 = new Choice();
        i1.add("America");
        i1.add("London");
        i1.add("Europe");
        i1.add("Russia");
        i1.add("China");
        add(i1);
        i1.setBounds(1100, 400, 200, 50);
        setSize(1980, 1080);
        setLayout(null);
        setVisible(true);
        setTitle("Money Converter");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                r = Integer.parseInt(t.getText());


                i1.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        // TODO Auto-generated method stub
                        float co;
                        if ("America" == i1.getSelectedItem()) {
                            co = (float) (r / 83.28);

                            t1.setText(String.valueOf(co));

                            t1.setBounds(1100, 450, 200, 50);
                            setVisible(true);
                            setLayout(null);
                        }

                        if ("London" == i1.getSelectedItem()) {
                            co = (float) (r / 105.94);

                            t1.setText(String.valueOf(co));

                            t1.setBounds(1100, 450, 200, 50);
                            setVisible(true);
                            setLayout(null);
                        }

                        if ("Europe" == i1.getSelectedItem()) {
                            co = (float) (r / 90.52);

                            t1.setText(String.valueOf(co));

                            t1.setBounds(1100, 450, 200, 50);
                            setVisible(true);
                            setLayout(null);
                        }

                        if ("Russia" == i1.getSelectedItem()) {
                            co = (float) (r / 0.902);

                            t1.setText(String.valueOf(co));

                            t1.setBounds(1100, 450, 200, 50);
                            setVisible(true);
                            setLayout(null);
                        }

                        if ("China" == i1.getSelectedItem()) {
                            co = (float) (r / 11.51);

                            t1.setText(String.valueOf(co));

                            t1.setBounds(1100, 450, 200, 50);
                            setVisible(true);
                            setLayout(null);
                        }
                        b1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                t.setText(" ");

                            }
                        });
                    }
                });
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub

    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}

public class mounith {

    public static void main(String[] args) {

        Converter c = new Converter();
    }
}

