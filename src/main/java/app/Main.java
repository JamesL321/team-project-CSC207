package app;

import views.MapView;
import javax.swing.*;

public class Main { // Does not adhere to SOLID as is, this is placeholder to launch the application, should be adjusted according to SOLID.

    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("StravaClone");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(new MapView());

        frame.pack();
        frame.setVisible(true);
    }

public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }
}
