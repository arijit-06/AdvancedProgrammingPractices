class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();
    }
}