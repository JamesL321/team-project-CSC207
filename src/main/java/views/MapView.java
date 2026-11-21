package views;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;

import javax.swing.*;
import java.awt.*;

public class MapView extends JPanel {

    public MapView() {
        super(new BorderLayout());

        JMapViewer map = new JMapViewer(); // OpenStreetMap 
        map.setDisplayPosition(new Coordinate(43.6629, -79.3957), 14); // UofT cords

        add(map, BorderLayout.CENTER);
        setPreferredSize(new Dimension(800, 600));
    }
    public static void main(String[] args) { // Map Debug Test

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Map Demo");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.add(new MapView());
            frame.pack();
            frame.setVisible(true);
        });
    }
}
