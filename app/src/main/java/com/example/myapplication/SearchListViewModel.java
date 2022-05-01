package com.example.myapplication;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class SearchListViewModel{ /*extends AndroidViewModel {

    private LiveData<List<SearchListItem>> searchListItems;
    private final SearchListItemDao searchListItemDao;

    public SearchListViewModel(@NonNull Application application){
        super(application);
        Context context = getApplication().getApplicationContext();
        TodoDatabase db = TodoDatabase.getSingleton(context);
        todoListItemDao = db.todoListItemDao();
    }

    public LiveData<List<TodoListItem>> getTodoListItems(){
        if(todoListItems == null){
            loadUsers();
        }
        return todoListItems;
    }

    public void loadUsers(){
        todoListItems = todoListItemDao.getAllLive();
    }

    public void toggleCompleted(TodoListItem todoListItem){
        todoListItem.completed = !todoListItem.completed;
        todoListItemDao.update(todoListItem);
    }

    public void updateText(TodoListItem todoListItem, String newText){
        todoListItem.text = newText;
        todoListItemDao.update(todoListItem);
    }

    public void createTodo(String text){
        int endOfListOrder = todoListItemDao.getOrderForAppend();
        TodoListItem newItem = new TodoListItem(text, false, endOfListOrder);
        todoListItemDao.insert(newItem);
    }

    public void deleteTodo(TodoListItem todoListItem){
        todoListItems.getValue().clear();
        todoListItemDao.delete(todoListItem);
    }

*/
}