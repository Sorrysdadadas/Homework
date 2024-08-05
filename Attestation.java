import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Attestation {


        public static void main(String[] args) {
            getInfoFromUser();



        }

        public static void getInfoFromUser(){
            try {

                Scanner sc = new Scanner(System.in);
                System.out.println("Введите имя:  ");
                String name = sc.nextLine();
                System.out.println("Введите вашу фамилию: ");
                String surname = sc.nextLine();
                String path = surname;
                System.out.println("Введите ваше отчество: ");
                String otch = sc.nextLine();
                System.out.println("Введите дату рождения в формате дд.мм.гггг с пробелами, например: 28 10 1997: ");
                String dateofbirth = sc.nextLine();
                if (dateofbirth.length() != 10){
                    throw new RuntimeException("Введите валидные данные");
                }

                System.out.println("Введите ваш номер телефона( целое беззнаковое число без форматирования, с пробелами, например: 7 896 067 98 56): ");
                String numberPhone = sc.nextLine();
                if (numberPhone.length() == 15) {
                    sc.nextLine();
                }
                else
                    throw new RuntimeException("Введите валидные данные");


                System.out.println("Введите ваш пол(одной буквой, f или m): ");
                String gender = sc.nextLine();
                if (gender.length() == 2) {
                    System.out.println("Вы должны вписать одну букву");
                }
                List<Object> list = List.of(name, surname, otch,  dateofbirth, numberPhone, gender );
                writeInFile(surname, list);







            }
            catch (Exception e) {
                throw new NumberFormatException("Вводите правильный формат данных пожалуйста!");

            }



        }
        public static void writeInFile(String path, List<Object> list){
            FileWriter fw = null;
            try{
                fw = new FileWriter(path);
                for (Object o : list){
                    fw.write(o + "\n");
                }
                fw.flush();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }



}
