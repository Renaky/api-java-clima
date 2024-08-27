package view;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Executa a criação da janela na Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Cria a janela e configura suas propriedades
                Janela janela = new Janela();
                janela.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                janela.setSize(950, 900); // Define o tamanho da janela (ajuste conforme necessário)
                janela.setVisible(true); // Torna a janela visível
            }
        });
    }
}
