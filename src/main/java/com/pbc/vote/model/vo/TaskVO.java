package com.pbc.vote.model.vo;

import com.pbc.vote.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class TaskVO extends Task {
    private String testUser;
}
