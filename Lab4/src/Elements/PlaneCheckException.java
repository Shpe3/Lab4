package Elements;

public class PlaneCheckException {

    public static class PlaneIsNotReadyException extends Exception {
        public PlaneIsNotReadyException(String message) {
            super(message);
        }
    }

    String name;
    boolean isEqupPutOn;

    public PlaneCheckException(String name) {this.name = name;}

    public void isEqupPutOn() {
        this.isEqupPutOn = true;
    }

    public static void checkEqup(String args) {
        PlaneCheckException check = new PlaneCheckException("");
        check.isEqupPutOn();
        try {
            check.takeOff();
        } catch (PlaneCheckException.PlaneIsNotReadyException e) {
            System.out.println(e.getMessage());
            System. exit(0);
        }
    }

    public void takeOff() throws PlaneCheckException.PlaneIsNotReadyException {
        if (isEqupPutOn) {
            System.out.println("Самолет загружен\nСамолет взлетел");
        } else {
            throw new PlaneCheckException.PlaneIsNotReadyException("Самолет не загружен\nСамолет не взлетел");
        }
    }
}
