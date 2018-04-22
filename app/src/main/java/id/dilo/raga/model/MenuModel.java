package id.dilo.raga.model;

/**
 * Created by blank15 on 12/04/2018.
 */

public class MenuModel {
    String menuTitle;
    int ImageHome;

    public MenuModel(String menuTitle, int imageHome) {
        this.menuTitle = menuTitle;
        this.ImageHome = imageHome;

    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public int getImageHome() {
        return ImageHome;
    }
}
