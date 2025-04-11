import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.time.Year;
import java.text.ParseException;
import java.text.SimpleDateFormat;
=======
>>>>>>> 494c546c82f8cb8ef8657b0b38674f8afaadeeb3

public class InterfataCerereCo extends JFrame {

    JTextField tfNume, tfMatricol, tfFunctie, tfDepartament, tfDataInceput, tfDataSfarsit,
            tfInlocuitor, tfFunctieInlocuitor, tfAnCurent, tfTotalCurent, tfEfectuateCurent,
            tfAnAnterior, tfTotalAnterior, tfEfectuateAnterior,
            tfAnPostanterior, tfTotalPostanterior, tfEfectuatePostanterior;

    JButton btnGenereaza;
    JButton btnReset;

    public InterfataCerereCo() {
        setTitle("Cerere Concediu Odihna");
        setSize(825, 650);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Secțiunea "Date Concediu"
        JPanel panelDateConcediu = new JPanel();
        panelDateConcediu.setLayout(null);
        panelDateConcediu.setBounds(20, 20, 780, 160);
        panelDateConcediu.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                "Date Concediu",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14)
        ));
        add(panelDateConcediu);

        JLabel lblNume = new JLabel("Nume si Prenume:");
        lblNume.setBounds(20, 30, 160, 25);
        panelDateConcediu.add(lblNume);
        tfNume = new JTextField();
        tfNume.setBounds(180, 30, 200, 25);
        panelDateConcediu.add(tfNume);

        JLabel lblMatricol = new JLabel("Numar Matricol:");
        lblMatricol.setBounds(400, 30, 160, 25);
        panelDateConcediu.add(lblMatricol);
        tfMatricol = new JTextField();
        tfMatricol.setBounds(560, 30, 200, 25);
        panelDateConcediu.add(tfMatricol);

        JLabel lblFunctie = new JLabel("Functie:");
        lblFunctie.setBounds(20, 70, 160, 25);
        panelDateConcediu.add(lblFunctie);
        tfFunctie = new JTextField();
        tfFunctie.setBounds(180, 70, 200, 25);
        panelDateConcediu.add(tfFunctie);

        JLabel lblDepartament = new JLabel("Departament:");
        lblDepartament.setBounds(400, 70, 160, 25);
        panelDateConcediu.add(lblDepartament);
        tfDepartament = new JTextField();
        tfDepartament.setBounds(560, 70, 200, 25);
        panelDateConcediu.add(tfDepartament);

        JLabel lblDataInceput = new JLabel("Data Inceput (dd.MM.yyyy):");
        lblDataInceput.setBounds(20, 110, 160, 25);
        panelDateConcediu.add(lblDataInceput);
        tfDataInceput = new JTextField();
        tfDataInceput.setBounds(180, 110, 200, 25);
        panelDateConcediu.add(tfDataInceput);

        JLabel lblDataSfarsit = new JLabel("Data Sfarsit (dd.MM.yyyy):");
        lblDataSfarsit.setBounds(400, 110, 160, 25);
        panelDateConcediu.add(lblDataSfarsit);
        tfDataSfarsit = new JTextField();
        tfDataSfarsit.setBounds(560, 110, 200, 25);
        panelDateConcediu.add(tfDataSfarsit);

        // Secțiunea "Date Înlocuitor"
        JPanel panelDateInlocuitor = new JPanel();
        panelDateInlocuitor.setLayout(null);
        panelDateInlocuitor.setBounds(20, 190, 780, 80);
        panelDateInlocuitor.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                "Date Înlocuitor",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14)
        ));
        add(panelDateInlocuitor);

        JLabel lblInlocuitor = new JLabel("Nume Inlocuitor:");
        lblInlocuitor.setBounds(20, 30, 160, 25);
        panelDateInlocuitor.add(lblInlocuitor);
        tfInlocuitor = new JTextField();
        tfInlocuitor.setBounds(180, 30, 200, 25);
        panelDateInlocuitor.add(tfInlocuitor);

        JLabel lblFunctieInlocuitor = new JLabel("Functie Inlocuitor:");
        lblFunctieInlocuitor.setBounds(400, 30, 160, 25);
        panelDateInlocuitor.add(lblFunctieInlocuitor);
        tfFunctieInlocuitor = new JTextField();
        tfFunctieInlocuitor.setBounds(560, 30, 200, 25);
        panelDateInlocuitor.add(tfFunctieInlocuitor);

        // Secțiunea "Contor Concediu"
        JPanel panelContorConcediu = new JPanel();
        panelContorConcediu.setLayout(null);
        panelContorConcediu.setBounds(20, 280, 780, 270);
        panelContorConcediu.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                "Contor Concediu",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14)
        ));
        add(panelContorConcediu);

        JLabel lblAnCurent = new JLabel("An Curent:");
        lblAnCurent.setBounds(20, 30, 160, 25);
        lblAnCurent.setForeground(Color.getHSBColor(0.33f, 0.74f, 0.73f));
        panelContorConcediu.add(lblAnCurent);
        tfAnCurent = new JTextField();
        tfAnCurent.setBounds(180, 30, 200, 25);
        panelContorConcediu.add(tfAnCurent);

        JLabel lblTotalCurent = new JLabel("Total Zile:");
        lblTotalCurent.setBounds(400, 30, 160, 25);
        lblTotalCurent.setForeground(Color.getHSBColor(0.33f, 0.74f, 0.73f));
        panelContorConcediu.add(lblTotalCurent);
        tfTotalCurent = new JTextField();
        tfTotalCurent.setBounds(560, 30, 200, 25);
        panelContorConcediu.add(tfTotalCurent);

        JLabel lblEfectuateCurent = new JLabel("Zile Efectuate:");
        lblEfectuateCurent.setBounds(20, 70, 160, 25);
        lblEfectuateCurent.setForeground(Color.getHSBColor(0.33f, 0.74f, 0.73f));
        panelContorConcediu.add(lblEfectuateCurent);
        tfEfectuateCurent = new JTextField();
        tfEfectuateCurent.setBounds(180, 70, 200, 25);
        panelContorConcediu.add(tfEfectuateCurent);

        JLabel lblAnAnterior = new JLabel("An Anterior:");
        lblAnAnterior.setBounds(20, 110, 160, 25);
        lblAnAnterior.setForeground(Color.BLUE);
        panelContorConcediu.add(lblAnAnterior);
        tfAnAnterior = new JTextField();
        tfAnAnterior.setBounds(180, 110, 200, 25);
        panelContorConcediu.add(tfAnAnterior);

        JLabel lblTotalAnterior = new JLabel("Total Zile:");
        lblTotalAnterior.setBounds(400, 110, 160, 25);
        lblTotalAnterior.setForeground(Color.BLUE);
        panelContorConcediu.add(lblTotalAnterior);
        tfTotalAnterior = new JTextField();
        tfTotalAnterior.setBounds(560, 110, 200, 25);
        panelContorConcediu.add(tfTotalAnterior);

        JLabel lblEfectuateAnterior = new JLabel("Zile Efectuate:");
        lblEfectuateAnterior.setBounds(20, 150, 160, 25);
        lblEfectuateAnterior.setForeground(Color.BLUE);
        panelContorConcediu.add(lblEfectuateAnterior);
        tfEfectuateAnterior = new JTextField();
        tfEfectuateAnterior.setBounds(180, 150, 200, 25);
        panelContorConcediu.add(tfEfectuateAnterior);

        JLabel lblAnPostanterior = new JLabel("An Postanterior:");
        lblAnPostanterior.setBounds(20, 190, 160, 25);
        lblAnPostanterior.setForeground(Color.RED);
        panelContorConcediu.add(lblAnPostanterior);
        tfAnPostanterior = new JTextField();
        tfAnPostanterior.setBounds(180, 190, 200, 25);
        panelContorConcediu.add(tfAnPostanterior);

        JLabel lblTotalPostanterior = new JLabel("Total Zile:");
        lblTotalPostanterior.setBounds(400, 190, 160, 25);
        lblTotalPostanterior.setForeground(Color.RED);
        panelContorConcediu.add(lblTotalPostanterior);
        tfTotalPostanterior = new JTextField();
        tfTotalPostanterior.setBounds(560, 190, 200, 25);
        panelContorConcediu.add(tfTotalPostanterior);

        JLabel lblEfectuatePostanterior = new JLabel("Zile Efectuate:");
        lblEfectuatePostanterior.setBounds(20, 230, 160, 25);
        lblEfectuatePostanterior.setForeground(Color.RED);
        panelContorConcediu.add(lblEfectuatePostanterior);
        tfEfectuatePostanterior = new JTextField();
        tfEfectuatePostanterior.setBounds(180, 230, 200, 25);
        panelContorConcediu.add(tfEfectuatePostanterior);

        // Butoane
        btnGenereaza = new JButton("Genereaza Cerere");
        btnGenereaza.setBounds(480, 550, 160, 35);
        getRootPane().setDefaultButton(btnGenereaza);
        add(btnGenereaza);

        btnReset = new JButton("Reset");
        btnReset.setBounds(640, 550, 160, 35);
        add(btnReset);

        // Adăugare funcționalitate butoane
        btnGenereaza.addActionListener(e -> genereazaCerere());
        btnReset.addActionListener(e -> resetFields());

<<<<<<< HEAD
        int currentYear = Year.now().getValue();
        JLabel lblCopyright = new JLabel("©" +currentYear+" Toate drepturile rezervate de Spitalul Orășenesc Balș.");
        lblCopyright.setBounds(10, 580, 300, 20);
        lblCopyright.setFont(new Font("Arial", Font.PLAIN, 10));
=======
        JLabel lblCopyright = new JLabel("©2025 Toate drepturile rezervate de Spitalul Bals.");
        lblCopyright.setBounds(10, 580, 300, 20);
        lblCopyright.setFont(new Font("Arial", Font.PLAIN, 12));
>>>>>>> 494c546c82f8cb8ef8657b0b38674f8afaadeeb3
        add(lblCopyright);

        //lblCopyright.setToolTipText("Email: pavelmarius28@yahoo.com");

        setVisible(true);
    }
<<<<<<< HEAD
    /*Validare DataInceput Concediu*/
    private boolean validareDataInceput(){
        String dateInceput = tfDataInceput.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try{
            dateFormat.parse(dateInceput);
            return true;
        }catch(ParseException e){
            JOptionPane.showMessageDialog(this, "Format invalid! Introduceți data în formatul dd.mm.yyyy pentru campul 'Data Inceput'.", "Eroare", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean validareDataSfarsit(){
        String dateInceput = tfDataSfarsit.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try{
            dateFormat.parse(dateInceput);
            return true;
        }catch(ParseException e){
            JOptionPane.showMessageDialog(this, "Format invalid! Introduceți data în formatul dd.mm.yyyy pentru campul 'Data Sfarsit'.", "Eroare", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void genereazaCerere() {
        try {
            //Verifica data
            if(!validareDataInceput()){
                return;
            }
            if(!validareDataSfarsit()){
                return;
            }
=======

    private void genereazaCerere() {
        try {
>>>>>>> 494c546c82f8cb8ef8657b0b38674f8afaadeeb3
            // Obține datele din câmpurile de text
            String nume = tfNume.getText();
            String matricol = tfMatricol.getText();
            String functie = tfFunctie.getText();
            String departament = tfDepartament.getText();
            String dataInceput = tfDataInceput.getText();
            String dataSfarsit = tfDataSfarsit.getText();
            String inlocuitor = tfInlocuitor.getText();
            String functieInlocuitor = tfFunctieInlocuitor.getText();

            String anCurent = tfAnCurent.getText();
            int totalCurent = Integer.parseInt(tfTotalCurent.getText());
            int efectuateCurent = Integer.parseInt(tfEfectuateCurent.getText());

            String anAnterior = tfAnAnterior.getText();
            int totalAnterior = Integer.parseInt(tfTotalAnterior.getText());
            int efectuateAnterior = Integer.parseInt(tfEfectuateAnterior.getText());

            String anPostanterior = tfAnPostanterior.getText();
            int totalPostanterior = Integer.parseInt(tfTotalPostanterior.getText());
            int efectuatePostanterior = Integer.parseInt(tfEfectuatePostanterior.getText());

            // Creează o instanță a clasei logice și apelează metoda principală
            MainFunction mainFunction = new MainFunction();
            mainFunction.genereazaCerere(
                    nume, matricol, functie, departament, dataInceput, dataSfarsit,
                    inlocuitor, functieInlocuitor,
                    anCurent, totalCurent, efectuateCurent,
                    anAnterior, totalAnterior, efectuateAnterior,
                    anPostanterior, totalPostanterior, efectuatePostanterior
            );

            JOptionPane.showMessageDialog(this, "Cererea a fost generată cu succes!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Eroare la generarea cererii, completati toate campurile!","Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void resetFields() {
        tfNume.setText("");
        tfMatricol.setText("");
        tfFunctie.setText("");
        tfDepartament.setText("");
        tfDataInceput.setText("");
        tfDataSfarsit.setText("");
        tfInlocuitor.setText("");
        tfFunctieInlocuitor.setText("");
        tfAnCurent.setText("");
        tfTotalCurent.setText("");
        tfEfectuateCurent.setText("");
        tfAnAnterior.setText("");
        tfTotalAnterior.setText("");
        tfEfectuateAnterior.setText("");
        tfAnPostanterior.setText("");
        tfTotalPostanterior.setText("");
        tfEfectuatePostanterior.setText("");
    }

    public static void main(String[] args) {
        new InterfataCerereCo();
    }
}