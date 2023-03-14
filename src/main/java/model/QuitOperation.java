package model;

public class QuitOperation implements CanvasOperation{
    @Override
    public void execute (Canvas canvas) {
        System.exit(0);
    }
}
