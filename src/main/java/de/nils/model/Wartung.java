package de.nils.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by nilsz
 * Class create at 02.12.2023 00:56
 */
@Getter
@Setter
public class Wartung {

    public UUID Id;
    public Date Start;
    public Date End;
    public String Grund;
    public List<Server> serverList;
}
