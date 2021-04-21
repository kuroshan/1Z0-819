import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

    static void invokeAll() throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            Callable<Double> task = () -> Math.random();
            List<Future<Double>> list = service.invokeAll(List.of(task, task, task));

            for (Future<Double> future : list) {
                System.out.println(future.get());
            }
            System.out.println("end");
        } finally {
            if (service != null)
                service.shutdown();
        }
    }

    static void invokeAny() throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            Callable<Double> task = () -> Math.random();
            Double number = service.invokeAny(List.of(task, task, task));

            System.out.println(number);
            System.out.println("end");
        } finally {
            if (service != null)
                service.shutdown();
        }
    }

    public static void main(String[] args) throws Exception {
        invokeAll();
        invokeAny();
    }
}
