import javax.swing.*;
import java.awt.*;

public class ChristmasTree extends JPanel {

    private int levels;

    public ChristmasTree(int levels) {
        this.levels = levels;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int baseX = panelWidth / 2;
        int baseY = 50;

        for (int i = 0; i < levels; i++) {
            int width = (i * 2 + 1) * 10;
            int height = 20;
            int x = baseX - width / 2;
            int y = baseY + i * height;

            g2d.setColor(new Color(34, 139, 34));
            g2d.fillPolygon(new int[]{x, baseX, x + width}, new int[]{y + height, y, y + height}, 3);

            g2d.setColor(Color.RED);
            for (int j = 0; j < i + 1; j++) {
                int ornamentX = x + 10 + (int) (Math.random() * (width - 20));
                int ornamentY = y + (int) (Math.random() * height);
                g2d.fillOval(ornamentX, ornamentY, 5, 5);
            }
        }

        g2d.setColor(Color.YELLOW);
        int starSize = 20;
        g2d.fillPolygon(
                new int[]{baseX, baseX - starSize / 2, baseX + starSize / 2},
                new int[]{baseY - starSize, baseY, baseY},
                3
        );

        int trunkWidth = 20;
        int trunkHeight = 30;
        g2d.setColor(new Color(139, 69, 19));
        g2d.fillRect(baseX - trunkWidth / 2, baseY + levels * 20, trunkWidth, trunkHeight);
    }
}