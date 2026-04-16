class Seat {
    private int row;
    private int number;
    private boolean isBooked;

    public Seat(int row, int number, boolean isBooked) {
        setRow(row);
        setNumber(number);
        setIsBooked(isBooked);
    }

    public void setRow(int row) {
        if (row > 0) {
            this.row = row;
        } else {
            throw new IllegalArgumentException("Номер ряду не може бути від'ємним!");
        }
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Номер місця не може бути від'ємним!");
        }
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }
}


public class CinemaHall {

    private int rows;
    private int seatsPerRow;
    private Seat[][] seats;

    public CinemaHall(int rows, int seatsPerRow) {
        setRows(rows);
        setSeatsPerRow(seatsPerRow);

        this.seats = new Seat[rows][seatsPerRow];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                this.seats[i][j] = new Seat(i + 1, j + 1, false);
            }
        }


    }

    public static void main(String[] args) {

        CinemaHall cinemaHall1 = new CinemaHall(5, 5);

        cinemaHall1.bookSeat(1, 4);
        cinemaHall1.bookSeat(3, 1);
        cinemaHall1.bookSeat(5, 5);
        cinemaHall1.printSeatingPlan();
        cinemaHall1.countAvailableSeats();
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public void setSeatsPerRow(int seatsPerRow) {
        this.seatsPerRow = seatsPerRow;
    }

    public void bookSeat(int row, int seat) {
        if (row >= 1 && row <= rows && seat >= 1 && seat <= seatsPerRow) {

            Seat targerSeat = seats[row - 1][seat - 1];

            if (!targerSeat.isBooked()) {
                targerSeat.setIsBooked(true);
                System.out.println("Місце: " + seat + " у ряду: " + row + " успішно заброньованно!");
            } else {
                System.out.println("Вибачте, але це місце вже зайняте!");
            }
        } else {
            throw new IllegalArgumentException("Помилка! Введіть коректні дані!");
        }
    }

    public void cancelBooking(int row, int seat) {
        if (row >= 1 && row <= rows && seat >= 1 && seat <= seatsPerRow) {

            Seat targerSeat = seats[row - 1][seat - 1];

            if (targerSeat.isBooked()) {
                targerSeat.setIsBooked(false);
                System.out.println("Місце: " + seat + " у ряду: " + row + " бронювання успішно відміненно!");
            } else {
                System.out.println("Вибачте, але це місце ще не заброньованне!");
            }
        } else {
            throw new IllegalArgumentException("Помилка! Введіть коректні дані!");
        }
    }

    public void printSeatingPlan() {
        System.out.println("План залу");

        for (int i = 0; i < rows; i++) {
            System.out.println("Ряд: " + (i + 1) + ": ");

            for (int j = 0; j < seatsPerRow; j++) {
                if (seats[i][j].isBooked()) {
                    System.out.print("[X]");
                } else {
                    System.out.print("[]");
                }
            }
            System.out.println();
        }
    }

    public int countAvailableSeats() {

        int availableCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                if (!seats[i][j].isBooked()) {
                    availableCount++;
                }
            }
        }

        return availableCount;
    }
}
