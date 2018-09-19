package examples.option;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Bengt {

    public static void main(String[] args) {

        List<String> bengtList = Collections.emptyList();
        bengtList.stream().map( (it) -> it.toUpperCase() );

        Optional<String> bengtOption = Optional.ofNullable(null);
        bengtOption.map( (it) -> it.toUpperCase() );

    }
}
