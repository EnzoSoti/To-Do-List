public class Main {

    public static void main(String[] args) {

        int i, space, rows = 10;
        // the pyramid has 10 rows


        // This loop controls the number of rows.
        // It starts from i = 0 and goes up to i = 9, so it runs 10 times (one for each row).
        for(i = 0; i < rows; i++ ){

            // This loop prints spaces before the stars in each row.
            // The number of spaces decreases as the row number increases.
            // On the first row, it prints 10 spaces, then 9 on the second row, and so on.
            for(space = rows; space > i; space--){
                System.out.print(" ");
            }
            // This loop prints the stars in each row.
            // The number of stars increases with each row.
            // The first row has 1 star, the second row has 2 stars,
            // and this continues until the last row has 10 stars.
            for(space = 0; space <= i; space++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

