package src;

import javax.swing.JFrame;

public class Screen {
  
    public Screen(int width, int height) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setTitle("Teste 1");
    }
    public static void main(String[] args) {
        // Cria uma instância de Screen com largura 800 e altura 500
        new Screen(200, 200);
        System.out.println("Teste");
    }
}
