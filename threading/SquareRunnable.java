class SquareRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
            try { Thread.sleep(400); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new SquareRunnable());
        t.start();
    }
}