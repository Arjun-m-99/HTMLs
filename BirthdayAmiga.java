import java.util.ArrayList;
import java.util.List;

class BirthdayAmiga {
    public static void main(String[] args) throws InterruptedException {
        BirthdayAmiga wish = new BirthdayAmiga();
        wish.birthdayWish();
        cake1();

    }

    public void birthdayWish() throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        int time = 500;
        list.add(/* ðŸŽŠ ðŸŽŠ ðŸŽ‰ ðŸŽˆ */ "Wish you a many more happy returns of the day dear Best Friend" /*
                                                                                                             * bestie
                                                                                                             * ðŸ¥³ ðŸŽˆ
                                                                                                             * ðŸ¥³ ðŸŽ‰
                                                                                                             * ðŸŽ‰ ðŸŽŠ
                                                                                                             * "
                                                                                                             */);

        list.add("keep smiling ðŸ˜Š and stay strong"/* ðŸ’ª" */);

        list.add("I'll always value my friendship with you, from now until the end of time.");

        list.add("I know yar, I irritate you sometimes a lot hehe kaani tappadhu yar naa bestie vi kadha bharinchu ");

        // list.add("yar U know, ur the one I'm sharing a lot of things and secrets with
        // out any trust issues");

        list.add(
                "and one more yar, life is combination  so never loose hope at any situation yar and don't fade ur smile ðŸ˜Š");

        list.add("I'm so lucky to have such a kind of unique person like you ðŸ’• ");

        list.add("- - - -  Stay blessed and Keep Smiling yar."/* " ðŸ’œ  - - -" */);

        list.add("Neekosam cake evvana, sare aagu ....");

        list.add(
                "\n --------------cake prepare avuthundi------------ \n __/\\_-^-_/\\_-^-_/\\_-^-_/\\_-^-_/\\_-^-_/\\_-^-_/ \n want to see the cake \n sare \n ready ");

        list.add("3");
        list.add("2");
        list.add("1");
        list.add("0");

        list.add("Edhigo yar cake");

        list.add("[_-i-_]");

        list.add("yela vundi cheppu....");

        list.add("hehehe nachchindha yar!");

        list.add("---once again Happy Birthday yar---");

        for (String wish : list) {
            String[] arrOfStr = wish.split(" ");

            anime();
            System.out.print(" ");
            for (String a : arrOfStr) {
                char[] ch = new char[a.length()];
                for (int i = 0; i < a.length(); i++) {
                    ch[i] = a.charAt(i);
                }
                for (char c : ch) {
                    System.out.print(c);
                    Thread.sleep(100);
                }
                System.out.print(" ");

            }
            anime1();
            System.out.println("");
            Thread.sleep(time);
        }
    }

    public static void anime() throws InterruptedException {
        int i = 0;
        while (i < 1) {
            i++;
            String[] s = { ":", ")" };
            for (String string : s) {
                System.out.print(string);
                Thread.sleep(200);
            }
        }

    }

    public static void anime1() throws InterruptedException {
        int i = 0;
        while (i < 1) {
            i++;
            String[] s = { "(", ":" };
            for (String string : s) {
                System.out.print(string);
                Thread.sleep(200);
            }
        }

    }

    public static void cake1() throws InterruptedException {
        String[] s = { "                0   0", "                |   |", "            ____|___|____",
                "         0  |~ ~ ~ ~ ~ ~|   0", "         |  |           |   |", "      ___|__|___________|___|__",
                "      |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\|", "  0   |      | | | | | |      |   0",
                "  |   |/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/|   |", " _|___|_______________________|___|__",
                "|/\\/\\/\\/\\/\\   H A P P Y    /\\/\\/\\/\\/|", "|          B i r t h d a y          |",
                "|             A M I G A             |", "| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ |",
                "|___________________________________|" };
        for (String cake : s) {

            char[] ch = new char[cake.length()];
            for (int i = 0; i < cake.length(); i++) {
                ch[i] = cake.charAt(i);
            }
            for (char c : ch) {
                System.out.print(c);
                Thread.sleep(30);
            }
            System.out.println(" ");

        }
    }
}