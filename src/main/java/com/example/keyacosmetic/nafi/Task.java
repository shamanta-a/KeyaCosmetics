public class Task {
    private int taskId;
    private String status;
    private String assignedTo;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Task(int taskId, String status, String assignedTo) {
        this.taskId = taskId;
        this.status = status;
        this.assignedTo = assignedTo;


    }
}
