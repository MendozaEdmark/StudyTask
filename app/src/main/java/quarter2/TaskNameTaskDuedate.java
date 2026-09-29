package quarter2;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studytask.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class TaskNameTaskDuedate extends AppCompatActivity {

    private EditText etTaskName;
    private EditText etDueDate;
    private ArrayList<String> taskList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTaskName = findViewById(R.id.etTaskName);
        etDueDate = findViewById(R.id.etDueDate);
        Button btnPickDate = findViewById(R.id.btnPickDate);
        Button btnAddTask = findViewById(R.id.btnAddTask);
        ListView lvTasks = findViewById(R.id.lvTasks);

        taskList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, taskList);
        lvTasks.setAdapter(adapter);

        btnPickDate.setOnClickListener(v -> takeDueDate());
        btnAddTask.setOnClickListener(v -> addTask());
    }

    private void addTask() {
        String name = takeTaskName();
        String dueDate = takeDueDateInput();

        if (name.isEmpty()) {
            etTaskName.setError("Enter a task name");
            etTaskName.requestFocus();
            return;
        }
        if (dueDate.isEmpty()) {
            etDueDate.setError("Enter a due date");
            etDueDate.requestFocus();
            return;
        }

        taskList.add(name + "  (Due: " + dueDate + ")");
        adapter.notifyDataSetChanged();

        etTaskName.setText("");
        etDueDate.setText("");
        etTaskName.requestFocus();
        Toast.makeText(this, "Task added", Toast.LENGTH_SHORT).show();
    }

    private String takeTaskName() {
        return etTaskName.getText().toString().trim();
    }

    private String takeDueDateInput() {
        return etDueDate.getText().toString().trim();
    }

    private void takeDueDate() {
        Calendar cal = Calendar.getInstance();
        DatePickerDialog dialog = new DatePickerDialog(
                this,
                (view, year, month, day) -> {
                    String selectedDate = String.format(Locale.getDefault(),
                            "%04d-%02d-%02d", year, month + 1, day);
                    etDueDate.setText(selectedDate);
                    etDueDate.setError(null);
                },
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH));
        dialog.show();
    }
}
