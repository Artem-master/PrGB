import java.util.Random;
import java.util.Scanner;

public class XO {
    public static final char DotX = 'X';
    public static final char DotO = 'O';
    public static final char DotEmpty = '.';
    public static char [][] map;
    public static final int SizeMap = 3;
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Игра крестики нолики!");
        InitMap();
        while (true) {
            PrintMap();
            HumGamer();
            if (Win(DotX)) {
                System.out.println("Победа человека. Ниже представлен результат игры");
                PrintMap();
                break;
            }
            if (FullMap()){
                System.out.println("Ничья. Ниже представлен результат игры");
                PrintMap();
                break;
            }
            PrintMap();
            CompGamer();
            if (Win(DotO)) {
                System.out.println("Победил комп. Ниже представлен результат игры");
                PrintMap();
                break;
            }
            if (FullMap()) {
                System.out.println("Ничья. Ниже представлен результат игры");
                PrintMap();
                break;
            }
        }
        System.out.println("Конец");
    }

    public static void InitMap () {
        map = new char[SizeMap][SizeMap];
        for (int i = 0; i < SizeMap; i++) {
            for (int j = 0; j < SizeMap; j++) {
                map[i][j] = DotEmpty;
            }
        }
    }
    public static void PrintMap () {
        for (int i = 0; i <= SizeMap; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SizeMap; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < SizeMap; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean Valid (int x, int y) {
        if (x < 0 || x >= SizeMap || y < 0 || y >= SizeMap) {
            return false;
        } else if (map [x][y] == DotEmpty) {
            return true;
        }
        return false;
    }
    public static boolean FullMap () {
        for (int i = 0; i < SizeMap; i++) {
            for (int j = 0; j < SizeMap; i++) {
                if (map [i][j] == DotEmpty) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void HumGamer () {
        int x, y;
        do {
            System.out.println("Введите координаты Y и X");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!Valid(x, y));
        map [x][y] = DotX;
        System.out.println();
    }
    public static void CompGamer () {
        int x, y;
        do {
            x = random.nextInt(SizeMap);
            y = random.nextInt(SizeMap);
        } while (!Valid(x, y));
        map [x][y] = DotO;
        System.out.println();
    }
    public static boolean Win (char symb) {
        for (int i = 0; i < SizeMap; i++) {

                   } return false;
//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
    }

}
