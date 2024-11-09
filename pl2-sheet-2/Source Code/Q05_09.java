package Sheet02PL2;

// @author Bebooo

import java.util.Scanner;

public class Q05_09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables Declaration & Initialization
        System.out.print("How many students? ");
        int h1_index = 0, h2_index = 0, n = input.nextInt();

        String[] students_names = new String[n];
        int[] students_scores = new int[n];

        // Read students data
        System.out.println("Enter your " + n + " students names, scores consecutively. "
                + "\n(Each student name must be followed by their score in a new line..)\n");
        for (int i = 0; i < n; i++) {
            students_names[i] = input.next();
            students_scores[i] = input.nextInt();
        } // for() closing

        // Return & then print the index with highest value
        for (int i = 0; i < n; i++) {
            if(n == 2 && students_scores[0] > students_scores[1]){
                h1_index = 0;
                h2_index = 1;
            }
            else if (students_scores[i] > students_scores[h1_index]) {
                h2_index = h1_index;
                h1_index = i;
            } else if (students_scores[i] > students_scores[h2_index]
                    && students_scores[i] != students_scores[h1_index]) {
                h2_index = i;
            }

        }

        System.out.println("1# Highest: " + students_names[h1_index]
                + ", " + students_scores[h1_index]);
        System.out.println("2# Highest: " + students_names[h2_index]
                + ", " + students_scores[h2_index]);
    } // answer() closing
}

/* Test Cases
TEST #1
3
tghjk
2
bvoe
4
prfb
3
..........

TEST #2
2
ff
9
uisof
30
..........

TEST #3
4
vb
6
Yz
30
xxx
90
opk
1
*/