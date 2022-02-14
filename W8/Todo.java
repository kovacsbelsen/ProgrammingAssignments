import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Todo implements Comparator<Task>{
    
    List<Task> tasks = new ArrayList<>();
    String desc;
    int pr;
    int min;
    int total;

    public Todo(){}

    public void addTask(String description, int priority, int minutes){

        desc = description;
        pr = priority;
        min = minutes;

        Task task = new Task(desc , pr, min);
        if (priority < 1 || priority > 4) {
            System.out.println(description+" has invalid priority");
        }
        if (minutes < 0) {
            System.out.println(description+" has invalid workload");
        }
        else {
            tasks.add(task);
        }

    }

    public void print() {
        int n = tasks.size();

        if (n == 0) {
            System.out.println("Todo:");
            System.out.println("-----");
            System.out.println("You're all done for today! #TodoZero");
            if (total > 0) {
                System.out.println(total +" minutes of work done!");
                }
        }
        
        else {
        System.out.println("Todo:");
        System.out.println("-----");
            for (int i = 0; i < n; i++) {
                System.out.println(tasks.get(i));
            }
        if (total > 0) {
            System.out.println(total +" minutes of work done!");
            }
        }
    }

    public void completeTask(int index) {
        //index = index -1;
        int n = tasks.size();
        if (index >= n || index < 0) {
            System.out.println("Invalid index");
        }
        else {
            //System.out.println(tasks.get(index));
            total = total + tasks.get(index).time;
            tasks.remove(index);
        }

    }

    public void printPriority(int limit) {
        System.out.println("Filtered todo:");
        System.out.println("--------------");
        int n = tasks.size();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (tasks.get(i).prior <= limit){
                System.out.println(tasks.get(i));
                counter++;
            }      
        }
        if (counter == 0) {
            System.out.println("No tasks with given priority");
        }
        counter = 0;
    }


    public void printPrioritized() {
        int n = tasks.size();

        System.out.println("Prioritized todo:");
        System.out.println("-----------------");

        tasks.sort(Comparator.comparingInt(Task::getPrior).thenComparingInt(Task::getTime));

        for (int i = 0; i < n; i++) {
            System.out.println(tasks.get(i));
        }

    }


    @Override
    public int compare(Task o1, Task o2) {
        // TODO Auto-generated method stub
        return 0;
    }   
    
}
