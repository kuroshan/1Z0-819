import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> linked = new LinkedList<>();
        Queue<Integer> array = new ArrayDeque<>();

        System.out.println(linked.offer(10)); //true
        System.out.println(linked.offer(4)); //true
        System.out.println(linked.peek()); //10
        System.out.println(linked.poll()); //10
        System.out.println(linked.poll()); //4
        System.out.println(linked.peek()); //null
        
    }
}
