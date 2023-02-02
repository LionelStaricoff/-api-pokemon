
package ar.com.codoacodo.pokeapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "red-blue",
    "yellow"
})

public class GenerationI {

    @JsonProperty("red-blue")
    public RedBlue redBlue;
    @JsonProperty("yellow")
    public Yellow yellow;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenerationI.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("redBlue");
        sb.append('=');
        sb.append(((this.redBlue == null)?"<null>":this.redBlue));
        sb.append(',');
        sb.append("yellow");
        sb.append('=');
        sb.append(((this.yellow == null)?"<null>":this.yellow));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
