
class Task implements Callable<Integer> {
  @Override
  public Integer call() {
      int n = 0;
      for(int i = 0; i < 100; i++) { n += i; }
      return n;
  }
}

public class Test {
  public static void main(String args[]) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    Callable c = new Task();
    Future<Long> future = executor.submit(c);
    try {
        Long result = future.get(); //waits for the thread to complete
        System.out.println(result);
    } catch (ExecutionException e) {
        e.printStackTrace();
    }
    executor.shutdown();
  }
}
public class Test {
  public static void main(String args[]) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    Callable c = new Callable<Integer>() {
      public Integer call() {
          int n = 0;
          for(int i = 0; i < 100; i++) { n += i; }
          return n;
      }
    };
    Future<Long> future = executor.submit(c);
    try {
        Long result = future.get(); //waits for the thread to complete
        System.out.println(result);
    } catch (ExecutionException e) {
        e.printStackTrace();
    }
    executor.shutdown();
  }
}
public class Test {
  public static void main(String args[]) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    Callable c = () -> {
          int n = 0;
          for(int i = 0; i < 100; i++) { n += i; }
          return n;
      };
    Future<Long> future = executor.submit(c);
    try {
        Long result = future.get(); //waits for the thread to complete
        System.out.println(result);
    } catch (ExecutionException e) {
        e.printStackTrace();
    }
    executor.shutdown();
  }
}
// Creates an Executor that uses a single worker thread operating off an unbounded queue.
ExecutorService es1 = Executors.newSingleThreadExecutor();
// Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue.
ExecutorService es2 = Executors.newFixedThreadPool(10);
// Creates a thread pool that can schedule commands to run after a given delay, or to execute periodically.
ExecutorService es3 = Executors.newScheduledThreadPool(10);

executorService.execute(new Runnable() {
    public void run() {
        System.out.println("A task");
    }
});
executorService.shutdown();

Future future = executorService.submit(new Runnable() {
    public void run() {
        System.out.println("A task");
    }
});
future.get(); //Blocks until the Runnable has finished
executorService.shutdown();

Future future = executorService.submit(new Callable<String>() {
    public String call() {
        return "A callable";
    }
});
System.out.println(future.get()); //Blocks until the Callable has finished
executorService.shutdown();

List<Callable<String>> callables = new ArrayList<Callable<String>>();
callables.add(new Callable<String>() {
    public String call() {
        return "Callable 1";
    }
});
callables.add(new Callable<String>() {
    public String call() {
        return "Callable 2";
    }
});
callables.add(new Callable<String>() {
    public String call() {
        return "Callable 3";
    }
});
String result = executorService.invokeAny(callables);
System.out.println(result);
executorService.shutdown();