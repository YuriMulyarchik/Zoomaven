import animals.Animals;
import animals.Birds;
import animals.Fish;
import animals.Mammals;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
//test

public class Zoo {
    public static void main(String[] args) {

        Birds eagle = new Birds("Орел", "хищник");
        Birds parrot = new Birds("Попугай","травоядный");
        Birds owl = new Birds("Сова","хищник");

        ArrayList<Animals> birds = new ArrayList<>();

        birds.add(eagle);
        birds.add(parrot);
        birds.add(owl);

        Fish goldfish = new Fish("Золотая рыбка", "всеядная");
        Fish shark = new Fish("Акула", "хищник");
        Fish tuna = new Fish("Тунец", "хищник");

        ArrayList<Animals> fish = new ArrayList<>();

        fish.add(goldfish);
        fish.add(shark);
        fish.add(tuna);

        Mammals elephant = new Mammals("Слон", "травоядный");
        Mammals lion = new Mammals("Лев", "хищник");
        Mammals bear = new Mammals("Медведь", "всеядный");

        ArrayList<Animals> mammals = new ArrayList<>();

        mammals.add(elephant);
        mammals.add(lion);
        mammals.add(bear);

        getMenuOne();
        boolean switcher = true;
        while (switcher) {
            Scanner scan = new Scanner(System.in);
            try {
                switch (scan.nextInt()) {
                    case 1:
                        getMenuTwo();
                        boolean switcherTwo = true;
                        while (switcherTwo) {
                            Scanner scanTwo = new Scanner(System.in);
                            try {
                                switch (scanTwo.nextInt()) {
                                    case 1:
                                        getMenuThree(mammals);
                                        System.out.println("Для возврата нажмите 0");
                                        boolean switcherThree = true;
                                        while (switcherThree) {
                                            Scanner scanThree = new Scanner(System.in);
                                            try {
                                                switch (scanThree.nextInt()) {
                                                    case 1:
                                                        System.out.println(elephant);
                                                        getMenuThree(mammals);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                    case 2:
                                                        System.out.println(lion);
                                                        getMenuThree(mammals);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                    case 3:
                                                        System.out.println(bear);
                                                        getMenuThree(mammals);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                    case 0:
                                                        switcherThree = false;
                                                        getMenuTwo();
                                                        break;
                                                    default:
                                                        getMenuThree(mammals);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                }
                                            } catch (InputMismatchException e) {
                                                getMenuThree(mammals);
                                                System.out.println("Для возврата нажмите 0");
                                            }
                                        }

                                        System.out.println("Для возврата нажмите 0");
                                        continue;
                                    case 2:
                                        getMenuThree(birds);//list birds
                                        System.out.println("Для возврата нажмите 0");
                                        boolean switcherFour = true;
                                        while (switcherFour) {
                                            Scanner scanThree = new Scanner(System.in);
                                            try {
                                                switch (scanThree.nextInt()) {
                                                    case 1:
                                                        System.out.println(eagle);
                                                        getMenuThree(birds);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                    case 2:
                                                        System.out.println(parrot);
                                                        getMenuThree(birds);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                    case 3:
                                                        System.out.println(owl);
                                                        getMenuThree(birds);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                    case 0:
                                                        switcherFour = false;
                                                        getMenuTwo();

                                                        break;
                                                    default:
                                                        getMenuThree(birds);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                }
                                            } catch (InputMismatchException e) {
                                                getMenuThree(birds);
                                                System.out.println("Для возврата нажмите 0");
                                            }
                                        }
                                        System.out.println("Для возврата нажмите 0");
                                        continue;
                                    case 3:
                                        getMenuThree(fish);
                                        System.out.println("Для возврата нажмите 0");
                                        boolean switcherFive = true;
                                        while (switcherFive) {
                                            Scanner scanThree = new Scanner(System.in);
                                            try {
                                                switch (scanThree.nextInt()) {
                                                    case 1:
                                                        System.out.println(goldfish);
                                                        getMenuThree(fish);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                    case 2:
                                                        System.out.println(shark);
                                                        getMenuThree(fish);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                    case 3:
                                                        System.out.println(tuna);
                                                        getMenuThree(fish);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                    case 0:
                                                        switcherFive = false;
                                                        getMenuTwo();
                                                        break;
                                                    default:
                                                        getMenuThree(fish);
                                                        System.out.println("Для возврата нажмите 0");
                                                        continue;
                                                }
                                            } catch (InputMismatchException e) {
                                                getMenuThree(fish);
                                                System.out.println("Для возврата нажмите 0");
                                            }
                                        }
                                        System.out.println("Для возврата нажмите 0");
                                        continue;
                                    case 0:
                                        switcherTwo = false;
                                        getMenuOne();
                                        break;
                                    default:
                                        getMenuTwo();
                                        continue;
                                }
                            } catch (InputMismatchException e) {
                                getMenuTwo();
                            }
                        }
                        continue;
                    case 0:
                        switcher = false;
                        break;
                    default:
                        getMenuOne();
                        continue;
                }
            } catch (InputMismatchException e) {
                getMenuOne();
            }
        }


    }

    public static void getMenuOne() {
        System.out.println("Введите 1 или 0\n1. Зоопарк\n0. Выход");
    }

    public static void getMenuTwo() {
        System.out.println("Введите цифру от 1 до 3 или 0 для возврата в предыдущее меню\n1. Млекопитающие\n2. Птицы" +
                "\n3. Рыбы\n0. Назад");
    }
    private static void getMenuThree(ArrayList<Animals> animals){

        for (int i =0; i<animals.size(); i++)
            System.out.println((i + 1) + ". " + animals.get(i).getAnimalName());
    }



}

