
package ar.com.codoacodo.pokeapi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "black-white"
})

public class GenerationV {

    @JsonProperty("black-white")
    public BlackWhite blackWhite;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenerationV.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("blackWhite");
        sb.append('=');
        sb.append(((this.blackWhite == null)?"<null>":this.blackWhite));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
