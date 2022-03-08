package com.company;

import Elements.*;
public class Main {

    public static void main(String[] args) {

        Time time = new Time();

        System.out.println();

        Ridge cubes = new Ridge("Кубы", "Лёгкий архейский кварцит", "равномерность");
        Ridge cave = new Ridge("Пещеры", "Лёгкий архейский кварцит", "чередование");
        Ridge fortification = new Ridge("Крепостные валы", "Лёгкий архейский кварцит", "равномерность");
        Ridge pick = new Ridge("Мрачные вершины", "Обнаженная порода", "равномерность");
        Ridge figure = new Ridge("Геометрически верные фигуры", "Обнаженная порода", "равномерность");
        Ridge[] ridges00 = new Ridge[]{cubes, cave, fortification};
        Ridge[] ridges01 = new Ridge[]{pick, figure};
        Ridge[] ridges02 = new Ridge[]{};

        System.out.println();

        for (Ridge ridge : ridges00) {
            time.harm(ridge);
        }

        System.out.println();

        Storyteller storyteller = new Storyteller("Рассказчик");
        Denfort denfort = new Denfort("Денфорт");
        Person lake = new Person("Лейк");
        Person carroll = new Person("Кэрролл");

        PibodysRecords pibodysRecords = new PibodysRecords( "Записи Пэбоди");
        pibodysRecords.action(storyteller, ridges02);
        pibodysRecords.action(denfort, ridges02);

        Sextant sextant = new Sextant("Секстант");
        sextant.action(storyteller, ridges02);

        System.out.println();

        Plane plane = new Plane("Хребет Безумия");

        Cloth cloth = new Cloth("одежда");
        cloth.action(storyteller,ridges02);
        cloth.action(denfort,ridges02);

        System.out.println();

        PlaneCheckException.checkEqup("");

        System.out.println();

        storyteller.setState(State.FROZE);
        storyteller.setState(State.VACUUM);
        denfort.setState(State.FROZE);
        denfort.setState(State.VACUUM);
        lake.setState(State.FROZE);
        lake.setState(State.VACUUM);
        carroll.setState(State.FROZE);
        carroll.setState(State.VACUUM);

        System.out.println();

        Binoculars binoculars = new Binoculars("бинокль");
        binoculars.ActionWithoutThink(storyteller, ridges01);
        storyteller.think("похоже на загадочные картины Николая Рериха");

        System.out.println();



        System.out.println();

        plane.setPilots(denfort, storyteller);
        plane.setPassengers(carroll, lake);

        System.out.println();

        denfort.drivePlane(plane);
        binoculars.ActionWithThink(storyteller, ridges00);
        plane.aircamera.makePhoto(storyteller);
        plane.aircamera.makePhoto(storyteller);
        plane.changePilots();
        storyteller.drivePlane(plane);
        binoculars.ActionWithThink(denfort, ridges00);
        plane.changePilots();

        System.out.println();

        denfort.think(cave);
        storyteller.think(cubes);
        lake.think(fortification);

        System.out.println();

        cubes.lookLike("развалины Мачу Пикчу");
        fortification.lookLike("крепостные стены Киша");

        System.out.println();

        storyteller.think(cubes, "всё состоит из отдельных глыб");
        denfort.think(cubes, "всё определённо состоит из отдельных глыб");

        System.out.println();

        carroll.think(cubes, "всё точно состоит из отдельных глыб");
        storyteller.think("не могу дать объяснение всему происходящему..");
        storyteller.setState(State.SHAMED);
    }
}