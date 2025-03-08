

class BMSdisplay extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("BMS College of Engineering");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e);
            }
        }

    }
}

class CSEdisplay extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("CSE");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e);
            }
        }

    }
}

class BMSthread {
    public static void main(String[] args) {
        System.out.println("Name: CHARAN G\nUSN: 1BM22CS078\n\n");
        BMSdisplay bms = new BMSdisplay();
        CSEdisplay cse = new CSEdisplay();

        bms.start();
        cse.start();

    }
}

