package org.example;

import model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    private static Canvas canvas;
    private static CanvasOperationExecutor executor= new CanvasOperationExecutor(canvas);

   public static void main (String[] args) throws Exception
   {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      while(true)
        {
            String input = bufferedReader.readLine().trim();
            String[] inputs = input.split(" ");
            String command = inputs[0];
            System.out.println("command is  : " +command );
            switch(command)
            {
                case "C":
                    canvas  = new Canvas(inputs);
                    canvas.getCanvas();
                    System.out.println(canvas.getCanvas());
                    executor.setCanvas(canvas);
                    break;
                case "Q":
                    executor.executeOperation(new QuitOperation());
                    break;

                case "L":
                    LineOperation lineOperation = new LineOperation(inputs);
                    executor.executeOperation(lineOperation);
                    System.out.println(canvas.getShapeAsString());
                    break;

                case "R":
                    RectangleOperation recatangleOperation = new RectangleOperation(inputs);
                    executor.executeOperation(recatangleOperation);
                    break;

            }




    }
}
}