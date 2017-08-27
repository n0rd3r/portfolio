package norder;
import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wx {
    public Obs currentobservation;
    public Data data;
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.currentobservation.id);
        sb.append("\n");
        sb.append(this.currentobservation.name);
        sb.append("\n");
        sb.append(this.currentobservation.Date);
        sb.append("\n");
        sb.append(this.currentobservation.Temp);
        sb.append("\n");
        this.data.text.forEach(x -> {
            sb.append(x);
            sb.append("\n");
        });

        return sb.toString();
    }
}
