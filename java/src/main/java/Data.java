package norder;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.*;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    public ArrayList<String> text;
}
