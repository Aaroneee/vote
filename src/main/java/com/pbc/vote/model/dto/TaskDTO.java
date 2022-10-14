package com.pbc.vote.model.dto;

import com.pbc.vote.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class TaskDTO extends Task {
    private List<Integer> userId;
}
