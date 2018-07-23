package model;

import android.widget.EditText;
import android.widget.TextView;

public class ToDoItem {
    private TextView listTitle;
    private EditText itemTitle;
    private TextView dueOn;
    private EditText actualDueDate;
    private TextView location;
    private EditText actualLocation;
    private TextView assignedTo;
    private EditText assignee;
    private TextView toDoDetails;
    private EditText actualToDoDetails;

    public ToDoItem() {
    }

    public TextView getListTitle() {
        return listTitle;
    }

    public void setListTitle(TextView listTitle) {
        this.listTitle = listTitle;
    }

    public EditText getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(EditText itemTitle) {
        this.itemTitle = itemTitle;
    }

    public TextView getDueOn() {
        return dueOn;
    }

    public void setDueOn(TextView dueOn) {
        this.dueOn = dueOn;
    }

    public EditText getActualDueDate() {
        return actualDueDate;
    }

    public void setActualDueDate(EditText actualDueDate) {
        this.actualDueDate = actualDueDate;
    }

    public TextView getLocation() {
        return location;
    }

    public void setLocation(TextView location) {
        this.location = location;
    }

    public EditText getActualLocation() {
        return actualLocation;
    }

    public void setActualLocation(EditText actualLocation) {
        this.actualLocation = actualLocation;
    }

    public TextView getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(TextView assignedTo) {
        this.assignedTo = assignedTo;
    }

    public EditText getAssignee() {
        return assignee;
    }

    public void setAssignee(EditText assignee) {
        this.assignee = assignee;
    }

    public TextView getToDoDetails() {
        return toDoDetails;
    }

    public void setToDoDetails(TextView toDoDetails) {
        this.toDoDetails = toDoDetails;
    }

    public EditText getActualToDoDetails() {
        return actualToDoDetails;
    }

    public void setActualToDoDetails(EditText actualToDoDetails) {
        this.actualToDoDetails = actualToDoDetails;
    }
}
