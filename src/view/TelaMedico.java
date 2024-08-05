package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TelaMedico extends JDialog {
    private JPanel contentPane;
    private JButton buttonNovo;
    private JButton buttonCancel;
    private JPanel JPanelBotoes;
    private JButton gravarButton;
    private JButton buscarButton;
    private JButton sairButton;
    private JPanel JPanelTitulo;
    private JPanel JPanelDados;
    private JTextField idEntrada;
    private JTextField nomeEntrada;
    private JTextField telefone1Entrada;
    private JTextField telefone2Entrada;
    private JTextField emailEntrada;
    private JTextField cpfCnpjEntrada;
    private JTextField rgInscricaoEstaEntrada;
    private JTextField dataCadastroEntrada;
    private JTextField cepEntrada;
    private JTextField cidadeEntrada;
    private JTextField bairroEntrada;
    private JTextField logradouroEntrada;
    private JLabel Complemento;
    private JTextField ComplementoEntrada;
    private JTextField crmEntrada;
    private JTextField nomeSocialEntrada;
    private JTextField loginEntrada;
    private JPasswordField SenhaEntrada;


    public TelaMedico() {
        setContentPane(contentPane);
        setModal(true);


        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        buttonNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              utilities.Utilities.ativaDesativa(true, JPanelBotoes);
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
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


    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }



    //Esse setDataCadastroEntrada, faz com que na tela de cadastro, seja iniciada com a data atual//
    private void setDataCadastroEntrada(){
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        String currentdate = data.format(new Date());
        dataCadastroEntrada.setText(currentdate);
    }



    public static void main(String[] args) {
        TelaMedico dialog = new TelaMedico();
        dialog.setSize(300, 400);
        dialog.setTitle("Cadastrar Modelo");
        dialog.setDataCadastroEntrada();
        dialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);

    }


}
