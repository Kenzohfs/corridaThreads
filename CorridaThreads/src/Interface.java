import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interface extends JFrame implements Runnable {
    private JPanel programa;
    private JButton goButton;
    private JSlider numCorredores;
    private JSlider tempoEspera;
    private JSlider distanciaTotal;
    private JLabel vencedor;
    private JPanel corredoresProgress;
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;
    private JProgressBar progressBar3;
    private JProgressBar progressBar4;
    private JProgressBar progressBar5;
    private JProgressBar progressBar6;
    private JProgressBar progressBar7;
    private JProgressBar progressBar8;
    private JProgressBar progressBar9;
    private JProgressBar progressBar10;
    private JProgressBar progressBar11;
    private JProgressBar progressBar12;
    private JProgressBar progressBar13;
    private JProgressBar progressBar14;
    private JProgressBar progressBar15;

    public static Interface instance;

    private ArrayList<Runner> runners;

    private boolean acesso = true;

    public Interface() {
        criarComponentes();
        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runners = new ArrayList<Runner>();
                setProgressCorredores();
                setProgressBars();

                //Iniciar corrida
                for (int i = 0; i < numCorredores.getValue(); i++) {
                    //Criar corredores
                    Runner runner = new Runner(i + 1, getProgressBar(i + 1));
                    runners.add(runner);

                    //Iniciar corredores
                    runner.start();
                }
            }
        });
    }

    public static void main(String[] args) {
        Interface.instance = new Interface();
        Interface.instance.run();
    }

    public void criarComponentes() {
        setContentPane(programa);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    public void setVencedor(int id) {
        for (Runner runner : runners) {
            runner.setCorrer(false);
        }
        vencedor.setText("O vencedor é: Corredor " + id);
    }

    @Override
    public void run() {
        if (!isVisible()) {
            setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "A janela já está aberta");
        }
    }

    public void setProgressBars() {
        progressBar1.setValue(0);
        progressBar2.setValue(0);
        progressBar3.setValue(0);
        progressBar4.setValue(0);
        progressBar5.setValue(0);
        progressBar6.setValue(0);
        progressBar7.setValue(0);
        progressBar8.setValue(0);
        progressBar9.setValue(0);
        progressBar10.setValue(0);
        progressBar11.setValue(0);
        progressBar12.setValue(0);
        progressBar13.setValue(0);
        progressBar14.setValue(0);
        progressBar15.setValue(0);
    }

    public void setProgressCorredores() {
        int qtdCorredores = numCorredores.getValue();

        switch (qtdCorredores) {
            case 1 -> progressBar1.setVisible(true);
            case 2 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
            }
            case 3 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
            }
            case 4 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
            }
            case 5 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
            }
            case 6 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
                progressBar6.setVisible(true);
            }
            case 7 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
                progressBar6.setVisible(true);
                progressBar7.setVisible(true);
            }
            case 8 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
                progressBar6.setVisible(true);
                progressBar7.setVisible(true);
                progressBar8.setVisible(true);
            }
            case 9 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
                progressBar6.setVisible(true);
                progressBar7.setVisible(true);
                progressBar8.setVisible(true);
                progressBar9.setVisible(true);
            }
            case 10 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
                progressBar6.setVisible(true);
                progressBar7.setVisible(true);
                progressBar8.setVisible(true);
                progressBar9.setVisible(true);
                progressBar10.setVisible(true);
            }
            case 11 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
                progressBar6.setVisible(true);
                progressBar7.setVisible(true);
                progressBar8.setVisible(true);
                progressBar9.setVisible(true);
                progressBar10.setVisible(true);
                progressBar11.setVisible(true);
            }
            case 12 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
                progressBar6.setVisible(true);
                progressBar7.setVisible(true);
                progressBar8.setVisible(true);
                progressBar9.setVisible(true);
                progressBar10.setVisible(true);
                progressBar11.setVisible(true);
                progressBar12.setVisible(true);
            }
            case 13 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
                progressBar6.setVisible(true);
                progressBar7.setVisible(true);
                progressBar8.setVisible(true);
                progressBar9.setVisible(true);
                progressBar10.setVisible(true);
                progressBar11.setVisible(true);
                progressBar12.setVisible(true);
                progressBar13.setVisible(true);
            }
            case 14 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
                progressBar6.setVisible(true);
                progressBar7.setVisible(true);
                progressBar8.setVisible(true);
                progressBar9.setVisible(true);
                progressBar10.setVisible(true);
                progressBar11.setVisible(true);
                progressBar12.setVisible(true);
                progressBar13.setVisible(true);
                progressBar14.setVisible(true);
            }
            case 15 -> {
                progressBar1.setVisible(true);
                progressBar2.setVisible(true);
                progressBar3.setVisible(true);
                progressBar4.setVisible(true);
                progressBar5.setVisible(true);
                progressBar6.setVisible(true);
                progressBar7.setVisible(true);
                progressBar8.setVisible(true);
                progressBar9.setVisible(true);
                progressBar10.setVisible(true);
                progressBar11.setVisible(true);
                progressBar12.setVisible(true);
                progressBar13.setVisible(true);
                progressBar14.setVisible(true);
                progressBar15.setVisible(true);
            }
        }
    }

    public JSlider getTempoEspera() {
        return tempoEspera;
    }

    public JSlider getDistanciaTotal() {
        return distanciaTotal;
    }

    public JProgressBar getProgressBar(int id) {
        switch (id) {
            case 1 -> {
                return progressBar1;
            }
            case 2 -> {
                return progressBar2;
            }
            case 3 -> {
                return progressBar3;
            }
            case 4 -> {
                return progressBar4;
            }
            case 5 -> {
                return progressBar5;
            }
            case 6 -> {
                return progressBar6;
            }
            case 7 -> {
                return progressBar7;
            }
            case 8 -> {
                return progressBar8;
            }
            case 9 -> {
                return progressBar9;
            }
            case 10 -> {
                return progressBar10;
            }
            case 11 -> {
                return progressBar11;
            }
            case 12 -> {
                return progressBar12;
            }
            case 13 -> {
                return progressBar13;
            }
            case 14 -> {
                return progressBar14;
            }
            case 15 -> {
                return progressBar15;
            }
        }
        return null;
    }
}
