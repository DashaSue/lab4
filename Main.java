package ru.ifmo.se.pokemon;

import java.util.Random;
public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Hemuliha hemuliha = new Hemuliha("Хемулиха", 8, 130, true, true);
        Guests guest1 = new Guests("Гость 1", 10, 140, true, false);
        Guests guest2 = new Guests("Гость 2", 10, 140, false, false);
        UsualPosters poster1 = new UsualPosters("'Матрица'", "Квадратная", true, false, false);
        UsualPosters poster2 = new UsualPosters("'Ведьмак'", "Круглая", false, true, false);
        UsualPosters poster3 = new UsualPosters("'Холодное сердце'", "Треугольная", false, false, true);
        SpecialPoster specialPoster = new SpecialPoster("'Спец'", "Шестиугольная", false, false, true);
        SpecialPoster.Compound compound = specialPoster.new Compound();
        Guests.Home home = new Guests.Home();
        hemuliha.stayIn(hemuliha);
        hemuliha.treat(guest1);
        guest1.treat(guest1);
        guest2.treat(guest2);
        home.go();
        poster1.whirl(poster1);
        poster2.fall(poster2);
        poster3.tear(poster3);
        specialPoster.Special(Color.Black);
        compound.rot();
        specialPoster.test();
        Random random = new Random();
        class BoysOnRoof {
            int boysСount = 4;
            int boysOnRoofCount = 0;
            boolean noOneDropped = true;

            class Boy {
                boolean onRoof;
                boolean dropPiece;

                Boy() {
                    this.onRoof = random.nextBoolean();
                    if (this.onRoof) dropPiece = random.nextFloat() >= 0.9;
                }
            }

            void count() {
                Boy[] boys = new Boy[boysСount];
                for (int i = 0; i < boysСount; i++) boys[i] = new Boy();
                for (Boy boy : boys) {
                    if (boy.onRoof) boysOnRoofCount++;
                    if (boy.dropPiece) noOneDropped = false;
                }
                if (boysOnRoofCount == 0) {
                    throw new NoOneOnRoofException("There are no one on roof");
                } else {
                    float posterPart = (float) (1.0 / boysOnRoofCount);
                    System.out.println("У каждого мальчика " + posterPart + " часть постера");
                }
            }

            void assamblePoster() throws NotFullPoster {
                if (!noOneDropped) {
                    System.out.println("Кто-то потерял свою часть постера");
                    throw new NotFullPoster("Постер нецелый");
                }
            }
        }

        try {
            BoysOnRoof boysOnRoof = new BoysOnRoof();
            boysOnRoof.count();
            boysOnRoof.assamblePoster();
            System.out.println("«Одноактная драма… Heвесты льва, или… входная плата – любая еда (ай-ай!)»");
        } catch (NotFullPoster e) {
            System.out.println("Постер нельзя прочесть");
            Guests guest3 = new Guests("Мальчик", 10, 140, false, false);
            guest3.glue();
        }
    }
}
