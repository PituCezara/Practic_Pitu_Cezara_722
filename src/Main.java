//package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final ObjectMapper mapper = new ObjectMapper();
    //ex1
    public static ArrayList<Fahrer> readDriversFromJson(String fileName) {
        try {
            List<Fahrer> list = mapper.readValue(
                    new File(fileName),
                    new TypeReference<List<Fahrer>>() {}
            );
            return new ArrayList<>(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static ArrayList<RennenEreignis> readEventsFromJson(String fileName) {
        try {
            List<RennenEreignis> list = mapper.readValue(
                    new File(fileName),
                    new TypeReference<List<RennenEreignis>>() {}
            );
            return new ArrayList<>(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static ArrayList<Strafe> readPenaltiesFromJson(String fileName) {
        try {
            List<Strafe> list = mapper.readValue(
                    new File(fileName),
                    new TypeReference<List<Strafe>>() {}
            );
            return new ArrayList<>(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {

        String driversPath = "drivers.json";
        String eventsPath = "events.json";
        String penaltiesPath = "penalties.json";

        ArrayList<Fahrer> fahrerListe = readDriversFromJson(driversPath);
        ArrayList<RennenEreignis> ereignisse = readEventsFromJson(eventsPath);
        ArrayList<Strafe> strafen = readPenaltiesFromJson(penaltiesPath);

        // EX 1 (cum ai avut)
        System.out.println("Drivers loaded: " + fahrerListe.size());
        System.out.println("Events loaded: " + ereignisse.size());
        System.out.println("Penalties loaded: " + strafen.size());

        for (Fahrer f : fahrerListe) {
            System.out.println(f);
        }

        // ex2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input team: ");
        String inputTeam = scanner.nextLine();

        for (Fahrer f : fahrerListe) {
            if (f.getTeam().equals(inputTeam) && f.getStatus() == FahrerStatus.ACTIVE) {
                System.out.println(f);
            }
        }
    }
}
