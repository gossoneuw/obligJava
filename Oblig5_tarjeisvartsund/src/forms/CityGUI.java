package forms;

import models.Hus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CityGUI extends JFrame{
    private JPanel mainpanel;
    private JPanel SwapPagePanel;

    private JPanel pageHus;
    private JPanel pageButikk;
    private JPanel pageSkole;
    private JPanel pagePark;

    private JButton navigateToSkole;
    private JButton navigateToButikk;
    private JButton navigateToPark;
    private JButton navigateToHus;

    private JTextField tomtLfield;
    private JTextField tomtBfield;
    private JTextField adressefield;
    private JTextField husLfield;
    private JTextField husBfield;
    private JTextField etasjerfield;
    private JTextField materialefield;
    private JTextField beboerefield;
    private JButton createHusButton;
    private JTextField husHfield;
    private JPanel createdBuildingPanel;
    private JButton backToHus;
    private JList<Hus> createdList;
    private JButton deleteCreatedBuilding;
    private JButton navigateToCreated;

    private DefaultListModel<Hus> createdListModel = new DefaultListModel<>();

    public CityGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();

        createdList.setModel(createdListModel);




        navigateToButikk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwapPagePanel.removeAll();
                SwapPagePanel.add(pageButikk);
                SwapPagePanel.repaint();
                SwapPagePanel.revalidate();
            }
        });
        navigateToSkole.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwapPagePanel.removeAll();
                SwapPagePanel.add(pageSkole);
                SwapPagePanel.repaint();
                SwapPagePanel.revalidate();
            }
        });
        navigateToPark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwapPagePanel.removeAll();
                SwapPagePanel.add(pagePark);
                SwapPagePanel.repaint();
                SwapPagePanel.revalidate();
            }
        });
        navigateToHus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwapPagePanel.removeAll();
                SwapPagePanel.add(pageHus);
                SwapPagePanel.repaint();
                SwapPagePanel.revalidate();
            }
        });

        backToHus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwapPagePanel.removeAll();
                SwapPagePanel.add(pageHus);
                SwapPagePanel.repaint();
                SwapPagePanel.revalidate();
            }
        });

        navigateToCreated.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwapPagePanel.removeAll();
                SwapPagePanel.add(createdBuildingPanel);
                SwapPagePanel.repaint();
                SwapPagePanel.revalidate();
            }
        });

        deleteCreatedBuilding.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int selectedIndex = createdList.getSelectedIndex();
                    createdListModel.remove(selectedIndex);
                    createdList.updateUI();
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    System.out.println("Selected index does not exist.");
                }
            }
        });

        createHusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double tomtL = Double.parseDouble(tomtLfield.getText());
                    double tomtB = Double.parseDouble(tomtBfield.getText());
                    String adresse = adressefield.getText();
                    double husL = Double.parseDouble(husLfield.getText());
                    double husB = Double.parseDouble(husBfield.getText());
                    double husH = Double.parseDouble(husHfield.getText());
                    int etasjer = Integer.parseInt(etasjerfield.getText());
                    String materiale = materialefield.getText();
                    int beboere = Integer.parseInt(beboerefield.getText());

                    Hus hus = new Hus(tomtL,tomtB,adresse,husL,husB,husH,etasjer,materiale,beboere);

                    createdListModel.addElement(hus);


                } catch (NumberFormatException numberFormatException) {
                    System.out.println("du har gitt feil datatype i en av feltene.");
                }
            }
        });
    }
}
