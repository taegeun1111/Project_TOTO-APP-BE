package com.example.todo.todoapi.dto.reponse;

import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoListResponseDTO {
    private String error;   //에러발생시 에러메세지를 담은 필드
    private List<TodoDetailResponseDTO> todos;
}
