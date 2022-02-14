public class Task {

    public String task;
    public String order;
    public int time;
    public int prior;
    
    public Task(String description, int priority, int minutes) {

        prior = priority;
        task = description;
        time = minutes;
        switch (priority) {
            case 1:
                order = "very important";
                break;
            case 2:
                order = "important";
                break;
            case 3:
                order = "unimportant";
                break;
            case 4:
                order = "after learn Portuguese";
                break;
        }
    }

    public String toString(){
        //System.out.println(task + " takes " + time + " minutes and has priority " + order);
        return task + " takes " + time + " minutes and has priority " + order;
    }

    public int getTime(){
        return time;
    }

    public int getPrior(){
        return prior;
    }
}
