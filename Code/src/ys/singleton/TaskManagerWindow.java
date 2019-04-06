package ys.singleton;

public class TaskManagerWindow {
    private static TaskManagerWindow tmw=new TaskManagerWindow();
    public static TaskManagerWindow getInstance(){
        return tmw;
    }
    private TaskManagerWindow(){
        System.out.println("任务管理器创建成功");
    }
    public void show(){
        System.out.println("任务管理器显示");
    }
}
