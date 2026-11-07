package com.example.studytask;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TASKSUBMISSIONS extends Activity {

    private boolean isSubmitted = true;
    private String submissionStatus = "Completed";
    private boolean isOverdue = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the correct Task Submission layout
        setContentView(R.layout.activity_tasksubmissions);

        TextView statusText =
                findViewById(R.id.txtSubmissionStatus);

        TextView submittedText =
                findViewById(R.id.txtIsSubmitted);

        TextView overdueText =
                findViewById(R.id.txtIsOverdue);

        Button detailsButton =
                findViewById(R.id.btnViewDetails);

        // Check that all required views exist
        if (statusText == null
                || submittedText == null
                || overdueText == null
                || detailsButton == null) {

            Toast.makeText(
                    this,
                    "Error: Check the IDs in activity_tasksusbmission.xml",
                    Toast.LENGTH_LONG
            ).show();

            return;
        }

        // Submission status
        statusText.setText(submissionStatus);
        statusText.setTextColor(
                isSubmitted
                        ? Color.rgb(21, 128, 61)
                        : Color.rgb(220, 38, 38)
        );

        // Submitted status
        submittedText.setText(isSubmitted ? "Yes" : "No");
        submittedText.setTextColor(
                isSubmitted
                        ? Color.rgb(21, 128, 61)
                        : Color.rgb(220, 38, 38)
        );

        // Overdue status
        overdueText.setText(isOverdue ? "Yes" : "No");
        overdueText.setTextColor(
                isOverdue
                        ? Color.rgb(220, 38, 38)
                        : Color.rgb(21, 128, 61)
        );

        // View task details
        detailsButton.setOnClickListener(v ->
                Toast.makeText(
                        TASKSUBMISSIONS.this,
                        "Status: " + submissionStatus,
                        Toast.LENGTH_SHORT
                ).show()
        );
    }
}