package ys.singleton;

public class Main {
    public static void click(){
        TaskManagerWindow tmw=TaskManagerWindow.getInstance();
        tmw.show();
    }

    public static void main(String[] args) {
        click();
        click();
    }
}
