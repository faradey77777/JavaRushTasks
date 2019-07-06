package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c": {
                if (args[2].equals("м")) {
                    try {
                        allPeople.add(Person.createMale(args[1], dateFormat.parse(args[3])));
                        System.out.println(allPeople.size() - 1);
                    } catch (Exception e) {
                    }
                } else if (args[2].equals("ж")) {
                    try {
                        allPeople.add(Person.createFemale(args[1], dateFormat.parse(args[3])));
                        System.out.println(allPeople.size() - 1);
                    } catch (Exception e) {
                    }
                } else return;
                break;
            }

            case "-u": {
                int idx = Integer.parseInt(args[1]);
                if (idx < args.length && args[3].equals("м")) {
                    try {
                        allPeople.add(idx, Person.createMale(args[2], dateFormat.parse(args[4])));
                        allPeople.remove(idx + 1);
                    } catch (Exception e) {
                    }
                } else if (idx < args.length && args[3].equals("ж")) {
                    try {
                        allPeople.add(idx, Person.createFemale(args[2], dateFormat.parse(args[4])));
                        allPeople.remove(idx + 1);
                    } catch (Exception e) {
                    }
                } else return;
                break;
            }

            case "-d": {
                int idx = Integer.parseInt(args[1]);

                    allPeople.get(idx).setName(null);
                    allPeople.get(idx).setBirthDate(null);
                    allPeople.get(idx).setSex(null);

                break;
            }


            case "-i": {
                int idx = Integer.parseInt(args[1]);
                if (idx < args.length && allPeople.get(idx).getSex().equals(Sex.MALE)) {
                    System.out.println(allPeople.get(idx).getName() + " м " + dateFormat1.format(allPeople.get(idx).getBirthDate()));
                } else if (idx < args.length && allPeople.get(idx).getSex().equals(Sex.FEMALE)) {
                    System.out.println(allPeople.get(idx).getName() + " ж " + dateFormat1.format(allPeople.get(idx).getBirthDate()));

                }
                break;
            }


        }

    }


}

