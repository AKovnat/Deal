package by.academy.homework2;

import java.util.Scanner;

public class Homework2Task4 {

    public static void main(String[] args) {


        int cardsPlayer = 5;

        int players = 0;


        String[] suits = {"���", "�����", "����", "����"};

        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "�����", "��������", "������", "���"};


        int n = suits.length * rank.length;


        for (; ; ) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("������� ���������� �������: ");

            if (scanner.hasNextInt()) {

                players = scanner.nextInt();

                if (players == 0) {

                    System.out.println("���� ����������.");

                    break;

                }

                if (players < 0) {

                    System.out.println("����� ������� �� ����� ���� ������ 0");

                    break;

                }

                if (cardsPlayer * players <= n) {

                    break;

                } else {

                    System.out.println("������� ����� �������!");

                }

            } else {

                System.out.println("�� ����� �� �����!");

            }

        }



        String[] deck = new String[n];

        for (int i = 0; i < rank.length; i++) {

            for (int j = 0; j < suits.length; j++) {

                deck[suits.length * i + j] = rank[i] + " " + suits[j];

            }

        }


        for (int i = 0; i < n; i++) {

            int r = i + (int) (Math.random() * (n - i));

            String temp = deck[r];

            deck[r] = deck[i];

            deck[i] = temp;

        }


        for (int i = 0; i < players * cardsPlayer; i++) {

            System.out.println(deck[i]);

            if (i % cardsPlayer == cardsPlayer - 1)

                System.out.println();

        }

    }

}

