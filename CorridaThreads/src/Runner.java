import javax.swing.*;

public class Runner extends Thread{
    private Integer id;
    private JProgressBar progressBar;
    private boolean correr = true;

    public Runner(int id, JProgressBar progressBar) {
        this.id = id;
        this.progressBar = progressBar;
    }

    @Override
    public void run() {
        while (correr) {
            try {
                //Bota a thread para dormir
                Thread.sleep(Interface.instance.getTempoEspera().getValue());

                //Incrementar slider
                progressBar.setValue(progressBar.getValue() + setProgressNewValue(
                        Interface.instance.getDistanciaTotal().getValue()
                ));

                //Verifica se chegou ao final
                if (progressBar.getValue() >= 100) {
                    Interface.instance.setVencedor(id);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int setProgressNewValue(int progessMaxValue) {
        int newValue = (int) (Math.random() * 100);

        return (int) (newValue * 100 / progessMaxValue / 10);
    }

    public void setCorrer(boolean correr) {
        this.correr = correr;
    }
}
