package org.miu.edu.david.springboot;

import org.miu.edu.david.springboot.Model.Patient;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        var patients = List.of(new Patient(12,"David","Peter","233","Saka@gmail.com","1990-02-23"),
                new Patient(13,"Paul","John","244","paul@gmail.cm", "1990-03-23"),
                new Patient(14,"Stephen","Ken","2443","kenka@gmail.cm", "1990-04-23"));
        patients.forEach(System.out::println);
    }

}