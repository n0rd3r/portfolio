package norder;
import com.fasterxml.jackson.annotation.*;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Obs {
    public String id;
    public String name;
    public String Date;
    public String Temp;
}
