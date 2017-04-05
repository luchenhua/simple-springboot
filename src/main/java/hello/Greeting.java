package hello;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by luchenhua on 05/04/2017.
 */
@Data
@AllArgsConstructor
public class Greeting implements Serializable {

    private final long id;
    private final String content;
}
