
package ar.com.codoacodo.pokeapi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "omegaruby-alphasapphire",
    "x-y"
})

public class GenerationVi {

    @JsonProperty("omegaruby-alphasapphire")
    public OmegarubyAlphasapphire omegarubyAlphasapphire;
    @JsonProperty("x-y")
    public XY xY;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenerationVi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("omegarubyAlphasapphire");
        sb.append('=');
        sb.append(((this.omegarubyAlphasapphire == null)?"<null>":this.omegarubyAlphasapphire));
        sb.append(',');
        sb.append("xY");
        sb.append('=');
        sb.append(((this.xY == null)?"<null>":this.xY));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
