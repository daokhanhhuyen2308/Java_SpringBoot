package com.codevui.todoapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codevui.todoapp.entity.Todo;
import com.codevui.todoapp.repository.TodoRepository;
import com.codevui.todoapp.service.TodoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{
    //trước khi nó giao việc cho thằng repository thì nó phải đi xử lý logic nghiệp vụ trước đã
    public static int increase = 0;

    private final TodoRepository todoRepository;
    // todoRepository.findAll().forEach(System.out::println);
    
    public void addTodo(String title) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todo.setCompleted(false);
        //add cái thằng todo này vào cái database cho tao 
        todoRepository.save(todo);
        
    }
    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }
    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }
    public void toggleTodo(int id) {
        Todo oldTodo = todoRepository.findById(id).get();
        oldTodo.setCompleted(!oldTodo.isCompleted());
        todoRepository.save(oldTodo);
    }
    
}
