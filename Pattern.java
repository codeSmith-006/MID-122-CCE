Star Patterns

1. Right-Angled Triangle

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

*
* *
* * *
* * * *
* * * * *


---

2. Inverted Right-Angled Triangle

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

* * * * *
* * * *
* * *
* *
*


---

3. Pyramid

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*
   ***
  *****
 *******
*********


---

4. Diamond

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


---

🔹 Number Patterns

5. Right-Angled Number Triangle

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5


---

6. Inverted Number Triangle

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1


---

7. Floyd’s Triangle

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


---

8. Pascal’s Triangle

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n-i; s++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1


---

🔹 Alphabet Patterns

9. Alphabet Triangle

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}

A
B B
C C C
D D D D
E E E E E


---

10. Inverted Alphabet Triangle

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'E';
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch--;
            System.out.println();
        }
    }
}

E E E E E
D D D D
C C C
B B
A

