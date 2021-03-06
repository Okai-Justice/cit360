public void testRunWithFeed() {
    Alerter mockAlerter=mock(Alerter.class);
    Task task=new Task(mockAlerter);
    Thread thread =new Thread(task);
    thread.start();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    task.stop();
    try {
        thread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    verify(mockAlerter,atLeastOnce()).alert();
    verify(mockAlerter,never()).harmless();

}


public void testRunNoFeed() {
    Alerter mockAlerter=mock(Alerter.class);
    Task task=new Task(mockAlerter);
    Thread thread =new Thread(task);
    thread.start();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    changeFileSize();
    try {
        Thread.sleep(6000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    task.stop();
    try {
        thread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    verify(mockAlerter,atLeastOnce()).alert();
    verify(mockAlerter,atLeastOnce()).harmless();

}