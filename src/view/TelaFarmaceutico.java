package view;

import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TelaFarmaceutico extends JDialog {
    private JPanel contentPane;
    private JPanel JPanelDados;
    private JPanel JPanelTitulo;
    private JPanel JPanelBotoes;
    private JTextField dataCadastroEntrada;
    private JTextField idEntrada;
    private JTextField nomeEntrada;
    private JTextField telefone1Principal;
    private JTextField telefone2Entrada;
    private JTextField emailEntrada;
    private JTextField cpfCnpjEntrada;
    private JTextField rgInscricaoEstaEntrada;
    private JTextField cepEntrada;
    private JTextField cidadeEntrada;
    private JTextField bairroEntrada;
    private JTextField logradouroEntrada;
    private JTextField complementoEntrada;
    private JTextField crfEntrada;
    private JTextField nomeSocialEntrada;
    private JTextField loginEntrada;
    private JButton adicionarButton;
    private JButton cancelarButton;
    private JButton gravarButton;
    private JButton buscarButton;
    private JButton sairButton;
    private JPasswordField senhaEntrada;
    private JFormattedTextField formattedTextField1;
    private JButton buttonOK;
    private JButton buttonCancel;

    public TelaFarmaceutico() {
        setContentPane(contentPane);
        setModal(true);

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                utilities.Utilities.ativaDesativa(true, JPanelBotoes);
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                utilities.Utilities.ativaDesativa(false, JPanelBotoes);
            }
        });
        gravarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                utilities.Utilities.ativaDesativa(false, JPanelBotoes);
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                utilities.Utilities.ativaDesativa(true, JPanelBotoes);
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        idEntrada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }
    //Esse setDataCadastroEntrada, faz com que na tela de cadastro, seja iniciada com a data atual//
    private void setDataCadastroEntrada(){
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        String currentdate = data.format(new Date());
        dataCadastroEntrada.setText(currentdate);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        TelaFarmaceutico dialog = new TelaFarmaceutico();
        dialog.setSize(300, 400);
        dialog.setDataCadastroEntrada();
        dialog.setTitle("Cadastrar Farmaceutico");
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
