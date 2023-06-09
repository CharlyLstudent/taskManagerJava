import org.example.Task;
import org.example.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskListTest {
    @Test
    public void testAdd() {
        TaskList test = new TaskList();
        test.add(1,"toto",false);
        //contient bien une tache et que ce soit la bonne tâche
        Assertions.assertEquals(1, test.getTaskList().size());
        //get index de la task, puis test aussi identifier, description, state
        Task addedTask = test.getTaskList().get(0);
        Assertions.assertEquals(1, addedTask.getIdentifier());
        Assertions.assertEquals("toto", addedTask.getDescription());
        Assertions.assertFalse(addedTask.isState());
    }

    @Test
    public void testRemove(){
        TaskList test = new TaskList();
        test.add(1,"toto",false);
        test.add(5,"tata",false);
        test.add(27,"titi",false);
        test.delete(1);
        Assertions.assertEquals(2, test.getTaskList().size());

        Assertions.assertEquals(5, test.getTaskList().get(0).getIdentifier());
        Assertions.assertEquals(27, test.getTaskList().get(1).getIdentifier());
    }

    @Test
    public void testUpdate(){
        TaskList test = new TaskList();
        test.add(1,"toto",false);
        test.add(5,"tata",true);

        test.update(1);
        test.update(5);
        Assertions.assertTrue(test.getTaskList().get(0).isState());
        Assertions.assertFalse(test.getTaskList().get(1).isState());

    }
}
