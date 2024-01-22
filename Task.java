public class Task {
    private int taskID;
    private String description;
    private String dueDate;
    private boolean status;

    public Task(int taskID, String description){
        this.taskID=taskID;
        this.description=description;
    }

    public int getTaskID(){
        return taskID;
    }

    public String getDescription(){
        return description;
    }

    public String getDueDate(){
        return getDueDate();
    }

    public boolean getStatus(){
        return status;
    }

    public void setTaskID(int taskID){
        this.taskID=taskID;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setDueDate(String dueDate){
        this.dueDate=dueDate;
    }

    public void setStatus(boolean status){
        this.status=status;
    }


}
