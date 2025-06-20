package org.zerock.todoapp.todo.service;



import org.zerock.todoapp.common.dto.PageRequestDTO;
import org.zerock.todoapp.common.dto.PageResponseDTO;
import org.zerock.todoapp.todo.dto.TodoDTO;

import java.util.List;

// TodoService클래스를 만들기 위한 설계도
public interface TodoService {
    void register(TodoDTO todoDTO);
    List<TodoDTO> getAll();
    TodoDTO getOne(Long tno);
    void removeTodo(Long tno);
    String editTodo(TodoDTO todoDTO);
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);
}









