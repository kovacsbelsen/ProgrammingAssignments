import java.util.Scanner;

public class ChristmasHearts {
    private int userInput;
    private int height;
    private int width;
    String topHeart = "";
    String middleHeart = "";
    String bottomHeart = "";

    public ChristmasHearts(int input) {
        this.userInput = input;
    }

    public void draw() {
        calcWidthAndHeight(this.userInput);
        drawTopOfHeart();
        drawBottomOfHeart();
    }

    private void drawTopOfHeart() {
        int whites = 0;
        int blacks = 1;
        int center = 1;
        int heightOfTopHeart = 1;
        int isEvenCenterLessSubtractor = 2;
        int isNotEvenCenterLessSubtractor = 1;

        if (this.userInput == 1) {
            for (int i = 0; i < heightOfTopHeart; i++) {
                this.topHeart += "♥";
                this.topHeart += "♡";
                this.topHeart += "♥";
            }
            System.out.println(topHeart);
        } else {
            whites = this.userInput - 1;
            blacks = this.userInput;
            center = this.userInput;
            heightOfTopHeart = this.userInput - 1;

            for (int i = 0; i < heightOfTopHeart; i++) {
                for (int j = 0; j < whites; j++) {
                    this.topHeart += "♡";
                }

                for (int j = 0; j < blacks; j++) {
                    this.topHeart += "♥";
                }

                for (int j = 0; j < center; j++) {
                    this.topHeart += "♡";
                }

                if (this.userInput >= 5 && center <= 0) {
                    if (isEven(this.userInput) && center == 0) {
                        for (int j = 0; j < blacks; j++) {
                            this.topHeart += "♥";
                        }
                    } else if (isEven(this.userInput) && center < 0) {
                        int rightSideBlacks = blacks - isEvenCenterLessSubtractor;

                        for (int j = 0; j < rightSideBlacks; j++) {
                            this.topHeart += "♥";
                        }
                        isEvenCenterLessSubtractor += 2;
                    } else if (!isEven(this.userInput) && center < 0) {
                        int rightSideBlacks = blacks - isNotEvenCenterLessSubtractor;

                        for (int j = 0; j < rightSideBlacks; j++) {
                            this.topHeart += "♥";
                        }
                        isNotEvenCenterLessSubtractor += 2;
                    } else {
                        int factorToSubtract = 2;
                        int rightSideBlacks = blacks - factorToSubtract;

                        for (int j = 0; j < rightSideBlacks; j++) {
                            this.topHeart += "♥";
                        }
                        factorToSubtract += 2;
                    }
                } else {
                    for (int j = 0; j < blacks; j++) {
                        this.topHeart += "♥";
                    }
                }

                for (int j = 0; j < whites; j++) {
                    this.topHeart += "♡";
                }

                whites -= 1;
                blacks += 2;
                center -= 2;

                if (this.userInput == 0) {
                    this.topHeart = "";
                }
                System.out.println(topHeart);
                topHeart = "";
            }
        }
    }

    private void drawMiddelOfHeart() {
        for (int j = 0; j < this.width; j++) {
            this.middleHeart += "♥";
        }

        if (this.userInput == 0) {
            this.middleHeart = "";
        }

        System.out.println(this.middleHeart);
        middleHeart = "";
    }

    private void drawBottomOfHeart() {
        int whites = 1;
        int blacks = 1;
        int heightOfBottomHeart = 1;

        if (this.userInput == 1) {
            for (int i = 0; i < heightOfBottomHeart; i++) {
                this.bottomHeart += "♡";
                this.bottomHeart += "♥";
                this.bottomHeart += "♡";
            }
            System.out.println(bottomHeart);

        } else {
            heightOfBottomHeart = this.height - this.userInput;
            whites = 1;
            blacks = this.width - 2;

            drawMiddelOfHeart();
            for (int i = 0; i < heightOfBottomHeart; i++) {

                for (int j = 0; j < whites; j++) {
                    this.bottomHeart += "♡";
                }

                for (int j = 0; j < blacks; j++) {
                    this.bottomHeart += "♥";
                }

                for (int j = 0; j < whites; j++) {
                    this.bottomHeart += "♡";
                }

                blacks -= 2;
                whites += 1;

                if (this.userInput == 0) {
                    this.bottomHeart = "";
                }
                System.out.println(bottomHeart);
                bottomHeart = "";
            }
        }
    }

    private boolean isEven(int n) {
        return n % 2 == 0;
    }

    private void calcWidthAndHeight(int n) {
        this.width = 3;
        this.height = 2;

        for (int counter = 1; counter <= (n - 1); counter++) {
            this.width += 5;

            if (isEven(counter)) {
                this.height += 4;
            } else {
                this.height += 3;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        scanner.close();

        ChristmasHearts heart = new ChristmasHearts(input);
        heart.draw();
    }
}