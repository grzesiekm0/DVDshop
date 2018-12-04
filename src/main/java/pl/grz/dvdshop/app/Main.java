package pl.grz.dvdshop.app;

import org.apache.log4j.BasicConfigurator;
import pl.grz.dvdshop.ui.ListDVDFrame;

/**
 * Created by Manager on 2018.11.14.
 */
public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        new ListDVDFrame();
    }
}


