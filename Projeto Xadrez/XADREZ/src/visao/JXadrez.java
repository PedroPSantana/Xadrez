package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.EnumCor;
import modelo.Tabuleiro;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class JXadrez extends JFrame {

    private static JLabel lbVez;
    private Tabuleiro tabuleiro;
    private JButton btReiniciar;
    

    public JXadrez() {
        setTitle("Bem-Vindo ao Jogo de Xadrez");
        this.setLayout(new BorderLayout());
        this.tabuleiro = new Tabuleiro();
        this.add(new JTabuleiro(tabuleiro), BorderLayout.CENTER);



        JPanel pnTopo = new JPanel();
        JLabel lbVez = new JLabel("Considerar: Bispos do canto como [torre] e cavalo no meio como [rainha]");
        pnTopo.add(lbVez);
        this.add(pnTopo, BorderLayout.NORTH);

        JPanel pnLateral = new JPanel();
        pnLateral.setLayout(new GridLayout(1, 10));
        btReiniciar = new JButton("Bom jogo");
        pnLateral.add(btReiniciar);

        this.add(pnLateral, BorderLayout.WEST);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }

    public static void setVez(EnumCor corVez) {
          lbVez.setText("Vez de: " + corVez);
    }

    public static void main(String args[]) {
        new JXadrez();
    }

}
