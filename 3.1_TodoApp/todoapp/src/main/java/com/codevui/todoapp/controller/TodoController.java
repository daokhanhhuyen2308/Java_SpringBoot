package com.codevui.todoapp.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codevui.todoapp.entity.Todo;
import com.codevui.todoapp.service.TodoService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TodoController {
    //ta thấy thằng controller ràng buộc với thằng service thông qua interface có nghĩa là thằng controller k cần biết thằng
    //service này sẽ thực hiện như nào miễn là thằng service này có đủ các cái hàm
    private final TodoService todoService;
    
    @GetMapping("/list-todo")
    public String listTodo(Model model){
        //lấy listTodo ở cái database lên xem có bao nhiêu cái công việc cần làm
       List<Todo> listTodos =  todoService.getAllTodo();
       //luu gia tri cua listTodos vao trong context cua Thymeleaf thong qua Model sau do moi View cho ng dung xem
       model.addAttribute("listTodos", listTodos);
        return "todo/listTodo";
    }
    @PostMapping(value = "/add-todo")
    public String appTodo(HttpServletRequest request){
        String title = request.getParameter("title");
        todoService.addTodo(title);
        return "redirect:/list-todo";
    }
    @GetMapping("/delete-todo")
    public String deleteTodo(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        todoService.deleteTodo(id);
        return "redirect:/list-todo";
    }
    //cho them value vao cung duoc
     @GetMapping("/complete-todo")
    public String toggleTodo(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        todoService.toggleTodo(id);
        return "redirect:/list-todo";


    }
}
