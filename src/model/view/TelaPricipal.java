package model.view;

import model.bean.MudaCores;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class TelaPricipal extends JFrame {
    private JButton btnGrid;
    private JButton btnVermelho;
    private JButton btnVerde;
    private JButton btnAzul;

    private JButton btnCinza;
    private JButton btnPretoBranco;

    ///Imagens
    private JLabel lblImagemOriginal;
    private JLabel lblImagemAlterada;


    public TelaPricipal() {
        this.setSize(820, 480);
        setResizable(false);
        setTitle("Alterador de Imagens");
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        criaComponentes();
    }

    public void criaComponentes() {
        btnGrid = new JButton("Efeito Grid");
        btnGrid.setBounds(20, 10, 120, 35);
        btnGrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                    lblImagemAlterada.setIcon(new ImageIcon(MudaCores.gride(ImageIO.read(new File("src\\model\\media\\cachorro.jpg")))));
                    lblImagemAlterada.updateUI();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
        getContentPane().add(btnGrid);

        btnVermelho = new JButton("Vermelho");
        btnVermelho.setBounds(150, 10, 120, 35);
        btnVermelho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                    lblImagemAlterada.setIcon(new ImageIcon(MudaCores.vermelho(ImageIO.read(new File("src\\model\\media\\cachorro.jpg")))));
                    lblImagemAlterada.updateUI();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
        getContentPane().add(btnVermelho);

        btnVerde = new JButton("Verde");
        btnVerde.setBounds(280, 10, 120, 35);
        btnVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                    lblImagemAlterada.setIcon(new ImageIcon(MudaCores.verde(ImageIO.read(new File("src\\model\\media\\cachorro.jpg")))));
                    lblImagemAlterada.updateUI();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
        getContentPane().add(btnVerde);

        btnAzul = new JButton("Azul");
        btnAzul.setBounds(410, 10, 120, 35);
        btnAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                    lblImagemAlterada.setIcon(new ImageIcon(MudaCores.azul(ImageIO.read(new File("src\\model\\media\\cachorro.jpg")))));
                    lblImagemAlterada.updateUI();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
        getContentPane().add(btnAzul);

        btnCinza = new JButton("Tons de Cinza");
        btnCinza.setBounds(540, 10, 120, 35);
        btnCinza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                    lblImagemAlterada.setIcon(new ImageIcon(MudaCores.pretobranco(ImageIO.read(new File("src\\model\\media\\cachorro.jpg")))));
                    lblImagemAlterada.updateUI();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
        getContentPane().add(btnCinza);
        btnPretoBranco = new JButton("Preto e Branco");
        btnPretoBranco.setBounds(670, 10, 120, 35);
        btnPretoBranco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                    lblImagemAlterada.setIcon(new ImageIcon(MudaCores.pretobranco2(ImageIO.read(new File("src\\model\\media\\cachorro.jpg")))));
                    lblImagemAlterada.updateUI();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
        getContentPane().add(btnPretoBranco);

        lblImagemOriginal = new JLabel();
        lblImagemOriginal.setBounds(20, 55, 332, 300);
        try {
            lblImagemOriginal.setIcon(new ImageIcon(ImageIO.read(new File("src\\model\\media\\cachorro.jpg"))));
        } catch (Exception e) {
            System.err.println(e);
        }
        getContentPane().add(lblImagemOriginal);

        lblImagemAlterada = new JLabel();
        lblImagemAlterada.setBounds(372, 55, 332, 300);
        try {
            lblImagemAlterada.setIcon(new ImageIcon(ImageIO.read(new File("src\\model\\media\\cachorro.jpg"))));
        } catch (Exception e) {
            System.err.println(e);
        }
        getContentPane().add(lblImagemAlterada);


    }

}
