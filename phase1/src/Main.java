import Controller.*;

public class Main {
    public static void main(String[] args) {
        ShellController shell = new ShellController();
        while (true) {
            shell.run();
        }
    }
}
