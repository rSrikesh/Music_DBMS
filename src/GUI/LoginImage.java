package GUI;

import java.awt.*;

public class LoginImage extends Canvas{

    public void paint(Graphics g) {

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("src//images//bg.png");
        g.drawImage(i, 330,-30,this);

    }
}
