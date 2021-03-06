package net.avalith.elections.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BodyCandidate {
    private String name;
    private String lastName;
    private int individualVotes;
}
