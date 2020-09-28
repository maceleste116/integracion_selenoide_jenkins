package qa.util;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class SortAtributo {

    public List<String> sortAscAtributo(List<String> firstColumnAsc){

        Collections.sort(firstColumnAsc);

        //System.out.println(firstColumn);
        System.out.println(firstColumnAsc);
        return firstColumnAsc;

    }

    public List<String> sortDescAtributo(List<String> firstColumnDesc){

        Collections.sort(firstColumnDesc,Collections.reverseOrder() );
        return firstColumnDesc;

    }
}
