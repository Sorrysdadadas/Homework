package Attestation_OOP;

import java.util.Objects;
import java.util.Scanner;

public class Presenter {
    View view;
    Model model;
    public Presenter(View v, Model m) {
        model = m;
        view = v;

    }
    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        System.out.println("Выберите дейсвтие: умножение, деление, или сложение.");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (Objects.equals(answer, "сложение")){
            int result = model.result();
            view.print(result, "Sum: " );
        }
        if (Objects.equals(answer, "умножение")){
            int result1 = model.result1();
            view.print(result1, "Result: " );
        }
        if (Objects.equals(answer, "деление")){
            int result2 = model.result2();
            view.print(result2, "Result: " );
        }

    }
}
