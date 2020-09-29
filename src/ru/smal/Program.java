package ru.smal;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя");
        String name = reader.readLine();
        System.out.println("Введите возраст");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Введите дату");
        int date = Integer.parseInt(reader.readLine());

        Person person = new Person(name, age, date);

        System.out.println(isEmptyPerson(person));


    }
    public static String isEmptyPerson(Person person){
        String err = "";
        if(person.getName().isEmpty()) err += "Имя не заполнено ";
        if(person.getAge() == 0) err += "Возраст не заполнен ";
        if(person.getDate() == 0) err += "Дата не заполнена";

        if(!err.isEmpty()) {
            return err;
        }

        return "Вы инициализировали " + person.getClass();
    }
}
