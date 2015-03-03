package com.inventoryKMA.entities;

public class Email{
	private String html;
	private Task task;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}
}
